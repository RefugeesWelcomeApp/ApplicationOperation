package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/24.
 */
@Entity
@Table(name = "rltn_product_language", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(RltnProductLanguageEntityPK.class)
public class RltnProductLanguageEntity {
    private int productid;
    private int languageid;
    private String translation;
    private String description;

    @Id
    @Column(name = "productid")
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    @Id
    @Column(name = "languageid")
    public int getLanguageid() {
        return languageid;
    }

    public void setLanguageid(int languageid) {
        this.languageid = languageid;
    }

    @Basic
    @Column(name = "translation")
    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RltnProductLanguageEntity that = (RltnProductLanguageEntity) o;

        if (productid != that.productid) return false;
        if (languageid != that.languageid) return false;
        if (translation != null ? !translation.equals(that.translation) : that.translation != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productid;
        result = 31 * result + languageid;
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
