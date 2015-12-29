package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by the-l_000 on 13.12.2015.
 */
public class RltnProductCategoryShopCategoryEntityPK implements Serializable {
    private int shopCategory;
    private int productCategory;

    @Column(name = "shop_category", nullable = false)
    @Id
    public int getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(int shopCategory) {
        this.shopCategory = shopCategory;
    }

    @Column(name = "product_category", nullable = false)
    @Id
    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RltnProductCategoryShopCategoryEntityPK that = (RltnProductCategoryShopCategoryEntityPK) o;

        if (shopCategory != that.shopCategory) return false;
        if (productCategory != that.productCategory) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shopCategory;
        result = 31 * result + productCategory;
        return result;
    }
}
