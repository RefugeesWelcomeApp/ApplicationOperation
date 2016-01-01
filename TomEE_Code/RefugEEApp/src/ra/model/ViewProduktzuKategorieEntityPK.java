package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/30.
 */
public class ViewProduktzuKategorieEntityPK implements Serializable {
    private int idtblProductCategory;
    private int idtblLanguage;
    private String translation;
    private int category;

    @Column(name = "idtbl_product_category")
    @Id
    public int getcategory() {
        return category;
    }

    public void setcategory(int category) {
        this.category = category;
    }

    @Column(name = "idtbl_product_category")
    @Id
    public int getIdtblProductCategory() {
        return idtblProductCategory;
    }

    public void setIdtblProductCategory(int idtblProductCategory) {
        this.idtblProductCategory = idtblProductCategory;
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

        ViewProduktzuKategorieEntityPK that = (ViewProduktzuKategorieEntityPK) o;

        if (idtblProductCategory != that.idtblProductCategory) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        if (category != that.category) return false;
        return translation.equals(that.translation);

    }

    @Override
    public int hashCode() {
        int result = idtblProductCategory;
        result = 31 * result + idtblLanguage;
        result = 31 * result + category;
        result = 31 * result + translation.hashCode();
        return result;
    }
}
