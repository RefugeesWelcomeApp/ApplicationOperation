package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_updatelog", schema = "refugeewiki", catalog = "")
public class WelcomeUpdatelogEntity {
    private byte[] ulKey;
    private byte[] ulValue;

    @Id
    @Column(name = "ul_key", nullable = false)
    public byte[] getUlKey() {
        return ulKey;
    }

    public void setUlKey(byte[] ulKey) {
        this.ulKey = ulKey;
    }

    @Basic
    @Column(name = "ul_value", nullable = true)
    public byte[] getUlValue() {
        return ulValue;
    }

    public void setUlValue(byte[] ulValue) {
        this.ulValue = ulValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeUpdatelogEntity that = (WelcomeUpdatelogEntity) o;

        if (!Arrays.equals(ulKey, that.ulKey)) return false;
        if (!Arrays.equals(ulValue, that.ulValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(ulKey);
        result = 31 * result + Arrays.hashCode(ulValue);
        return result;
    }
}
