package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_translate_tmf", schema = "refugeewiki", catalog = "")
public class WelcomeTranslateTmfEntity {
    private int tmfSid;
    private String tmfText;

    @Basic
    @Column(name = "tmf_sid", nullable = false)
    public int getTmfSid() {
        return tmfSid;
    }

    public void setTmfSid(int tmfSid) {
        this.tmfSid = tmfSid;
    }

    @Basic
    @Column(name = "tmf_text", nullable = true, length = -1)
    public String getTmfText() {
        return tmfText;
    }

    public void setTmfText(String tmfText) {
        this.tmfText = tmfText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateTmfEntity that = (WelcomeTranslateTmfEntity) o;

        if (tmfSid != that.tmfSid) return false;
        if (tmfText != null ? !tmfText.equals(that.tmfText) : that.tmfText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tmfSid;
        result = 31 * result + (tmfText != null ? tmfText.hashCode() : 0);
        return result;
    }
}
