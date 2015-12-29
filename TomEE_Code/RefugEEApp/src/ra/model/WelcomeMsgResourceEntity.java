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
@Table(name = "welcome_msg_resource", schema = "refugeewiki", catalog = "")
public class WelcomeMsgResourceEntity {
    private byte[] mrResource;
    private byte[] mrLang;
    private byte[] mrBlob;
    private byte[] mrTimestamp;

    @Basic
    @Column(name = "mr_resource", nullable = false)
    public byte[] getMrResource() {
        return mrResource;
    }

    public void setMrResource(byte[] mrResource) {
        this.mrResource = mrResource;
    }

    @Basic
    @Column(name = "mr_lang", nullable = false)
    public byte[] getMrLang() {
        return mrLang;
    }

    public void setMrLang(byte[] mrLang) {
        this.mrLang = mrLang;
    }

    @Basic
    @Column(name = "mr_blob", nullable = false)
    public byte[] getMrBlob() {
        return mrBlob;
    }

    public void setMrBlob(byte[] mrBlob) {
        this.mrBlob = mrBlob;
    }

    @Basic
    @Column(name = "mr_timestamp", nullable = false)
    public byte[] getMrTimestamp() {
        return mrTimestamp;
    }

    public void setMrTimestamp(byte[] mrTimestamp) {
        this.mrTimestamp = mrTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeMsgResourceEntity that = (WelcomeMsgResourceEntity) o;

        if (!Arrays.equals(mrResource, that.mrResource)) return false;
        if (!Arrays.equals(mrLang, that.mrLang)) return false;
        if (!Arrays.equals(mrBlob, that.mrBlob)) return false;
        if (!Arrays.equals(mrTimestamp, that.mrTimestamp)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(mrResource);
        result = 31 * result + Arrays.hashCode(mrLang);
        result = 31 * result + Arrays.hashCode(mrBlob);
        result = 31 * result + Arrays.hashCode(mrTimestamp);
        return result;
    }
}
