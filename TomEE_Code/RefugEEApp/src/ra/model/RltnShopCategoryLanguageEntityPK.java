package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/24.
 */
public class RltnShopCategoryLanguageEntityPK implements Serializable {
    private int shopCategory;
    private int languageid;

    @Column(name = "shop_category")
    @Id
    public int getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(int shopCategory) {
        this.shopCategory = shopCategory;
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

        RltnShopCategoryLanguageEntityPK that = (RltnShopCategoryLanguageEntityPK) o;

        if (shopCategory != that.shopCategory) return false;
        if (languageid != that.languageid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shopCategory;
        result = 31 * result + languageid;
        return result;
    }
}
