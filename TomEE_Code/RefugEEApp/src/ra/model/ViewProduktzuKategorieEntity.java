package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/30.
 */
@Entity
@Table(name = "View_Produkt_zu_kategorie", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(ViewProduktzuKategorieEntityPK.class)
public class ViewProduktzuKategorieEntity {
    private int idProdukt;
    private String translation;
    private int idtblLanguage;
    private int category;

    @Id
    @Column(name = "idProdukt", nullable = false)
    public int getIdProdukt() {
        return idProdukt;
    }

    public void setIdProdukt(int idProdukt) {
        this.idProdukt = idProdukt;
    }

    @Id
    @Column(name = "category", nullable = false)
    public int getcategory() {
        return category;
    }

    public void setcategory(int category) {
        this.category = category;
    }

    @Id
    @Column(name = "translation", nullable = false, length = 45)
    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Id
    @Column(name = "idtbl_language", nullable = false)
    public int getIdtblLanguage() {
        return idtblLanguage;
    }

    public void setIdtblLanguage(int idtblLanguage) {
        this.idtblLanguage = idtblLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewProduktzuKategorieEntity that = (ViewProduktzuKategorieEntity) o;

        if (idProdukt != that.idProdukt) return false;
        if (category != that.category) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        if (translation != null ? !translation.equals(that.translation) : that.translation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProdukt;
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        result = 31 * result + idtblLanguage;
        result = 31 * result + category;
        return result;
    }
}
