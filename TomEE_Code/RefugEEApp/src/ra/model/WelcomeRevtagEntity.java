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
@Table(name = "welcome_revtag", schema = "refugeewiki", catalog = "")
public class WelcomeRevtagEntity {
    private byte[] rtType;
    private int rtPage;
    private int rtRevision;
    private byte[] rtValue;

    @Basic
    @Column(name = "rt_type", nullable = false)
    public byte[] getRtType() {
        return rtType;
    }

    public void setRtType(byte[] rtType) {
        this.rtType = rtType;
    }

    @Basic
    @Column(name = "rt_page", nullable = false)
    public int getRtPage() {
        return rtPage;
    }

    public void setRtPage(int rtPage) {
        this.rtPage = rtPage;
    }

    @Basic
    @Column(name = "rt_revision", nullable = false)
    public int getRtRevision() {
        return rtRevision;
    }

    public void setRtRevision(int rtRevision) {
        this.rtRevision = rtRevision;
    }

    @Basic
    @Column(name = "rt_value", nullable = true)
    public byte[] getRtValue() {
        return rtValue;
    }

    public void setRtValue(byte[] rtValue) {
        this.rtValue = rtValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeRevtagEntity that = (WelcomeRevtagEntity) o;

        if (rtPage != that.rtPage) return false;
        if (rtRevision != that.rtRevision) return false;
        if (!Arrays.equals(rtType, that.rtType)) return false;
        if (!Arrays.equals(rtValue, that.rtValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(rtType);
        result = 31 * result + rtPage;
        result = 31 * result + rtRevision;
        result = 31 * result + Arrays.hashCode(rtValue);
        return result;
    }
}
