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
@Table(name = "welcome_page_props", schema = "refugeewiki", catalog = "")
public class WelcomePagePropsEntity {
    private int ppPage;
    private byte[] ppPropname;
    private byte[] ppValue;
    private Double ppSortkey;

    @Basic
    @Column(name = "pp_page", nullable = false)
    public int getPpPage() {
        return ppPage;
    }

    public void setPpPage(int ppPage) {
        this.ppPage = ppPage;
    }

    @Basic
    @Column(name = "pp_propname", nullable = false)
    public byte[] getPpPropname() {
        return ppPropname;
    }

    public void setPpPropname(byte[] ppPropname) {
        this.ppPropname = ppPropname;
    }

    @Basic
    @Column(name = "pp_value", nullable = false)
    public byte[] getPpValue() {
        return ppValue;
    }

    public void setPpValue(byte[] ppValue) {
        this.ppValue = ppValue;
    }

    @Basic
    @Column(name = "pp_sortkey", nullable = true, precision = 0)
    public Double getPpSortkey() {
        return ppSortkey;
    }

    public void setPpSortkey(Double ppSortkey) {
        this.ppSortkey = ppSortkey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomePagePropsEntity that = (WelcomePagePropsEntity) o;

        if (ppPage != that.ppPage) return false;
        if (!Arrays.equals(ppPropname, that.ppPropname)) return false;
        if (!Arrays.equals(ppValue, that.ppValue)) return false;
        if (ppSortkey != null ? !ppSortkey.equals(that.ppSortkey) : that.ppSortkey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ppPage;
        result = 31 * result + Arrays.hashCode(ppPropname);
        result = 31 * result + Arrays.hashCode(ppValue);
        result = 31 * result + (ppSortkey != null ? ppSortkey.hashCode() : 0);
        return result;
    }
}
