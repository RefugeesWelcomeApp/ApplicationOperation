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
@Table(name = "welcome_log_search", schema = "refugeewiki", catalog = "")
public class WelcomeLogSearchEntity {
    private byte[] lsField;
    private byte[] lsValue;
    private int lsLogId;

    @Basic
    @Column(name = "ls_field", nullable = false)
    public byte[] getLsField() {
        return lsField;
    }

    public void setLsField(byte[] lsField) {
        this.lsField = lsField;
    }

    @Basic
    @Column(name = "ls_value", nullable = false)
    public byte[] getLsValue() {
        return lsValue;
    }

    public void setLsValue(byte[] lsValue) {
        this.lsValue = lsValue;
    }

    @Basic
    @Column(name = "ls_log_id", nullable = false)
    public int getLsLogId() {
        return lsLogId;
    }

    public void setLsLogId(int lsLogId) {
        this.lsLogId = lsLogId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeLogSearchEntity that = (WelcomeLogSearchEntity) o;

        if (lsLogId != that.lsLogId) return false;
        if (!Arrays.equals(lsField, that.lsField)) return false;
        if (!Arrays.equals(lsValue, that.lsValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(lsField);
        result = 31 * result + Arrays.hashCode(lsValue);
        result = 31 * result + lsLogId;
        return result;
    }
}
