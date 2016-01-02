package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 16/01/02.
 */
public class ViewProduktZuKategorieEntityPK implements Serializable {
    private int idProdukt;
    private String translation;
    private int idtblLanguage;
    private int category;

    @Column(name = "idProdukt")
    @Id
    public int getIdProdukt() {
        return idProdukt;
    }

    public void setIdProdukt(int idProdukt) {
        this.idProdukt = idProdukt;
    }

    @Column(name = "translation")
    @Id
    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Column(name = "idtbl_language")
    @Id
    public int getIdtblLanguage() {
        return idtblLanguage;
    }

    public void setIdtblLanguage(int idtblLanguage) {
        this.idtblLanguage = idtblLanguage;
    }

    @Column(name = "category")
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

        ViewProduktZuKategorieEntityPK that = (ViewProduktZuKategorieEntityPK) o;

        if (idProdukt != that.idProdukt) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        if (category != that.category) return false;
        return translation.equals(that.translation);

    }

    @Override
    public int hashCode() {
        int result = idProdukt;
        result = 31 * result + translation.hashCode();
        result = 31 * result + idtblLanguage;
        result = 31 * result + category;
        return result;
    }
}