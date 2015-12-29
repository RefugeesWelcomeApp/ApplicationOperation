package ra.mediaWiki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLParser {
    private final static String decodedStart = "https://ddc.derpy.ws/w/";
    private final static String encodedStart = "https://ddc.derpy.ws/media_wiki/";
    private final static String jsonURLStart = "https://ddc.derpy.ws/media_wiki/api.php?action=parse&page=";
    private final static String jsonURLEnde = "&disableeditsection=true&disablepp=true&redirects=true&format=json";

    private final static String regExPatternDecodedWithLanguage = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/w\\/([A-z0-9\\-:_%,]+)\\/([A-z]{2})$";
    private final static String regExPatternDecodedWithoutLanguage = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/w\\/([A-z0-9\\-:_%,]+)$";
    private final static String regExPatternEncodedWithLanguage = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/media_wiki\\/([A-z0-9\\-:_%,]+)\\/([A-z]{2})$";
    private final static String regExPatternEncodedWithoutLanguage = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/media_wiki\\/([A-z0-9\\-:_%,]+)$";

    private String url;
    private String sTitle;
    private String sLanguage;

    public URLParser(String url) {
        int flags = Pattern.MULTILINE | Pattern.UNICODE_CHARACTER_CLASS;
        Pattern pattern = Pattern.compile(regExPatternEncodedWithLanguage, flags);
        Matcher regExMatcher = pattern.matcher(url);
        if (regExMatcher.find()) {
            this.sTitle = regExMatcher.group(1);
            sLanguage = regExMatcher.group(2);
            this.url = decodedStart + this.sTitle + "/" + sLanguage;
        }
        else {
            pattern = Pattern.compile(regExPatternEncodedWithoutLanguage, flags);
            regExMatcher = pattern.matcher(url);
            if (regExMatcher.find()) {
                this.sTitle = regExMatcher.group(1);
                sLanguage = "";
                this.url = decodedStart + this.sTitle;
            }
            else {
                pattern = Pattern.compile(regExPatternDecodedWithLanguage, flags);
                regExMatcher = pattern.matcher(url);
                if (regExMatcher.find()) {
                    this.sTitle = regExMatcher.group(1);
                    sLanguage = regExMatcher.group(2);
                    this.url = encodedStart + this.sTitle + "/" + this.sLanguage;
                } else {
                    pattern = Pattern.compile(regExPatternDecodedWithoutLanguage, flags);
                    regExMatcher = pattern.matcher(url);
                    if (regExMatcher.find()) {
                        this.sTitle = regExMatcher.group(1);
                        sLanguage = "";
                        this.url = encodedStart + this.sTitle;
                    } else
                    {
                        this.sLanguage = "";
                        this.sTitle ="";
                        this.url = "https://ddc.derpy.ws";
                    }
                }
            }
        }
    }

    public String getUrl() {
        return url;
    }

    public String getJSONUrl(){
        if (this.sLanguage.equals(""))
        {
            return jsonURLStart + this.sTitle + jsonURLEnde;
        }
        else
        {
            return jsonURLStart + this.sTitle + "/" + this.sLanguage + jsonURLEnde;
        }
    }

    public boolean checkURLConform(){
        return !this.url.contentEquals("Not conformed URL");
    }
}
