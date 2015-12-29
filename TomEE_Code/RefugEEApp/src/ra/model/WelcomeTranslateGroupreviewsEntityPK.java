package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
public class WelcomeTranslateGroupreviewsEntityPK implements Serializable {
    private byte[] tgrGroup;
    private byte[] tgrLang;

    @Column(name = "tgr_group", nullable = false)
    @Id
    public byte[] getTgrGroup() {
        return tgrGroup;
    }

    public void setTgrGroup(byte[] tgrGroup) {
        this.tgrGroup = tgrGroup;
    }

    @Column(name = "tgr_lang", nullable = false)
    @Id
    public byte[] getTgrLang() {
        return tgrLang;
    }

    public void setTgrLang(byte[] tgrLang) {
        this.tgrLang = tgrLang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateGroupreviewsEntityPK that = (WelcomeTranslateGroupreviewsEntityPK) o;

        if (!Arrays.equals(tgrGroup, that.tgrGroup)) return false;
        if (!Arrays.equals(tgrLang, that.tgrLang)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(tgrGroup);
        result = 31 * result + Arrays.hashCode(tgrLang);
        return result;
    }
}
