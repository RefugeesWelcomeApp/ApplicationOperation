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
@Table(name = "welcome_tag_summary", schema = "refugeewiki", catalog = "")
public class WelcomeTagSummaryEntity {
    private Integer tsRcId;
    private Integer tsLogId;
    private Integer tsRevId;
    private byte[] tsTags;

    @Basic
    @Column(name = "ts_rc_id", nullable = true)
    public Integer getTsRcId() {
        return tsRcId;
    }

    public void setTsRcId(Integer tsRcId) {
        this.tsRcId = tsRcId;
    }

    @Basic
    @Column(name = "ts_log_id", nullable = true)
    public Integer getTsLogId() {
        return tsLogId;
    }

    public void setTsLogId(Integer tsLogId) {
        this.tsLogId = tsLogId;
    }

    @Basic
    @Column(name = "ts_rev_id", nullable = true)
    public Integer getTsRevId() {
        return tsRevId;
    }

    public void setTsRevId(Integer tsRevId) {
        this.tsRevId = tsRevId;
    }

    @Basic
    @Column(name = "ts_tags", nullable = false)
    public byte[] getTsTags() {
        return tsTags;
    }

    public void setTsTags(byte[] tsTags) {
        this.tsTags = tsTags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTagSummaryEntity that = (WelcomeTagSummaryEntity) o;

        if (tsRcId != null ? !tsRcId.equals(that.tsRcId) : that.tsRcId != null) return false;
        if (tsLogId != null ? !tsLogId.equals(that.tsLogId) : that.tsLogId != null) return false;
        if (tsRevId != null ? !tsRevId.equals(that.tsRevId) : that.tsRevId != null) return false;
        if (!Arrays.equals(tsTags, that.tsTags)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tsRcId != null ? tsRcId.hashCode() : 0;
        result = 31 * result + (tsLogId != null ? tsLogId.hashCode() : 0);
        result = 31 * result + (tsRevId != null ? tsRevId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(tsTags);
        return result;
    }
}
