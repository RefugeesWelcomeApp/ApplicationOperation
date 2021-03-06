package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/30.
 */
public class ViewShopkategorieUebersetzungEntityPK implements Serializable {
    private int idtblShopCategory;
    private int idtblLanguage;
    private String translation;

    @Column(name = "idtbl_shop_category")
    @Id
    public int getIdtblShopCategory() {
        return idtblShopCategory;
    }

    public void setIdtblShopCategory(int idtblShopCategory) {
        this.idtblShopCategory = idtblShopCategory;
    }

    @Column(name = "idtbl_language")
    @Id
    public int getIdtblLanguage() {
        return idtblLanguage;
    }

    public void setIdtblLanguage(int idtblLanguage) {
        this.idtblLanguage = idtblLanguage;
    }

    @Column(name = "translation")
    @Id
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

        ViewShopkategorieUebersetzungEntityPK that = (ViewShopkategorieUebersetzungEntityPK) o;

        if (idtblShopCategory != that.idtblShopCategory) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        return translation.equals(that.translation);

    }

    @Override
    public int hashCode() {
        int result = idtblShopCategory;
        result = 31 * result + idtblLanguage;
        result = 31 * result + translation.hashCode();
        return result;
    }
}
