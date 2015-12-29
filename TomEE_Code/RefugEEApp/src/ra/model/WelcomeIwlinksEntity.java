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
@Table(name = "welcome_iwlinks", schema = "refugeewiki", catalog = "")
public class WelcomeIwlinksEntity {
    private int iwlFrom;
    private byte[] iwlPrefix;
    private byte[] iwlTitle;

    @Basic
    @Column(name = "iwl_from", nullable = false)
    public int getIwlFrom() {
        return iwlFrom;
    }

    public void setIwlFrom(int iwlFrom) {
        this.iwlFrom = iwlFrom;
    }

    @Basic
    @Column(name = "iwl_prefix", nullable = false)
    public byte[] getIwlPrefix() {
        return iwlPrefix;
    }

    public void setIwlPrefix(byte[] iwlPrefix) {
        this.iwlPrefix = iwlPrefix;
    }

    @Basic
    @Column(name = "iwl_title", nullable = false)
    public byte[] getIwlTitle() {
        return iwlTitle;
    }

    public void setIwlTitle(byte[] iwlTitle) {
        this.iwlTitle = iwlTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeIwlinksEntity that = (WelcomeIwlinksEntity) o;

        if (iwlFrom != that.iwlFrom) return false;
        if (!Arrays.equals(iwlPrefix, that.iwlPrefix)) return false;
        if (!Arrays.equals(iwlTitle, that.iwlTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iwlFrom;
        result = 31 * result + Arrays.hashCode(iwlPrefix);
        result = 31 * result + Arrays.hashCode(iwlTitle);
        return result;
    }
}
