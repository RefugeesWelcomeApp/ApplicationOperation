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
@Table(name = "welcome_querycache", schema = "refugeewiki", catalog = "")
public class WelcomeQuerycacheEntity {
    private byte[] qcType;
    private int qcValue;
    private int qcNamespace;
    private byte[] qcTitle;

    @Basic
    @Column(name = "qc_type", nullable = false)
    public byte[] getQcType() {
        return qcType;
    }

    public void setQcType(byte[] qcType) {
        this.qcType = qcType;
    }

    @Basic
    @Column(name = "qc_value", nullable = false)
    public int getQcValue() {
        return qcValue;
    }

    public void setQcValue(int qcValue) {
        this.qcValue = qcValue;
    }

    @Basic
    @Column(name = "qc_namespace", nullable = false)
    public int getQcNamespace() {
        return qcNamespace;
    }

    public void setQcNamespace(int qcNamespace) {
        this.qcNamespace = qcNamespace;
    }

    @Basic
    @Column(name = "qc_title", nullable = false)
    public byte[] getQcTitle() {
        return qcTitle;
    }

    public void setQcTitle(byte[] qcTitle) {
        this.qcTitle = qcTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeQuerycacheEntity that = (WelcomeQuerycacheEntity) o;

        if (qcValue != that.qcValue) return false;
        if (qcNamespace != that.qcNamespace) return false;
        if (!Arrays.equals(qcType, that.qcType)) return false;
        if (!Arrays.equals(qcTitle, that.qcTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(qcType);
        result = 31 * result + qcValue;
        result = 31 * result + qcNamespace;
        result = 31 * result + Arrays.hashCode(qcTitle);
        return result;
    }
}
