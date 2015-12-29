package ra.model;

import javax.persistence.*;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "rltn_product_shopcategory", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(RltnProductShopcategoryEntityPK.class)
public class RltnProductShopcategoryEntity {
    private int product;
    private int shopcategory;

    @Id
    @Column(name = "product", nullable = false)
    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Id
    @Column(name = "shopcategory", nullable = false)
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

        RltnProductShopcategoryEntity that = (RltnProductShopcategoryEntity) o;

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
