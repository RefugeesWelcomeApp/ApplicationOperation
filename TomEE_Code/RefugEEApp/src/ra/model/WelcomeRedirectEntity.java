package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_redirect", schema = "refugeewiki", catalog = "")
public class WelcomeRedirectEntity {
    private int rdFrom;
    private int rdNamespace;
    private byte[] rdTitle;
    private byte[] rdInterwiki;
    private byte[] rdFragment;

    @Id
    @Column(name = "rd_from", nullable = false)
    public int getRdFrom() {
        return rdFrom;
    }

    public void setRdFrom(int rdFrom) {
        this.rdFrom = rdFrom;
    }

    @Basic
    @Column(name = "rd_namespace", nullable = false)
    public int getRdNamespace() {
        return rdNamespace;
    }

    public void setRdNamespace(int rdNamespace) {
        this.rdNamespace = rdNamespace;
    }

    @Basic
    @Column(name = "rd_title", nullable = false)
    public byte[] getRdTitle() {
        return rdTitle;
    }

    public void setRdTitle(byte[] rdTitle) {
        this.rdTitle = rdTitle;
    }

    @Basic
    @Column(name = "rd_interwiki", nullable = true)
    public byte[] getRdInterwiki() {
        return rdInterwiki;
    }

    public void setRdInterwiki(byte[] rdInterwiki) {
        this.rdInterwiki = rdInterwiki;
    }

    @Basic
    @Column(name = "rd_fragment", nullable = true)
    public byte[] getRdFragment() {
        return rdFragment;
    }

    public void setRdFragment(byte[] rdFragment) {
        this.rdFragment = rdFragment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeRedirectEntity that = (WelcomeRedirectEntity) o;

        if (rdFrom != that.rdFrom) return false;
        if (rdNamespace != that.rdNamespace) return false;
        if (!Arrays.equals(rdTitle, that.rdTitle)) return false;
        if (!Arrays.equals(rdInterwiki, that.rdInterwiki)) return false;
        if (!Arrays.equals(rdFragment, that.rdFragment)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rdFrom;
        result = 31 * result + rdNamespace;
        result = 31 * result + Arrays.hashCode(rdTitle);
        result = 31 * result + Arrays.hashCode(rdInterwiki);
        result = 31 * result + Arrays.hashCode(rdFragment);
        return result;
    }
}
