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
@Table(name = "welcome_translate_messageindex", schema = "refugeewiki", catalog = "")
public class WelcomeTranslateMessageindexEntity {
    private byte[] tmiKey;
    private byte[] tmiValue;

    @Basic
    @Column(name = "tmi_key", nullable = false)
    public byte[] getTmiKey() {
        return tmiKey;
    }

    public void setTmiKey(byte[] tmiKey) {
        this.tmiKey = tmiKey;
    }

    @Basic
    @Column(name = "tmi_value", nullable = false)
    public byte[] getTmiValue() {
        return tmiValue;
    }

    public void setTmiValue(byte[] tmiValue) {
        this.tmiValue = tmiValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateMessageindexEntity that = (WelcomeTranslateMessageindexEntity) o;

        if (!Arrays.equals(tmiKey, that.tmiKey)) return false;
        if (!Arrays.equals(tmiValue, that.tmiValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(tmiKey);
        result = 31 * result + Arrays.hashCode(tmiValue);
        return result;
    }
}
