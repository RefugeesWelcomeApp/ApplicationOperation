package ra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_valid_tag", schema = "refugeewiki", catalog = "")
public class WelcomeValidTagEntity {
    private byte[] vtTag;

    @Id
    @Column(name = "vt_tag", nullable = false)
    public byte[] getVtTag() {
        return vtTag;
    }

    public void setVtTag(byte[] vtTag) {
        this.vtTag = vtTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeValidTagEntity that = (WelcomeValidTagEntity) o;

        if (!Arrays.equals(vtTag, that.vtTag)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(vtTag);
    }
}
