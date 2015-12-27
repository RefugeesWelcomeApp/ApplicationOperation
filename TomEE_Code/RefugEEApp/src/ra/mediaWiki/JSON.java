package ra.mediaWiki;

import org.json.JSONObject;

public class JSON {

    //class variables
    private String titleStr, textStr;

    private JSONObject parse, title, text;

    public JSON(String json) {
        setParse(json);
        setTitle();
        setText();

        setTitleStr();
        setTextStr();
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

    private void setTextStr() {
        this.textStr = this.text.getString("*");
    }

    private void setParse(String parse) {
        this.parse = new JSONObject(parse);
    }

    private void setTitle() {
        try {
            this.title = this.parse.getJSONObject("parse");
        } catch (RuntimeException ex)
        {
            ;
        }

    }

    private void setText() {
        try {
            this.text = this.title.getJSONObject("text");
        } catch (RuntimeException ex)
            {
                ;
            }
    }
}
