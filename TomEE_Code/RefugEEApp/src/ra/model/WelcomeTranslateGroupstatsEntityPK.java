package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
public class WelcomeTranslateGroupstatsEntityPK implements Serializable {
    private byte[] tgsGroup;
    private byte[] tgsLang;

    @Column(name = "tgs_group", nullable = false)
    @Id
    public byte[] getTgsGroup() {
        return tgsGroup;
    }

    public void setTgsGroup(byte[] tgsGroup) {
        this.tgsGroup = tgsGroup;
    }

    @Column(name = "tgs_lang", nullable = false)
    @Id
    public byte[] getTgsLang() {
        return tgsLang;
    }

    public void setTgsLang(byte[] tgsLang) {
        this.tgsLang = tgsLang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateGroupstatsEntityPK that = (WelcomeTranslateGroupstatsEntityPK) o;

        if (!Arrays.equals(tgsGroup, that.tgsGroup)) return false;
        if (!Arrays.equals(tgsLang, that.tgsLang)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(tgsGroup);
        result = 31 * result + Arrays.hashCode(tgsLang);
        return result;
    }
}
