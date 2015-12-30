package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/30.
 */
public class ViewProduktUebersetzungEntityPK implements Serializable {
    private int idProdukt;
    private String translation;
    private int idtblLanguage;

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

    @Column(name = "idtbl_language", nullable = false)
    @Id
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

        ViewProduktUebersetzungEntityPK that = (ViewProduktUebersetzungEntityPK) o;

        if (idProdukt != that.idProdukt) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        return translation.equals(that.translation);

    }

    @Override
    public int hashCode() {
        int result = idProdukt;
        result = 31 * result + translation.hashCode();
        result = 31 * result + idtblLanguage;
        return result;
    }
}
