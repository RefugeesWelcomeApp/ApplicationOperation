package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_translate_groupstats", schema = "refugeewiki", catalog = "")
@IdClass(WelcomeTranslateGroupstatsEntityPK.class)
public class WelcomeTranslateGroupstatsEntity {
    private byte[] tgsGroup;
    private byte[] tgsLang;
    private Integer tgsTotal;
    private Integer tgsTranslated;
    private Integer tgsFuzzy;
    private Integer tgsProofread;

    @Id
    @Column(name = "tgs_group", nullable = false)
    public byte[] getTgsGroup() {
        return tgsGroup;
    }

    public void setTgsGroup(byte[] tgsGroup) {
        this.tgsGroup = tgsGroup;
    }

    @Id
    @Column(name = "tgs_lang", nullable = false)
    public byte[] getTgsLang() {
        return tgsLang;
    }

    public void setTgsLang(byte[] tgsLang) {
        this.tgsLang = tgsLang;
    }

    @Basic
    @Column(name = "tgs_total", nullable = true)
    public Integer getTgsTotal() {
        return tgsTotal;
    }

    public void setTgsTotal(Integer tgsTotal) {
        this.tgsTotal = tgsTotal;
    }

    @Basic
    @Column(name = "tgs_translated", nullable = true)
    public Integer getTgsTranslated() {
        return tgsTranslated;
    }

    public void setTgsTranslated(Integer tgsTranslated) {
        this.tgsTranslated = tgsTranslated;
    }

    @Basic
    @Column(name = "tgs_fuzzy", nullable = true)
    public Integer getTgsFuzzy() {
        return tgsFuzzy;
    }

    public void setTgsFuzzy(Integer tgsFuzzy) {
        this.tgsFuzzy = tgsFuzzy;
    }

    @Basic
    @Column(name = "tgs_proofread", nullable = true)
    public Integer getTgsProofread() {
        return tgsProofread;
    }

    public void setTgsProofread(Integer tgsProofread) {
        this.tgsProofread = tgsProofread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateGroupstatsEntity that = (WelcomeTranslateGroupstatsEntity) o;

        if (!Arrays.equals(tgsGroup, that.tgsGroup)) return false;
        if (!Arrays.equals(tgsLang, that.tgsLang)) return false;
        if (tgsTotal != null ? !tgsTotal.equals(that.tgsTotal) : that.tgsTotal != null) return false;
        if (tgsTranslated != null ? !tgsTranslated.equals(that.tgsTranslated) : that.tgsTranslated != null)
            return false;
        if (tgsFuzzy != null ? !tgsFuzzy.equals(that.tgsFuzzy) : that.tgsFuzzy != null) return false;
        if (tgsProofread != null ? !tgsProofread.equals(that.tgsProofread) : that.tgsProofread != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(tgsGroup);
        result = 31 * result + Arrays.hashCode(tgsLang);
        result = 31 * result + (tgsTotal != null ? tgsTotal.hashCode() : 0);
        result = 31 * result + (tgsTranslated != null ? tgsTranslated.hashCode() : 0);
        result = 31 * result + (tgsFuzzy != null ? tgsFuzzy.hashCode() : 0);
        result = 31 * result + (tgsProofread != null ? tgsProofread.hashCode() : 0);
        return result;
    }
}
