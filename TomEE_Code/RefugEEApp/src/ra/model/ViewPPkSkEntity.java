package ra.model;

import javax.persistence.*;

/**
 * Created by hinata2712 on 15/12/30.
 */
@Entity
@Table(name = "View_P_PK_SK", schema = "RefugeesWelcomeApp", catalog = "")
@IdClass(ViewPPkSkEntityPK.class)
public class ViewPPkSkEntity {
    private int idProdukt;
    private String produktname;
    private Integer idtblProductCategory;
    private Integer maincategory;
    private String attachments;
    private String produktkategoriename;
    private Integer idtblShopCategory;
    private String shopkategoriename;
    private int sprachid1;
    private Integer sprachid2;
    private Integer sprachid3;

    @Id
    @Column(name = "idProdukt", nullable = false)
    public int getIdProdukt() {
        return idProdukt;
    }

    public void setIdProdukt(int idProdukt) {
        this.idProdukt = idProdukt;
    }

    @Id
    @Column(name = "Produktname", nullable = false, length = 45)
    public String getProduktname() {
        return produktname;
    }

    public void setProduktname(String produktname) {
        this.produktname = produktname;
    }

    @Basic
    @Column(name = "idtbl_product_category", nullable = true)
    public Integer getIdtblProductCategory() {
        return idtblProductCategory;
    }

    public void setIdtblProductCategory(Integer idtblProductCategory) {
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

    @Basic
    @Column(name = "Produktkategoriename", nullable = true, length = 45)
    public String getProduktkategoriename() {
        return produktkategoriename;
    }

    public void setProduktkategoriename(String produktkategoriename) {
        this.produktkategoriename = produktkategoriename;
    }

    @Basic
    @Column(name = "idtbl_shop_category", nullable = true)
    public Integer getIdtblShopCategory() {
        return idtblShopCategory;
    }

    public void setIdtblShopCategory(Integer idtblShopCategory) {
        this.idtblShopCategory = idtblShopCategory;
    }

    @Basic
    @Column(name = "Shopkategoriename", nullable = true, length = 45)
    public String getShopkategoriename() {
        return shopkategoriename;
    }

    public void setShopkategoriename(String shopkategoriename) {
        this.shopkategoriename = shopkategoriename;
    }

    @Id
    @Column(name = "Sprachid1", nullable = false)
    public int getSprachid1() {
        return sprachid1;
    }

    public void setSprachid1(int sprachid1) {
        this.sprachid1 = sprachid1;
    }

    @Basic
    @Column(name = "Sprachid2", nullable = true)
    public Integer getSprachid2() {
        return sprachid2;
    }

    public void setSprachid2(Integer sprachid2) {
        this.sprachid2 = sprachid2;
    }

    @Basic
    @Column(name = "Sprachid3", nullable = true)
    public Integer getSprachid3() {
        return sprachid3;
    }

    public void setSprachid3(Integer sprachid3) {
        this.sprachid3 = sprachid3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewPPkSkEntity that = (ViewPPkSkEntity) o;

        if (idProdukt != that.idProdukt) return false;
        if (sprachid1 != that.sprachid1) return false;
        if (produktname != null ? !produktname.equals(that.produktname) : that.produktname != null) return false;
        if (idtblProductCategory != null ? !idtblProductCategory.equals(that.idtblProductCategory) : that.idtblProductCategory != null)
            return false;
        if (maincategory != null ? !maincategory.equals(that.maincategory) : that.maincategory != null) return false;
        if (attachments != null ? !attachments.equals(that.attachments) : that.attachments != null) return false;
        if (produktkategoriename != null ? !produktkategoriename.equals(that.produktkategoriename) : that.produktkategoriename != null)
            return false;
        if (idtblShopCategory != null ? !idtblShopCategory.equals(that.idtblShopCategory) : that.idtblShopCategory != null)
            return false;
        if (shopkategoriename != null ? !shopkategoriename.equals(that.shopkategoriename) : that.shopkategoriename != null)
            return false;
        if (sprachid2 != null ? !sprachid2.equals(that.sprachid2) : that.sprachid2 != null) return false;
        if (sprachid3 != null ? !sprachid3.equals(that.sprachid3) : that.sprachid3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProdukt;
        result = 31 * result + (produktname != null ? produktname.hashCode() : 0);
        result = 31 * result + (idtblProductCategory != null ? idtblProductCategory.hashCode() : 0);
        result = 31 * result + (maincategory != null ? maincategory.hashCode() : 0);
        result = 31 * result + (attachments != null ? attachments.hashCode() : 0);
        result = 31 * result + (produktkategoriename != null ? produktkategoriename.hashCode() : 0);
        result = 31 * result + (idtblShopCategory != null ? idtblShopCategory.hashCode() : 0);
        result = 31 * result + (shopkategoriename != null ? shopkategoriename.hashCode() : 0);
        result = 31 * result + sprachid1;
        result = 31 * result + (sprachid2 != null ? sprachid2.hashCode() : 0);
        result = 31 * result + (sprachid3 != null ? sprachid3.hashCode() : 0);
        return result;
    }
}
