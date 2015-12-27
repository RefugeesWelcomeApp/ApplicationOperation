package ra.model;

import javax.persistence.*;

/**
 * Created by the-l_000 on 15.12.2015.
 */
@Entity
@Table(name = "rltn_product_category_shop_category", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(RltnProductCategoryShopCategoryEntityPK.class)
public class RltnProductCategoryShopCategoryEntity {
    private int shopCategory;
    private int productCategory;

    @Id
    @Column(name = "shop_category", nullable = false)
    public int getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(int shopCategory) {
        this.shopCategory = shopCategory;
    }

    @Id
    @Column(name = "product_category", nullable = false)
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

        RltnProductCategoryShopCategoryEntity that = (RltnProductCategoryShopCategoryEntity) o;

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
