package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/24.
 */
public class RltnProductCategoryShopCategoryEntityPK implements Serializable {
    private int shopCategory;
    private int productCategory;

    @Column(name = "shop_category")
    @Id
    public int getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(int shopCategory) {
        this.shopCategory = shopCategory;
    }

    @Column(name = "product_category")
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
