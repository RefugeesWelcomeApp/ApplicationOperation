package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_translate_metadata", schema = "refugeewiki", catalog = "")
@IdClass(WelcomeTranslateMetadataEntityPK.class)
public class WelcomeTranslateMetadataEntity {
    private byte[] tmdGroup;
    private byte[] tmdKey;
    private byte[] tmdValue;

    @Id
    @Column(name = "tmd_group", nullable = false)
    public byte[] getTmdGroup() {
        return tmdGroup;
    }

    public void setTmdGroup(byte[] tmdGroup) {
        this.tmdGroup = tmdGroup;
    }

    @Id
    @Column(name = "tmd_key", nullable = false)
    public byte[] getTmdKey() {
        return tmdKey;
    }

    public void setTmdKey(byte[] tmdKey) {
        this.tmdKey = tmdKey;
    }

    @Basic
    @Column(name = "tmd_value", nullable = false)
    public byte[] getTmdValue() {
        return tmdValue;
    }

    public void setTmdValue(byte[] tmdValue) {
        this.tmdValue = tmdValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateMetadataEntity that = (WelcomeTranslateMetadataEntity) o;

        if (!Arrays.equals(tmdGroup, that.tmdGroup)) return false;
        if (!Arrays.equals(tmdKey, that.tmdKey)) return false;
        if (!Arrays.equals(tmdValue, that.tmdValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(tmdGroup);
        result = 31 * result + Arrays.hashCode(tmdKey);
        result = 31 * result + Arrays.hashCode(tmdValue);
        return result;
    }
}
