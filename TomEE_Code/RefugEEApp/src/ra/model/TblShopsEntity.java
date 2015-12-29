package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "tbl_shops", schema = "RefugeesWelcomeApp", catalog = "")
public class TblShopsEntity {
    private int idShops;
    private String shopName;
    private int shopCategory;
    private byte[] attachment;
    private Integer quality;
    private Integer price;
    private Integer productrange;

    @Id
    @Column(name = "idShops", nullable = false)
    public int getIdShops() {
        return idShops;
    }

    public void setIdShops(int idShops) {
        this.idShops = idShops;
    }

    @Basic
    @Column(name = "shop_name", nullable = false, length = 45)
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "shop_category", nullable = false)
    public int getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(int shopCategory) {
        this.shopCategory = shopCategory;
    }

    @Basic
    @Column(name = "attachment", nullable = true)
    public byte[] getAttachment() {
        return attachment;
    }

    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }

    @Basic
    @Column(name = "quality", nullable = true)
    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    @Basic
    @Column(name = "price", nullable = true)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "productrange", nullable = true)
    public Integer getProductrange() {
        return productrange;
    }

    public void setProductrange(Integer productrange) {
        this.productrange = productrange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblShopsEntity that = (TblShopsEntity) o;

        if (idShops != that.idShops) return false;
        if (shopCategory != that.shopCategory) return false;
        if (shopName != null ? !shopName.equals(that.shopName) : that.shopName != null) return false;
        if (!Arrays.equals(attachment, that.attachment)) return false;
        if (quality != null ? !quality.equals(that.quality) : that.quality != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (productrange != null ? !productrange.equals(that.productrange) : that.productrange != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idShops;
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + shopCategory;
        result = 31 * result + Arrays.hashCode(attachment);
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (productrange != null ? productrange.hashCode() : 0);
        return result;
    }
}
