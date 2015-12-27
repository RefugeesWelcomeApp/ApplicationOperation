package ra.mediaWiki;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPConnect {
    private URL url;
    private HttpURLConnection httpcon;

    private final static String headerAgent = "Mozilla/4.76";

    private String content;
    private InputStream is;

    public HTTPConnect(String url) throws IOException {
        URLParser parser = new URLParser(url);
        if (parser.checkURLConform()) {
            this.url = new URL(parser.getJSONUrl());
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
        this.httpcon.addRequestProperty("User-Agent", headerAgent);
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
    }
}
