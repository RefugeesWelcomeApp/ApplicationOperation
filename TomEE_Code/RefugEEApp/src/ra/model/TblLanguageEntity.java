package ra.model;

import javax.persistence.*;

/**
 * Created by the-l_000 on 15.12.2015.
 */
@Entity
@Table(name = "tbl_language", schema = "RefugeesWelcomeApp", catalog = "")
public class TblLanguageEntity {
    private int idtblLanguage;
    private String language;

    @Id
    @Column(name = "idtbl_language", nullable = false)
    public int getIdtblLanguage() {
        return idtblLanguage;
    }

    public void setIdtblLanguage(int idtblLanguage) {
        this.idtblLanguage = idtblLanguage;
    }

    @Basic
    @Column(name = "language", nullable = true, length = 45)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblLanguageEntity that = (TblLanguageEntity) o;

        if (idtblLanguage != that.idtblLanguage) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtblLanguage;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
