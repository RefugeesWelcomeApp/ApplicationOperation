package ra.httpProxy;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.net.URI;
import java.util.BitSet;
import java.util.Enumeration;
import java.util.Formatter;

/**
 * An HTTP reverse proxy/gateway servlet based on the ProxyServlet from David Smiley dsmiley@mitre.org
 * but simplified and modified to fit for our on-same-server-file-accessing needs.
 * For the original code, see https://github.com/mitre/HTTP-Proxy-Servlet
 */
public class ProxyServlet extends HttpServlet {

  /* INIT PARAMETER NAME CONSTANTS */

    /** The parameter name for the target (destination) URI to proxy to. */
    protected static final String ATTR_TARGET_HOST = "http://ddc.derpy.ws";

    private HttpClient proxyClient;

    @Override
    public void init() throws ServletException {
        HttpParams hcParams = new BasicHttpParams();
        hcParams.setParameter(ClientPNames.COOKIE_POLICY, CookiePolicy.IGNORE_COOKIES);
        hcParams.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, false); // See #70
        proxyClient = createHttpClient(hcParams);
    }


    /** Called from {@link #init(javax.servlet.ServletConfig)}. HttpClient offers many opportunities
     * for customization. By default,
     * <a href="http://hc.apache.org/httpcomponents-client-ga/httpclient/apidocs/org/apache/http/impl/client/SystemDefaultHttpClient.html">
     *   SystemDefaultHttpClient</a> is used if available, otherwise it falls
     * back to:
     * <pre>new DefaultHttpClient(new ThreadSafeClientConnManager(),hcParams)</pre>
     * SystemDefaultHttpClient uses PoolingClientConnectionManager. In any case, it should be thread-safe. */
    @SuppressWarnings({"unchecked", "deprecation"})
    protected HttpClient createHttpClient(HttpParams hcParams) {
        try {
            //as of HttpComponents v4.2, this class is better since it uses System
            // Properties:
            Class clientClazz = Class.forName("org.apache.http.impl.client.SystemDefaultHttpClient");
            Constructor constructor = clientClazz.getConstructor(HttpParams.class);
            return (HttpClient) constructor.newInstance(hcParams);
        } catch (ClassNotFoundException e) {
            //no problem; use v4.1 below
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Fallback on using older client:
        return new DefaultHttpClient(new ThreadSafeClientConnManager(), hcParams);
    }

    /** The http client used.
     * @see #createHttpClient(HttpParams) */
    protected HttpClient getProxyClient() {
        return proxyClient;
    }


    @Override
    public void destroy() {
        //As of HttpComponents v4.3, clients implement closeable
        if (proxyClient instanceof Closeable) {//TODO AutoCloseable in Java 1.6
            try {
                ((Closeable) proxyClient).close();
            } catch (IOException e) {
                log("While destroying servlet, shutting down HttpClient: "+e, e);
            }
        } else {
            //Older releases require we do this:
            if (proxyClient != null)
                proxyClient.getConnectionManager().shutdown();
        }
        super.destroy();
    }

    @Override
    protected void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse)
            throws ServletException, IOException {

        // Make the Request
        //note: we won't transfer the protocol version because I'm not sure it would truly be compatible
        String method = servletRequest.getMethod();
        //spec: RFC 2616, sec 4.3: either of these two headers signal that there is a message body.



        HttpResponse proxyResponse = null;
        try {
            // Execute the request
            String sUrlBuilder = ATTR_TARGET_HOST + servletRequest.getRequestURI().replaceFirst("/w/","/media_wiki/");
            proxyResponse = proxyClient.execute(new HttpGet(sUrlBuilder));

            // Process the response:

            // Pass the response code. This method with the "reason phrase" is deprecated but it's the
            //   only way to pass the reason along too.
            int statusCode = proxyResponse.getStatusLine().getStatusCode();
            //noinspection deprecation
            servletResponse.setStatus(statusCode, proxyResponse.getStatusLine().getReasonPhrase());

            // Copying response headers to make sure SESSIONID or other Cookie which comes from the remote
            // server will be saved in client when the proxied url was redirected to another one.
            // See issue [#51](https://github.com/mitre/HTTP-Proxy-Servlet/issues/51)
            copyResponseHeaders(proxyResponse, servletRequest, servletResponse);

            if (statusCode == HttpServletResponse.SC_NOT_MODIFIED) {
                // 304 needs special handling.  See:
                // http://www.ics.uci.edu/pub/ietf/http/rfc1945.html#Code304
                // Don't send body entity/content!
                servletResponse.setIntHeader(HttpHeaders.CONTENT_LENGTH, 0);
            } else {
                // Send the content to the client
                copyResponseEntity(proxyResponse, servletResponse, servletRequest);
            }

        } catch (Exception e) {
            if (e instanceof RuntimeException)
                throw (RuntimeException)e;
            if (e instanceof ServletException)
                throw (ServletException)e;
            //noinspection ConstantConditions
            if (e instanceof IOException)
                throw (IOException) e;
            throw new RuntimeException(e);

        } finally {
            // make sure the entire entity was consumed, so the connection is released
            if (proxyResponse != null)
                consumeQuietly(proxyResponse.getEntity());
            //Note: Don't need to close servlet outputStream:
            // http://stackoverflow.com/questions/1159168/should-one-call-close-on-httpservletresponse-getoutputstream-getwriter
        }
    }

    private HttpRequest newProxyRequestWithEntity(String method, String proxyRequestUri,
                                                  HttpServletRequest servletRequest)
            throws IOException {
        HttpEntityEnclosingRequest eProxyRequest =
                new BasicHttpEntityEnclosingRequest(method, proxyRequestUri);
        // Add the input entity (streamed)
        //  note: we don't bother ensuring we close the servletInputStream since the container handles it
        eProxyRequest.setEntity(
                new InputStreamEntity(servletRequest.getInputStream(), servletRequest.getContentLength()));
        return eProxyRequest;
    }

    protected void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            log(e.getMessage(), e);
        }
    }

    protected void consumeQuietly(HttpEntity entity) {
        try {
            EntityUtils.consume(entity);
        } catch (IOException e) {//ignore
            log(e.getMessage(), e);
        }
    }

    /** These are the "hop-by-hop" headers that should not be copied.
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec13.html
     * I use an HttpClient HeaderGroup class instead of Set<String> because this
     * approach does case insensitive lookup faster.
     */
    protected static final HeaderGroup hopByHopHeaders;
    static {
        hopByHopHeaders = new HeaderGroup();
        String[] headers = new String[] {
                "Connection", "Keep-Alive", "Proxy-Authenticate", "Proxy-Authorization",
                "TE", "Trailers", "Transfer-Encoding", "Upgrade" };
        for (String header : headers) {
            hopByHopHeaders.addHeader(new BasicHeader(header, null));
        }
    }

    /** Copy request headers from the servlet client to the proxy request. */
    protected void copyRequestHeaders(HttpServletRequest servletRequest, HttpRequest proxyRequest) {
        // Get an Enumeration of all of the header names sent by the client
        Enumeration enumerationOfHeaderNames = servletRequest.getHeaderNames();
        while (enumerationOfHeaderNames.hasMoreElements()) {
            String headerName = (String) enumerationOfHeaderNames.nextElement();
            copyRequestHeader(servletRequest, proxyRequest, headerName);
        }
    }

    /**
     * Copy a request header from the servlet client to the proxy request.
     * This is easily overwritten to filter out certain headers if desired.
     */
    protected void copyRequestHeader(HttpServletRequest servletRequest, HttpRequest proxyRequest,
                                     String headerName) {
        //Instead the content-length is effectively set via InputStreamEntity
        if (headerName.equalsIgnoreCase(HttpHeaders.CONTENT_LENGTH))
            return;
        if (hopByHopHeaders.containsHeader(headerName))
            return;

        Enumeration headers = servletRequest.getHeaders(headerName);
        while (headers.hasMoreElements()) {//sometimes more than one value
            String headerValue = (String) headers.nextElement();
            // In case the proxy host is running multiple virtual servers,
            // rewrite the Host header to ensure that we get content from
            // the correct virtual server
            if (headerName.equalsIgnoreCase(HttpHeaders.HOST)) {
                headerValue = ATTR_TARGET_HOST;
            }
            proxyRequest.addHeader(headerName, headerValue);
        }
    }

    /** Copy proxied response headers back to the servlet client. */
    protected void copyResponseHeaders(HttpResponse proxyResponse, HttpServletRequest servletRequest,
                                       HttpServletResponse servletResponse) {
        for (Header header : proxyResponse.getAllHeaders()) {
            copyResponseHeader(servletRequest, servletResponse, header);
        }
    }

    /** Copy a proxied response header back to the servlet client.
     * This is easily overwritten to filter out certain headers if desired.
     */
    protected void copyResponseHeader(HttpServletRequest servletRequest,
                                      HttpServletResponse servletResponse, Header header) {
        String headerName = header.getName();
        if (hopByHopHeaders.containsHeader(headerName))
            return;
        String headerValue = header.getValue();
    }

    /** Copy response body data (the entity) from the proxy to the servlet client. */
    protected void copyResponseEntity(HttpResponse proxyResponse, HttpServletResponse servletResponse,
                                      HttpServletRequest servletRequest)
            throws IOException {
        HttpEntity entity = proxyResponse.getEntity();
        if (entity != null) {
            OutputStream servletOutputStream = servletResponse.getOutputStream();
            entity.writeTo(servletOutputStream);
        }
    }

    protected String rewriteQueryStringFromRequest(HttpServletRequest servletRequest, String queryString) {
        return queryString;
    }

    /**
     * Encodes characters in the query or fragment part of the URI.
     *
     * <p>Unfortunately, an incoming URI sometimes has characters disallowed by the spec.  HttpClient
     * insists that the outgoing proxied request has a valid URI because it uses Java's {@link URI}.
     * To be more forgiving, we must escape the problematic characters.  See the URI class for the
     * spec.
     *
     * @param in example: name=value&foo=bar#fragment
     */
    protected static CharSequence encodeUriQuery(CharSequence in) {
        //Note that I can't simply use URI.java to encode because it will escape pre-existing escaped things.
        StringBuilder outBuf = null;
        Formatter formatter = null;
        for(int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            boolean escape = true;
            if (c < 128) {
                if (asciiQueryChars.get((int)c)) {
                    escape = false;
                }
            } else if (!Character.isISOControl(c) && !Character.isSpaceChar(c)) {//not-ascii
                escape = false;
            }
            if (!escape) {
                if (outBuf != null)
                    outBuf.append(c);
            } else {
                //escape
                if (outBuf == null) {
                    outBuf = new StringBuilder(in.length() + 5*3);
                    outBuf.append(in,0,i);
                    formatter = new Formatter(outBuf);
                }
                //leading %, 0 padded, width 2, capital hex
                formatter.format("%%%02X",(int)c);//TODO
            }
        }
        return outBuf != null ? outBuf : in;
    }

    protected static final BitSet asciiQueryChars;
    static {
        char[] c_unreserved = "_-!.~'()*".toCharArray();//plus alphanum
        char[] c_punct = ",;:$&+=".toCharArray();
        char[] c_reserved = "?/[]@".toCharArray();//plus punct

        asciiQueryChars = new BitSet(128);
        for(char c = 'a'; c <= 'z'; c++) asciiQueryChars.set((int)c);
        for(char c = 'A'; c <= 'Z'; c++) asciiQueryChars.set((int)c);
        for(char c = '0'; c <= '9'; c++) asciiQueryChars.set((int)c);
        for(char c : c_unreserved) asciiQueryChars.set((int)c);
        for(char c : c_punct) asciiQueryChars.set((int)c);
        for(char c : c_reserved) asciiQueryChars.set((int)c);

        asciiQueryChars.set((int)'%');//leave existing percent escapes in place
    }

}
