package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_translate_sections", schema = "refugeewiki", catalog = "")
@IdClass(WelcomeTranslateSectionsEntityPK.class)
public class WelcomeTranslateSectionsEntity {
    private int trsPage;
    private byte[] trsKey;
    private byte[] trsText;
    private Integer trsOrder;

    @Id
    @Column(name = "trs_page", nullable = false)
    public int getTrsPage() {
        return trsPage;
    }

    public void setTrsPage(int trsPage) {
        this.trsPage = trsPage;
    }

    @Id
    @Column(name = "trs_key", nullable = false)
    public byte[] getTrsKey() {
        return trsKey;
    }

    public void setTrsKey(byte[] trsKey) {
        this.trsKey = trsKey;
    }

    @Basic
    @Column(name = "trs_text", nullable = false)
    public byte[] getTrsText() {
        return trsText;
    }

    public void setTrsText(byte[] trsText) {
        this.trsText = trsText;
    }

    @Basic
    @Column(name = "trs_order", nullable = true)
    public Integer getTrsOrder() {
        return trsOrder;
    }

    public void setTrsOrder(Integer trsOrder) {
        this.trsOrder = trsOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateSectionsEntity that = (WelcomeTranslateSectionsEntity) o;

        if (trsPage != that.trsPage) return false;
        if (!Arrays.equals(trsKey, that.trsKey)) return false;
        if (!Arrays.equals(trsText, that.trsText)) return false;
        if (trsOrder != null ? !trsOrder.equals(that.trsOrder) : that.trsOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trsPage;
        result = 31 * result + Arrays.hashCode(trsKey);
        result = 31 * result + Arrays.hashCode(trsText);
        result = 31 * result + (trsOrder != null ? trsOrder.hashCode() : 0);
        return result;
    }
}
