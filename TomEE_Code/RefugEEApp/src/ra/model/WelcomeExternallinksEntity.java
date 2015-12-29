package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_externallinks", schema = "refugeewiki", catalog = "")
public class WelcomeExternallinksEntity {
    private int elId;
    private int elFrom;
    private byte[] elTo;
    private byte[] elIndex;

    @Id
    @Column(name = "el_id", nullable = false)
    public int getElId() {
        return elId;
    }

    public void setElId(int elId) {
        this.elId = elId;
    }

    @Basic
    @Column(name = "el_from", nullable = false)
    public int getElFrom() {
        return elFrom;
    }

    public void setElFrom(int elFrom) {
        this.elFrom = elFrom;
    }

    @Basic
    @Column(name = "el_to", nullable = false)
    public byte[] getElTo() {
        return elTo;
    }

    public void setElTo(byte[] elTo) {
        this.elTo = elTo;
    }

    @Basic
    @Column(name = "el_index", nullable = false)
    public byte[] getElIndex() {
        return elIndex;
    }

    public void setElIndex(byte[] elIndex) {
        this.elIndex = elIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeExternallinksEntity that = (WelcomeExternallinksEntity) o;

        if (elId != that.elId) return false;
        if (elFrom != that.elFrom) return false;
        if (!Arrays.equals(elTo, that.elTo)) return false;
        if (!Arrays.equals(elIndex, that.elIndex)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = elId;
        result = 31 * result + elFrom;
        result = 31 * result + Arrays.hashCode(elTo);
        result = 31 * result + Arrays.hashCode(elIndex);
        return result;
    }
}
