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
@Table(name = "welcome_imagelinks", schema = "refugeewiki", catalog = "")
public class WelcomeImagelinksEntity {
    private int ilFrom;
    private int ilFromNamespace;
    private byte[] ilTo;

    @Basic
    @Column(name = "il_from", nullable = false)
    public int getIlFrom() {
        return ilFrom;
    }

    public void setIlFrom(int ilFrom) {
        this.ilFrom = ilFrom;
    }

    @Basic
    @Column(name = "il_from_namespace", nullable = false)
    public int getIlFromNamespace() {
        return ilFromNamespace;
    }

    public void setIlFromNamespace(int ilFromNamespace) {
        this.ilFromNamespace = ilFromNamespace;
    }

    @Basic
    @Column(name = "il_to", nullable = false)
    public byte[] getIlTo() {
        return ilTo;
    }

    public void setIlTo(byte[] ilTo) {
        this.ilTo = ilTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeImagelinksEntity that = (WelcomeImagelinksEntity) o;

        if (ilFrom != that.ilFrom) return false;
        if (ilFromNamespace != that.ilFromNamespace) return false;
        if (!Arrays.equals(ilTo, that.ilTo)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ilFrom;
        result = 31 * result + ilFromNamespace;
        result = 31 * result + Arrays.hashCode(ilTo);
        return result;
    }
}
