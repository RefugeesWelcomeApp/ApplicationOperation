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
@Table(name = "welcome_msg_resource_links", schema = "refugeewiki", catalog = "")
public class WelcomeMsgResourceLinksEntity {
    private byte[] mrlResource;
    private byte[] mrlMessage;

    @Basic
    @Column(name = "mrl_resource", nullable = false)
    public byte[] getMrlResource() {
        return mrlResource;
    }

    public void setMrlResource(byte[] mrlResource) {
        this.mrlResource = mrlResource;
    }

    @Basic
    @Column(name = "mrl_message", nullable = false)
    public byte[] getMrlMessage() {
        return mrlMessage;
    }

    public void setMrlMessage(byte[] mrlMessage) {
        this.mrlMessage = mrlMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeMsgResourceLinksEntity that = (WelcomeMsgResourceLinksEntity) o;

        if (!Arrays.equals(mrlResource, that.mrlResource)) return false;
        if (!Arrays.equals(mrlMessage, that.mrlMessage)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(mrlResource);
        result = 31 * result + Arrays.hashCode(mrlMessage);
        return result;
    }
}
