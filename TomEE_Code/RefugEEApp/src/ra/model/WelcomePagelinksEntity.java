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
@Table(name = "welcome_pagelinks", schema = "refugeewiki", catalog = "")
public class WelcomePagelinksEntity {
    private int plFrom;
    private int plFromNamespace;
    private int plNamespace;
    private byte[] plTitle;

    @Basic
    @Column(name = "pl_from", nullable = false)
    public int getPlFrom() {
        return plFrom;
    }

    public void setPlFrom(int plFrom) {
        this.plFrom = plFrom;
    }

    @Basic
    @Column(name = "pl_from_namespace", nullable = false)
    public int getPlFromNamespace() {
        return plFromNamespace;
    }

    public void setPlFromNamespace(int plFromNamespace) {
        this.plFromNamespace = plFromNamespace;
    }

    @Basic
    @Column(name = "pl_namespace", nullable = false)
    public int getPlNamespace() {
        return plNamespace;
    }

    public void setPlNamespace(int plNamespace) {
        this.plNamespace = plNamespace;
    }

    @Basic
    @Column(name = "pl_title", nullable = false)
    public byte[] getPlTitle() {
        return plTitle;
    }

    public void setPlTitle(byte[] plTitle) {
        this.plTitle = plTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomePagelinksEntity that = (WelcomePagelinksEntity) o;

        if (plFrom != that.plFrom) return false;
        if (plFromNamespace != that.plFromNamespace) return false;
        if (plNamespace != that.plNamespace) return false;
        if (!Arrays.equals(plTitle, that.plTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = plFrom;
        result = 31 * result + plFromNamespace;
        result = 31 * result + plNamespace;
        result = 31 * result + Arrays.hashCode(plTitle);
        return result;
    }
}
