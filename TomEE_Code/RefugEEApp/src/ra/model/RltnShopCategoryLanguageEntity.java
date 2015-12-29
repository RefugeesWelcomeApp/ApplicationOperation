package ra.model;

import javax.persistence.*;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "rltn_shop_category_language", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(RltnShopCategoryLanguageEntityPK.class)
public class RltnShopCategoryLanguageEntity {
    private int shopCategory;
    private int languageid;
    private String translation;

    @Id
    @Column(name = "shop_category", nullable = false)
    public int getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(int shopCategory) {
        this.shopCategory = shopCategory;
    }

    @Id
    @Column(name = "languageid", nullable = false)
    public int getLanguageid() {
        return languageid;
    }

    public void setLanguageid(int languageid) {
        this.languageid = languageid;
    }

    @Basic
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

        RltnShopCategoryLanguageEntity that = (RltnShopCategoryLanguageEntity) o;

        if (shopCategory != that.shopCategory) return false;
        if (languageid != that.languageid) return false;
        if (translation != null ? !translation.equals(that.translation) : that.translation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shopCategory;
        result = 31 * result + languageid;
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        return result;
    }
}
