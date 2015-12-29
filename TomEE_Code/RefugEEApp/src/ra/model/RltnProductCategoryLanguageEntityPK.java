package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/24.
 */
public class RltnProductCategoryLanguageEntityPK implements Serializable {
    private int productCategoryid;
    private int languageid;

    @Column(name = "product_categoryid")
    @Id
    public int getProductCategoryid() {
        return productCategoryid;
    }

    public void setProductCategoryid(int productCategoryid) {
        this.productCategoryid = productCategoryid;
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

        RltnProductCategoryLanguageEntityPK that = (RltnProductCategoryLanguageEntityPK) o;

        if (productCategoryid != that.productCategoryid) return false;
        if (languageid != that.languageid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productCategoryid;
        result = 31 * result + languageid;
        return result;
    }
}
