package ra.mediaWiki;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPConnect {
    private URL url;
    private HttpURLConnection httpcon;

    private String content;
    private InputStream is;
    private String headerAgent;

    public HTTPConnect(String url, String headerAgent) throws IOException {
        URLParser parser = new URLParser(url);
        this.headerAgent = headerAgent;
        if (parser.checkURLConform()) {
            if (!url.contains("/api.php?action=query&list=search&srsearch="))
            {this.url = new URL(parser.getJSONUrl());}
            else
            {this.url = new URL(url);}
            openConnection();
            this.is = getHttpcon().getInputStream();
            setContent();
        }
        else
            System.out.println("URL NOT CONFORM");
        //TODO Err Handling
    }

    private void openConnection() throws IOException {
        this.httpcon = (HttpURLConnection) this.url.openConnection();
        this.httpcon.addRequestProperty("User-Agent", this.headerAgent);
    }

    private HttpURLConnection getHttpcon() {
        return httpcon;
    }

    private void setContent() throws IOException {
        this.content = IOUtils.toString(this.is, "UTF-8");
        fixContentWikiURLs();
    }

    public String getContent() {
        return content;
    }

    private void fixContentWikiURLs(){
        content = content.replaceAll("\\/media_wiki\\/","\\/w\\/");
        content = content.replaceAll("index.php?title=","&action=edit&redlink=1");
    }
}
