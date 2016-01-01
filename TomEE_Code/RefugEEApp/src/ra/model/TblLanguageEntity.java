package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/24.
 */
@Entity
@Table(name = "tbl_language", schema = "RefugeesWelcomeApp", catalog = "")
public class TblLanguageEntity {
    private int idtblLanguage;
    private String language;
    private String nativelanguage;
    private String URL;

    @Id
    @Column(name = "idtbl_language")
    public int getIdtblLanguage() {
        return idtblLanguage;
    }

    public void setIdtblLanguage(int idtblLanguage) {
        this.idtblLanguage = idtblLanguage;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "URL")
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Basic
    @Column(name = "nativelanguage")
    public String getNativelanguage() {
        return nativelanguage;
    }

    public void setNativelanguage(String nativelanguage) {
        this.nativelanguage = nativelanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblLanguageEntity that = (TblLanguageEntity) o;

        if (idtblLanguage != that.idtblLanguage) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (URL != null ? !URL.equals(that.URL) : that.URL != null) return false;
        if (nativelanguage != null ? !nativelanguage.equals(that.nativelanguage) : that.nativelanguage != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtblLanguage;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (URL != null ? URL.hashCode() : 0);
        result = 31 * result + (nativelanguage != null ? nativelanguage.hashCode() : 0);
        return result;
    }
}
