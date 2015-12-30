package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/30.
 */
@Entity
@Table(name = "View_Produktkategorie_Uebersetzung", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(ViewProduktkategorieUebersetzungEntityPK.class)
public class ViewProduktkategorieUebersetzungEntity {
    private int idtblProductCategory;
    private Integer maincategory;
    private String attachments;
    private int idtblLanguage;
    private String translation;

    @Id
    @Column(name = "idtbl_product_category", nullable = false)
    public int getIdtblProductCategory() {
        return idtblProductCategory;
    }

    public void setIdtblProductCategory(int idtblProductCategory) {
        this.idtblProductCategory = idtblProductCategory;
    }

    @Basic
    @Column(name = "maincategory", nullable = true)
    public Integer getMaincategory() {
        return maincategory;
    }

    public void setMaincategory(Integer maincategory) {
        this.maincategory = maincategory;
    }

    @Basic
    @Column(name = "attachments", nullable = true, length = 100)
    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
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

        ViewProduktkategorieUebersetzungEntity that = (ViewProduktkategorieUebersetzungEntity) o;

        if (idtblProductCategory != that.idtblProductCategory) return false;
        if (idtblLanguage != that.idtblLanguage) return false;
        if (maincategory != null ? !maincategory.equals(that.maincategory) : that.maincategory != null) return false;
        if (attachments != null ? !attachments.equals(that.attachments) : that.attachments != null) return false;
        if (translation != null ? !translation.equals(that.translation) : that.translation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtblProductCategory;
        result = 31 * result + (maincategory != null ? maincategory.hashCode() : 0);
        result = 31 * result + (attachments != null ? attachments.hashCode() : 0);
        result = 31 * result + idtblLanguage;
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        return result;
    }
}
