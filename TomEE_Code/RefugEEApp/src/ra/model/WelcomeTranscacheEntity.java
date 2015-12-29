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
@Table(name = "welcome_transcache", schema = "refugeewiki", catalog = "")
public class WelcomeTranscacheEntity {
    private byte[] tcUrl;
    private byte[] tcContents;
    private byte[] tcTime;

    @Basic
    @Column(name = "tc_url", nullable = false)
    public byte[] getTcUrl() {
        return tcUrl;
    }

    public void setTcUrl(byte[] tcUrl) {
        this.tcUrl = tcUrl;
    }

    @Basic
    @Column(name = "tc_contents", nullable = true)
    public byte[] getTcContents() {
        return tcContents;
    }

    public void setTcContents(byte[] tcContents) {
        this.tcContents = tcContents;
    }

    @Basic
    @Column(name = "tc_time", nullable = true)
    public byte[] getTcTime() {
        return tcTime;
    }

    public void setTcTime(byte[] tcTime) {
        this.tcTime = tcTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranscacheEntity that = (WelcomeTranscacheEntity) o;

        if (!Arrays.equals(tcUrl, that.tcUrl)) return false;
        if (!Arrays.equals(tcContents, that.tcContents)) return false;
        if (!Arrays.equals(tcTime, that.tcTime)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(tcUrl);
        result = 31 * result + Arrays.hashCode(tcContents);
        result = 31 * result + Arrays.hashCode(tcTime);
        return result;
    }
}
