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
@Table(name = "welcome_querycachetwo", schema = "refugeewiki", catalog = "")
public class WelcomeQuerycachetwoEntity {
    private byte[] qccType;
    private int qccValue;
    private int qccNamespace;
    private byte[] qccTitle;
    private int qccNamespacetwo;
    private byte[] qccTitletwo;

    @Basic
    @Column(name = "qcc_type", nullable = false)
    public byte[] getQccType() {
        return qccType;
    }

    public void setQccType(byte[] qccType) {
        this.qccType = qccType;
    }

    @Basic
    @Column(name = "qcc_value", nullable = false)
    public int getQccValue() {
        return qccValue;
    }

    public void setQccValue(int qccValue) {
        this.qccValue = qccValue;
    }

    @Basic
    @Column(name = "qcc_namespace", nullable = false)
    public int getQccNamespace() {
        return qccNamespace;
    }

    public void setQccNamespace(int qccNamespace) {
        this.qccNamespace = qccNamespace;
    }

    @Basic
    @Column(name = "qcc_title", nullable = false)
    public byte[] getQccTitle() {
        return qccTitle;
    }

    public void setQccTitle(byte[] qccTitle) {
        this.qccTitle = qccTitle;
    }

    @Basic
    @Column(name = "qcc_namespacetwo", nullable = false)
    public int getQccNamespacetwo() {
        return qccNamespacetwo;
    }

    public void setQccNamespacetwo(int qccNamespacetwo) {
        this.qccNamespacetwo = qccNamespacetwo;
    }

    @Basic
    @Column(name = "qcc_titletwo", nullable = false)
    public byte[] getQccTitletwo() {
        return qccTitletwo;
    }

    public void setQccTitletwo(byte[] qccTitletwo) {
        this.qccTitletwo = qccTitletwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeQuerycachetwoEntity that = (WelcomeQuerycachetwoEntity) o;

        if (qccValue != that.qccValue) return false;
        if (qccNamespace != that.qccNamespace) return false;
        if (qccNamespacetwo != that.qccNamespacetwo) return false;
        if (!Arrays.equals(qccType, that.qccType)) return false;
        if (!Arrays.equals(qccTitle, that.qccTitle)) return false;
        if (!Arrays.equals(qccTitletwo, that.qccTitletwo)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(qccType);
        result = 31 * result + qccValue;
        result = 31 * result + qccNamespace;
        result = 31 * result + Arrays.hashCode(qccTitle);
        result = 31 * result + qccNamespacetwo;
        result = 31 * result + Arrays.hashCode(qccTitletwo);
        return result;
    }
}
