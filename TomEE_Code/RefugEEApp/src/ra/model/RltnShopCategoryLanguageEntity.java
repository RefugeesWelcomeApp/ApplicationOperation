package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/24.
 */
@Entity
@Table(name = "rltn_shop_category_language", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(RltnShopCategoryLanguageEntityPK.class)
public class RltnShopCategoryLanguageEntity {
    private int shopCategory;
    private int languageid;
    private String translation;

    @Id
    @Column(name = "shop_category")
    public int getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(int shopCategory) {
        this.shopCategory = shopCategory;
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
