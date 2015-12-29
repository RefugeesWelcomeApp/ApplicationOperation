package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
public class WelcomeTranslateSectionsEntityPK implements Serializable {
    private int trsPage;
    private byte[] trsKey;

    @Column(name = "trs_page", nullable = false)
    @Id
    public int getTrsPage() {
        return trsPage;
    }

    public void setTrsPage(int trsPage) {
        this.trsPage = trsPage;
    }

    @Column(name = "trs_key", nullable = false)
    @Id
    public byte[] getTrsKey() {
        return trsKey;
    }

    public void setTrsKey(byte[] trsKey) {
        this.trsKey = trsKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateSectionsEntityPK that = (WelcomeTranslateSectionsEntityPK) o;

        if (trsPage != that.trsPage) return false;
        if (!Arrays.equals(trsKey, that.trsKey)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trsPage;
        result = 31 * result + Arrays.hashCode(trsKey);
        return result;
    }
}
