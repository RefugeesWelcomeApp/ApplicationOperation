package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "tbl_product_category", schema = "RefugeesWelcomeApp", catalog = "")
public class TblProductCategoryEntity {
    private int idtblProductCategory;
    private Integer maincategory;
    private byte[] attachments;

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
    @Column(name = "attachments", nullable = true)
    public byte[] getAttachments() {
        return attachments;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblProductCategoryEntity that = (TblProductCategoryEntity) o;

        if (idtblProductCategory != that.idtblProductCategory) return false;
        if (maincategory != null ? !maincategory.equals(that.maincategory) : that.maincategory != null) return false;
        if (!Arrays.equals(attachments, that.attachments)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtblProductCategory;
        result = 31 * result + (maincategory != null ? maincategory.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(attachments);
        return result;
    }
}
