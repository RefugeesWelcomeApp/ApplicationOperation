package ra.mediaWiki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLParser {
    private final static String decodedStart = "https://ddc.derpy.ws/w:";
    private final static String encodedStart = "https://ddc.derpy.ws/media_wiki/";
    private final static String jsonURLStart = "https://ddc.derpy.ws/media_wiki/api.php?action=parse&page=";
    private final static String jsonURLEnde = "&format=json";

    private final static String regExPatternDecoded = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/w:([A-z]{2})\\/([A-z0-9]+)$";
    private final static String regExPatternEncoded = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/media_wiki\\/([A-z0-9]+)\\/([A-z]{2})$";
    //private final static String regExPatternEncoded = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/media_wiki\\/([A-z]{2}):([A-z0-9]+)$";

    private String url;
    private String titel;
    private String language;

    public URLParser(String url) {
        int flags = Pattern.MULTILINE | Pattern.UNICODE_CHARACTER_CLASS;
        Pattern pattern = Pattern.compile(regExPatternEncoded, flags);
        Matcher regExMatcher = pattern.matcher(url);
        if (regExMatcher.find()) {
            this.titel = regExMatcher.group(1);
            language = regExMatcher.group(2);
            this.url = decodedStart + language + "/" + this.titel;
        }

        else {
            pattern = Pattern.compile(regExPatternDecoded, flags);
            regExMatcher = pattern.matcher(url);
            if (regExMatcher.find()) {
                this.titel = regExMatcher.group(2);
                language = regExMatcher.group(1);
                this.url = encodedStart + this.titel + "/" + this.language;
            }
            else
                this.url = "Not Conformed URL";
        }
    }

    public String getUrl() {
        return url;
    }

    public String getJSONUrl(){
        return jsonURLStart + this.titel + "/" + this.language + jsonURLEnde;
    }

    public boolean checkURLConform(){
        return !this.url.contentEquals("Not conformed URL");
    }
}
