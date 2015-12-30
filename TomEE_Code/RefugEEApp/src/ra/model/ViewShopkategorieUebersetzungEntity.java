package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/30.
 */
@Entity
@Table(name = "View_Shopkategorie_Uebersetzung", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(ViewShopkategorieUebersetzungEntityPK.class)
public class ViewShopkategorieUebersetzungEntity {
    private int idtblShopCategory;
    private int idtblLanguage;
    private String translation;

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

        ViewShopkategorieUebersetzungEntity that = (ViewShopkategorieUebersetzungEntity) o;

        if (idtblShopCategory != that.idtblShopCategory) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        if (translation != null ? !translation.equals(that.translation) : that.translation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtblShopCategory;
        result = 31 * result + idtblLanguage;
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        return result;
    }
}
