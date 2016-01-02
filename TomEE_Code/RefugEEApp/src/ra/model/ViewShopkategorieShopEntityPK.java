package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 16/01/02.
 */
public class ViewShopkategorieShopEntityPK implements Serializable {
    private int idShops;
    private String shopName;
    private int shopCategory;
    private int idtblShopCategory;
    private int idtblLanguage;
    private String translation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewShopkategorieShopEntityPK that = (ViewShopkategorieShopEntityPK) o;

        if (idShops != that.idShops) return false;
        if (shopCategory != that.shopCategory) return false;
        if (idtblShopCategory != that.idtblShopCategory) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        if (!shopName.equals(that.shopName)) return false;
        return translation.equals(that.translation);

    }

    @Override
    public int hashCode() {
        int result = idShops;
        result = 31 * result + shopName.hashCode();
        result = 31 * result + shopCategory;
        result = 31 * result + idtblShopCategory;
        result = 31 * result + idtblLanguage;
        result = 31 * result + translation.hashCode();
        return result;
    }

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
}
