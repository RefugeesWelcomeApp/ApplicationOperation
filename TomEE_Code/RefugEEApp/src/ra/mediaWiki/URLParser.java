package ra.mediaWiki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLParser {
    private final static String decodedStart = "https://ddc.derpy.ws/w/";
    private final static String encodedStart = "https://ddc.derpy.ws/media_wiki/";
    private final static String jsonURLStart = "https://ddc.derpy.ws/media_wiki/api.php?action=parse&page=";
    private final static String jsonURLEnde = "&format=json";

    private final static String regExPatternDecodedWithLanguage = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/w\\/([A-z0-9\\-:]+)\\/([A-z]{2})$";
    private final static String regExPatternDecodedWithoutLanguage = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/w\\/([A-z0-9\\-:]+)$";
    private final static String regExPatternEncodedWithLanguage = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/media_wiki\\/([A-z0-9\\-:]+)\\/([A-z]{2})$";
    private final static String regExPatternEncodedWithoutLanguage = "^https:\\/\\/\\D+\\.\\D+\\.\\D+\\/media_wiki\\/([A-z0-9\\-:]+)$";

    private String url;
    private String titel;
    private String language;

    public URLParser(String url) {
        int flags = Pattern.MULTILINE | Pattern.UNICODE_CHARACTER_CLASS;
        Pattern pattern = Pattern.compile(regExPatternEncodedWithLanguage, flags);
        Matcher regExMatcher = pattern.matcher(url);
        if (regExMatcher.find()) {
            this.titel = regExMatcher.group(1);
            language = regExMatcher.group(2);
            this.url = decodedStart + this.titel + "/" + language;
        }
        else {
            pattern = Pattern.compile(regExPatternEncodedWithoutLanguage, flags);
            regExMatcher = pattern.matcher(url);
            if (regExMatcher.find()) {
                this.titel = regExMatcher.group(1);
                language = "";
                this.url = decodedStart + this.titel;
            }
            else {
                pattern = Pattern.compile(regExPatternDecodedWithLanguage, flags);
                regExMatcher = pattern.matcher(url);
                if (regExMatcher.find()) {
                    this.titel = regExMatcher.group(1);
                    language = regExMatcher.group(2);
                    this.url = encodedStart + this.titel + "/" + this.language;
                } else {
                    pattern = Pattern.compile(regExPatternDecodedWithoutLanguage, flags);
                    regExMatcher = pattern.matcher(url);
                    if (regExMatcher.find()) {
                        this.titel = regExMatcher.group(1);
                        language = "";
                        this.url = encodedStart + this.titel;
                    } else
                    {
                        this.language = "";
                        this.titel="";
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
        if (this.language.equals(""))
        {
            return jsonURLStart + this.titel + jsonURLEnde;
        }
        else
        {
            return jsonURLStart + this.titel + "/" + this.language + jsonURLEnde;
        }
    }

    public boolean checkURLConform(){
        return !this.url.contentEquals("Not conformed URL");
    }
}
