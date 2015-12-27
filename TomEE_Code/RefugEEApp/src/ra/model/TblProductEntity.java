package ra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by the-l_000 on 15.12.2015.
 */
@Entity
@Table(name = "tbl_product", schema = "RefugeesWelcomeApp", catalog = "")
public class TblProductEntity {
    private int idProdukt;

    @Id
    @Column(name = "idProdukt", nullable = false)
    public int getIdProdukt() {
        return idProdukt;
    }

    public void setIdProdukt(int idProdukt) {
        this.idProdukt = idProdukt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblProductEntity that = (TblProductEntity) o;

        if (idProdukt != that.idProdukt) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idProdukt;
    }
}
