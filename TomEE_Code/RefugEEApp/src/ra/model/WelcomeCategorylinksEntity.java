package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_categorylinks", schema = "refugeewiki", catalog = "")
public class WelcomeCategorylinksEntity {
    private int clFrom;
    private byte[] clTo;
    private byte[] clSortkey;
    private byte[] clSortkeyPrefix;
    private Timestamp clTimestamp;
    private byte[] clCollation;
    private Serializable clType;

    @Basic
    @Column(name = "cl_from", nullable = false)
    public int getClFrom() {
        return clFrom;
    }

    public void setClFrom(int clFrom) {
        this.clFrom = clFrom;
    }

    @Basic
    @Column(name = "cl_to", nullable = false)
    public byte[] getClTo() {
        return clTo;
    }

    public void setClTo(byte[] clTo) {
        this.clTo = clTo;
    }

    @Basic
    @Column(name = "cl_sortkey", nullable = false)
    public byte[] getClSortkey() {
        return clSortkey;
    }

    public void setClSortkey(byte[] clSortkey) {
        this.clSortkey = clSortkey;
    }

    @Basic
    @Column(name = "cl_sortkey_prefix", nullable = false)
    public byte[] getClSortkeyPrefix() {
        return clSortkeyPrefix;
    }

    public void setClSortkeyPrefix(byte[] clSortkeyPrefix) {
        this.clSortkeyPrefix = clSortkeyPrefix;
    }

    @Basic
    @Column(name = "cl_timestamp", nullable = false)
    public Timestamp getClTimestamp() {
        return clTimestamp;
    }

    public void setClTimestamp(Timestamp clTimestamp) {
        this.clTimestamp = clTimestamp;
    }

    @Basic
    @Column(name = "cl_collation", nullable = false)
    public byte[] getClCollation() {
        return clCollation;
    }

    public void setClCollation(byte[] clCollation) {
        this.clCollation = clCollation;
    }

    @Basic
    @Column(name = "cl_type", nullable = false)
    public Serializable getClType() {
        return clType;
    }

    public void setClType(Serializable clType) {
        this.clType = clType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeCategorylinksEntity that = (WelcomeCategorylinksEntity) o;

        if (clFrom != that.clFrom) return false;
        if (!Arrays.equals(clTo, that.clTo)) return false;
        if (!Arrays.equals(clSortkey, that.clSortkey)) return false;
        if (!Arrays.equals(clSortkeyPrefix, that.clSortkeyPrefix)) return false;
        if (clTimestamp != null ? !clTimestamp.equals(that.clTimestamp) : that.clTimestamp != null) return false;
        if (!Arrays.equals(clCollation, that.clCollation)) return false;
        if (clType != null ? !clType.equals(that.clType) : that.clType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clFrom;
        result = 31 * result + Arrays.hashCode(clTo);
        result = 31 * result + Arrays.hashCode(clSortkey);
        result = 31 * result + Arrays.hashCode(clSortkeyPrefix);
        result = 31 * result + (clTimestamp != null ? clTimestamp.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(clCollation);
        result = 31 * result + (clType != null ? clType.hashCode() : 0);
        return result;
    }
}
