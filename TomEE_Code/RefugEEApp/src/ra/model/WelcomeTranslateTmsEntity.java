package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_translate_tms", schema = "refugeewiki", catalog = "")
public class WelcomeTranslateTmsEntity {
    private int tmsSid;
    private byte[] tmsLang;
    private int tmsLen;
    private byte[] tmsText;
    private byte[] tmsContext;

    @Id
    @Column(name = "tms_sid", nullable = false)
    public int getTmsSid() {
        return tmsSid;
    }

    public void setTmsSid(int tmsSid) {
        this.tmsSid = tmsSid;
    }

    @Basic
    @Column(name = "tms_lang", nullable = false)
    public byte[] getTmsLang() {
        return tmsLang;
    }

    public void setTmsLang(byte[] tmsLang) {
        this.tmsLang = tmsLang;
    }

    @Basic
    @Column(name = "tms_len", nullable = false)
    public int getTmsLen() {
        return tmsLen;
    }

    public void setTmsLen(int tmsLen) {
        this.tmsLen = tmsLen;
    }

    @Basic
    @Column(name = "tms_text", nullable = false)
    public byte[] getTmsText() {
        return tmsText;
    }

    public void setTmsText(byte[] tmsText) {
        this.tmsText = tmsText;
    }

    @Basic
    @Column(name = "tms_context", nullable = false)
    public byte[] getTmsContext() {
        return tmsContext;
    }

    public void setTmsContext(byte[] tmsContext) {
        this.tmsContext = tmsContext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateTmsEntity that = (WelcomeTranslateTmsEntity) o;

        if (tmsSid != that.tmsSid) return false;
        if (tmsLen != that.tmsLen) return false;
        if (!Arrays.equals(tmsLang, that.tmsLang)) return false;
        if (!Arrays.equals(tmsText, that.tmsText)) return false;
        if (!Arrays.equals(tmsContext, that.tmsContext)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tmsSid;
        result = 31 * result + Arrays.hashCode(tmsLang);
        result = 31 * result + tmsLen;
        result = 31 * result + Arrays.hashCode(tmsText);
        result = 31 * result + Arrays.hashCode(tmsContext);
        return result;
    }
}
