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
@Table(name = "welcome_querycache_info", schema = "refugeewiki", catalog = "")
public class WelcomeQuerycacheInfoEntity {
    private byte[] qciType;
    private byte[] qciTimestamp;

    @Basic
    @Column(name = "qci_type", nullable = false)
    public byte[] getQciType() {
        return qciType;
    }

    public void setQciType(byte[] qciType) {
        this.qciType = qciType;
    }

    @Basic
    @Column(name = "qci_timestamp", nullable = false)
    public byte[] getQciTimestamp() {
        return qciTimestamp;
    }

    public void setQciTimestamp(byte[] qciTimestamp) {
        this.qciTimestamp = qciTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeQuerycacheInfoEntity that = (WelcomeQuerycacheInfoEntity) o;

        if (!Arrays.equals(qciType, that.qciType)) return false;
        if (!Arrays.equals(qciTimestamp, that.qciTimestamp)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(qciType);
        result = 31 * result + Arrays.hashCode(qciTimestamp);
        return result;
    }
}
