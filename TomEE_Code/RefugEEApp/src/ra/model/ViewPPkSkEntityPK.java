package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hinata2712 on 15/12/30.
 */
public class ViewPPkSkEntityPK implements Serializable {
    private int idProdukt;
    private String produktname;
    private int sprachid1;

    @Column(name = "idProdukt")
    @Id
    public int getIdProdukt() {
        return idProdukt;
    }

    public void setIdProdukt(int idProdukt) {
        this.idProdukt = idProdukt;
    }

    @Column(name = "Produktname")
    @Id
    public String getProduktname() {
        return produktname;
    }

    public void setProduktname(String produktname) {
        this.produktname = produktname;
    }

    @Column(name = "Sprachid1")
    @Id
    public int getSprachid1() {
        return sprachid1;
    }

    public void setSprachid1(int sprachid1) {
        this.sprachid1 = sprachid1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewPPkSkEntityPK that = (ViewPPkSkEntityPK) o;

        if (idProdukt != that.idProdukt) return false;
        if (sprachid1 != that.sprachid1) return false;
        return produktname.equals(that.produktname);

    }

    @Override
    public int hashCode() {
        int result = idProdukt;
        result = 31 * result + produktname.hashCode();
        result = 31 * result + sprachid1;
        return result;
    }
}
