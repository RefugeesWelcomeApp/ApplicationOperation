package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by hinata2712 on 16/01/02.
 */
@Entity
@Table(name = "View_Shopkategorie_Shop", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(ViewShopkategorieShopEntityPK.class)
public class ViewShopkategorieShopEntity {
    private int idShops;
    private String shopName;
    private int shopCategory;
    private byte[] attachment;
    private Integer quality;
    private Integer price;
    private Integer productrange;
    private int idtblShopCategory;
    private int idtblLanguage;
    private String translation;

    @Id
    @Column(name = "idShops", nullable = false)
    public int getIdShops() {
        return idShops;
    }

    public void setIdShops(int idShops) {
        this.idShops = idShops;
    }

    @Id
    @Column(name = "shop_name", nullable = false, length = 45)
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Id
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

    @Id
    @Column(name = "idtbl_shop_category", nullable = false)
    public int getIdtblShopCategory() {
        return idtblShopCategory;
    }

    public void setIdtblShopCategory(int idtblShopCategory) {
        this.idtblShopCategory = idtblShopCategory;
    }

    @Id
    @Column(name = "idtbl_language", nullable = false)
    public int getIdtblLanguage() {
        return idtblLanguage;
    }

    public void setIdtblLanguage(int idtblLanguage) {
        this.idtblLanguage = idtblLanguage;
    }

    @Id
    @Column(name = "translation", nullable = false, length = 45)
    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewShopkategorieShopEntity that = (ViewShopkategorieShopEntity) o;

        if (idShops != that.idShops) return false;
        if (shopCategory != that.shopCategory) return false;
        if (idtblShopCategory != that.idtblShopCategory) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        if (shopName != null ? !shopName.equals(that.shopName) : that.shopName != null) return false;
        if (!Arrays.equals(attachment, that.attachment)) return false;
        if (quality != null ? !quality.equals(that.quality) : that.quality != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (productrange != null ? !productrange.equals(that.productrange) : that.productrange != null) return false;
        if (translation != null ? !translation.equals(that.translation) : that.translation != null) return false;

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
        result = 31 * result + idtblShopCategory;
        result = 31 * result + idtblLanguage;
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        return result;
    }
}
