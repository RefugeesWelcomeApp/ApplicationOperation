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
@Table(name = "welcome_templatelinks", schema = "refugeewiki", catalog = "")
public class WelcomeTemplatelinksEntity {
    private int tlFrom;
    private int tlFromNamespace;
    private int tlNamespace;
    private byte[] tlTitle;

    @Basic
    @Column(name = "tl_from", nullable = false)
    public int getTlFrom() {
        return tlFrom;
    }

    public void setTlFrom(int tlFrom) {
        this.tlFrom = tlFrom;
    }

    @Basic
    @Column(name = "tl_from_namespace", nullable = false)
    public int getTlFromNamespace() {
        return tlFromNamespace;
    }

    public void setTlFromNamespace(int tlFromNamespace) {
        this.tlFromNamespace = tlFromNamespace;
    }

    @Basic
    @Column(name = "tl_namespace", nullable = false)
    public int getTlNamespace() {
        return tlNamespace;
    }

    public void setTlNamespace(int tlNamespace) {
        this.tlNamespace = tlNamespace;
    }

    @Basic
    @Column(name = "tl_title", nullable = false)
    public byte[] getTlTitle() {
        return tlTitle;
    }

    public void setTlTitle(byte[] tlTitle) {
        this.tlTitle = tlTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTemplatelinksEntity that = (WelcomeTemplatelinksEntity) o;

        if (tlFrom != that.tlFrom) return false;
        if (tlFromNamespace != that.tlFromNamespace) return false;
        if (tlNamespace != that.tlNamespace) return false;
        if (!Arrays.equals(tlTitle, that.tlTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tlFrom;
        result = 31 * result + tlFromNamespace;
        result = 31 * result + tlNamespace;
        result = 31 * result + Arrays.hashCode(tlTitle);
        return result;
    }
}
