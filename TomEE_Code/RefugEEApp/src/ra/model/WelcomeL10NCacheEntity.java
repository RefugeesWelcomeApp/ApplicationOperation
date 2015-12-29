package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_l10n_cache", schema = "refugeewiki", catalog = "")
public class WelcomeL10NCacheEntity {
    private byte[] lcLang;
    private byte[] lcKey;
    private byte[] lcValue;

    @Basic
    @Column(name = "lc_lang", nullable = false)
    public byte[] getLcLang() {
        return lcLang;
    }

    public void setLcLang(byte[] lcLang) {
        this.lcLang = lcLang;
    }

    @Basic
    @Column(name = "lc_key", nullable = false)
    public byte[] getLcKey() {
        return lcKey;
    }

    public void setLcKey(byte[] lcKey) {
        this.lcKey = lcKey;
    }

    @Basic
    @Column(name = "lc_value", nullable = false)
    public byte[] getLcValue() {
        return lcValue;
    }

    public void setLcValue(byte[] lcValue) {
        this.lcValue = lcValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeL10NCacheEntity that = (WelcomeL10NCacheEntity) o;

        if (!Arrays.equals(lcLang, that.lcLang)) return false;
        if (!Arrays.equals(lcKey, that.lcKey)) return false;
        if (!Arrays.equals(lcValue, that.lcValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(lcLang);
        result = 31 * result + Arrays.hashCode(lcKey);
        result = 31 * result + Arrays.hashCode(lcValue);
        return result;
    }
}
