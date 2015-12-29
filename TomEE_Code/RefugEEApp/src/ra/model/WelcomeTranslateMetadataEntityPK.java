package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
public class WelcomeTranslateMetadataEntityPK implements Serializable {
    private byte[] tmdGroup;
    private byte[] tmdKey;

    @Column(name = "tmd_group", nullable = false)
    @Id
    public byte[] getTmdGroup() {
        return tmdGroup;
    }

    public void setTmdGroup(byte[] tmdGroup) {
        this.tmdGroup = tmdGroup;
    }

    @Column(name = "tmd_key", nullable = false)
    @Id
    public byte[] getTmdKey() {
        return tmdKey;
    }

    public void setTmdKey(byte[] tmdKey) {
        this.tmdKey = tmdKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateMetadataEntityPK that = (WelcomeTranslateMetadataEntityPK) o;

        if (!Arrays.equals(tmdGroup, that.tmdGroup)) return false;
        if (!Arrays.equals(tmdKey, that.tmdKey)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(tmdGroup);
        result = 31 * result + Arrays.hashCode(tmdKey);
        return result;
    }
}
