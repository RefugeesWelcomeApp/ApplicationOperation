package ra.model;

import javax.persistence.*;

/**
 * Created by the-l_000 on 15.12.2015.
 */
@Entity
@Table(name = "tbl_shop_category", schema = "RefugeesWelcomeApp", catalog = "")
public class TblShopCategoryEntity {
    private int idtblShopCategory;
    private String osmBezeichner;

    @Id
    @Column(name = "idtbl_shop_category", nullable = false)
    public int getIdtblShopCategory() {
        return idtblShopCategory;
    }

    public void setIdtblShopCategory(int idtblShopCategory) {
        this.idtblShopCategory = idtblShopCategory;
    }

    @Basic
    @Column(name = "OSM Bezeichner", nullable = false, length = 45)
    public String getOsmBezeichner() {
        return osmBezeichner;
    }

    public void setOsmBezeichner(String osmBezeichner) {
        this.osmBezeichner = osmBezeichner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblShopCategoryEntity that = (TblShopCategoryEntity) o;

        if (idtblShopCategory != that.idtblShopCategory) return false;
        if (osmBezeichner != null ? !osmBezeichner.equals(that.osmBezeichner) : that.osmBezeichner != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtblShopCategory;
        result = 31 * result + (osmBezeichner != null ? osmBezeichner.hashCode() : 0);
        return result;
    }
}
