package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by the-l_000 on 15.12.2015.
 */
public class RltnProductShopcategoryEntityPK implements Serializable {
    private int product;
    private int shopcategory;

    @Column(name = "product", nullable = false)
    @Id
    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Column(name = "shopcategory", nullable = false)
    @Id
    public int getShopcategory() {
        return shopcategory;
    }

    public void setShopcategory(int shopcategory) {
        this.shopcategory = shopcategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RltnProductShopcategoryEntityPK that = (RltnProductShopcategoryEntityPK) o;

        if (product != that.product) return false;
        if (shopcategory != that.shopcategory) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = product;
        result = 31 * result + shopcategory;
        return result;
    }
}
