package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by the-l_000 on 13.12.2015.
 */
public class RltnProductLanguageEntityPK implements Serializable {
    private int productid;
    private int languageid;

    @Column(name = "productid", nullable = false)
    @Id
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    @Column(name = "languageid", nullable = false)
    @Id
    public int getLanguageid() {
        return languageid;
    }

    public void setLanguageid(int languageid) {
        this.languageid = languageid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RltnProductLanguageEntityPK that = (RltnProductLanguageEntityPK) o;

        if (productid != that.productid) return false;
        if (languageid != that.languageid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productid;
        result = 31 * result + languageid;
        return result;
    }
}
