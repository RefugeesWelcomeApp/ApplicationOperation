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
@Table(name = "welcome_site_identifiers", schema = "refugeewiki", catalog = "")
public class WelcomeSiteIdentifiersEntity {
    private int siSite;
    private byte[] siType;
    private byte[] siKey;

    @Basic
    @Column(name = "si_site", nullable = false)
    public int getSiSite() {
        return siSite;
    }

    public void setSiSite(int siSite) {
        this.siSite = siSite;
    }

    @Basic
    @Column(name = "si_type", nullable = false)
    public byte[] getSiType() {
        return siType;
    }

    public void setSiType(byte[] siType) {
        this.siType = siType;
    }

    @Basic
    @Column(name = "si_key", nullable = false)
    public byte[] getSiKey() {
        return siKey;
    }

    public void setSiKey(byte[] siKey) {
        this.siKey = siKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeSiteIdentifiersEntity that = (WelcomeSiteIdentifiersEntity) o;

        if (siSite != that.siSite) return false;
        if (!Arrays.equals(siType, that.siType)) return false;
        if (!Arrays.equals(siKey, that.siKey)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = siSite;
        result = 31 * result + Arrays.hashCode(siType);
        result = 31 * result + Arrays.hashCode(siKey);
        return result;
    }
}
