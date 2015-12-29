package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/24.
 */
@Entity
@Table(name = "rltn_product_category_language", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(RltnProductCategoryLanguageEntityPK.class)
public class RltnProductCategoryLanguageEntity {
    private int productCategoryid;
    private int languageid;
    private String translation;

    @Id
    @Column(name = "product_categoryid")
    public int getProductCategoryid() {
        return productCategoryid;
    }

    public void setProductCategoryid(int productCategoryid) {
        this.productCategoryid = productCategoryid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RltnProductCategoryLanguageEntity that = (RltnProductCategoryLanguageEntity) o;

        if (productCategoryid != that.productCategoryid) return false;
        if (languageid != that.languageid) return false;
        if (translation != null ? !translation.equals(that.translation) : that.translation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productCategoryid;
        result = 31 * result + languageid;
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        return result;
    }
}
