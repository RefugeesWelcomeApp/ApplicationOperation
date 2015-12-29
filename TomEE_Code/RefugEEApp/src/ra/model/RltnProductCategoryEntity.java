package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/24.
 */
@Entity
@Table(name = "rltn_product_category", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(RltnProductCategoryEntityPK.class)
public class RltnProductCategoryEntity {
    private int product;
    private int category;

    @Id
    @Column(name = "product")
    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Id
    @Column(name = "category")
    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RltnProductCategoryEntity that = (RltnProductCategoryEntity) o;

        if (product != that.product) return false;
        if (category != that.category) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = product;
        result = 31 * result + category;
        return result;
    }
}
