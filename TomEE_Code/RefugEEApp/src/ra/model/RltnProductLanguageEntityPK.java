package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/24.
 */
public class RltnProductLanguageEntityPK implements Serializable {
    private int productid;
    private int languageid;

    @Column(name = "productid")
    @Id
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    @Column(name = "languageid")
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
