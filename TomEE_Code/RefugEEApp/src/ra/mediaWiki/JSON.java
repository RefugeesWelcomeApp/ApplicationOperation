package ra.mediaWiki;

import org.json.JSONObject;

public class JSON {

    //class variables
    private String titleStr, textStr;

    private JSONObject parse, title, text;

    public JSON(String json, Boolean isSearch) {
        if (isSearch){
            setParse(json);

            setTextstrSearch();
        }
        else {
            setParse(json);
            setTitleParse();
            setTextParse();

            setTitleStr();
            setTextStrParse();
        }
    }

    public String getTitleStr() {
        return titleStr;
    }

    private void setTitleStr() {
        this.titleStr = this.title.getString("displaytitle");
    }

    public String getTextStr() {
        return textStr;
    }

    private void setTextStrParse() {
        this.textStr = this.text.getString("*");
    }

    private void setTextstrSearch() {
        try {
            String sSearchResult = "";
            for (int i = 0; i < this.parse.getJSONObject("query").getJSONArray("search").length(); i++) {
                JSONObject localJSONo = this.parse.getJSONObject("query").getJSONArray("search").getJSONObject(i);
                sSearchResult += "<br>";
                sSearchResult += "<h4><a href=\"/w/" + localJSONo.getString("title")+ "\">" + localJSONo.getString("title") + "</a></h4>";
                sSearchResult += "<p>" + localJSONo.getString("snippet") + "</p>";
            }
            this.textStr =sSearchResult;
        } catch (RuntimeException ex)
        {
            ;
        }
    }

    private void setParse(String parse) {
        this.parse = new JSONObject(parse);
    }

    private void setTitleParse() {
        try {
            this.title = this.parse.getJSONObject("parse");
        } catch (RuntimeException ex)
        {
            ;
        }

    }

    private void setTextParse() {
        try {
            this.text = this.title.getJSONObject("text");
        } catch (RuntimeException ex)
        {
            ;
        }
    }
}
