package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by the-l_000 on 13.12.2015.
 */
public class RltnProductCategoryEntityPK implements Serializable {
    private int product;
    private int category;

    @Column(name = "product", nullable = false)
    @Id
    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Column(name = "category", nullable = false)
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
