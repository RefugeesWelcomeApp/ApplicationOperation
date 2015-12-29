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
@Table(name = "welcome_change_tag", schema = "refugeewiki", catalog = "")
public class WelcomeChangeTagEntity {
    private Integer ctRcId;
    private Integer ctLogId;
    private Integer ctRevId;
    private byte[] ctTag;
    private byte[] ctParams;

    @Basic
    @Column(name = "ct_rc_id", nullable = true)
    public Integer getCtRcId() {
        return ctRcId;
    }

    public void setCtRcId(Integer ctRcId) {
        this.ctRcId = ctRcId;
    }

    @Basic
    @Column(name = "ct_log_id", nullable = true)
    public Integer getCtLogId() {
        return ctLogId;
    }

    public void setCtLogId(Integer ctLogId) {
        this.ctLogId = ctLogId;
    }

    @Basic
    @Column(name = "ct_rev_id", nullable = true)
    public Integer getCtRevId() {
        return ctRevId;
    }

    public void setCtRevId(Integer ctRevId) {
        this.ctRevId = ctRevId;
    }

    @Basic
    @Column(name = "ct_tag", nullable = false)
    public byte[] getCtTag() {
        return ctTag;
    }

    public void setCtTag(byte[] ctTag) {
        this.ctTag = ctTag;
    }

    @Basic
    @Column(name = "ct_params", nullable = true)
    public byte[] getCtParams() {
        return ctParams;
    }

    public void setCtParams(byte[] ctParams) {
        this.ctParams = ctParams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeChangeTagEntity that = (WelcomeChangeTagEntity) o;

        if (ctRcId != null ? !ctRcId.equals(that.ctRcId) : that.ctRcId != null) return false;
        if (ctLogId != null ? !ctLogId.equals(that.ctLogId) : that.ctLogId != null) return false;
        if (ctRevId != null ? !ctRevId.equals(that.ctRevId) : that.ctRevId != null) return false;
        if (!Arrays.equals(ctTag, that.ctTag)) return false;
        if (!Arrays.equals(ctParams, that.ctParams)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ctRcId != null ? ctRcId.hashCode() : 0;
        result = 31 * result + (ctLogId != null ? ctLogId.hashCode() : 0);
        result = 31 * result + (ctRevId != null ? ctRevId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(ctTag);
        result = 31 * result + Arrays.hashCode(ctParams);
        return result;
    }
}
