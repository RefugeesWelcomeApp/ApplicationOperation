package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/24.
 */
public class RltnProductCategoryEntityPK implements Serializable {
    private int product;
    private int category;

    @Column(name = "product")
    @Id
    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Column(name = "category")
    @Id
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

        RltnProductCategoryEntityPK that = (RltnProductCategoryEntityPK) o;

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
