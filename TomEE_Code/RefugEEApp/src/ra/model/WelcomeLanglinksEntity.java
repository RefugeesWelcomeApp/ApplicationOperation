package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_langlinks", schema = "refugeewiki", catalog = "")
public class WelcomeLanglinksEntity {
    private int llFrom;
    private byte[] llLang;
    private byte[] llTitle;

    @Basic
    @Column(name = "ll_from", nullable = false)
    public int getLlFrom() {
        return llFrom;
    }

    public void setLlFrom(int llFrom) {
        this.llFrom = llFrom;
    }

    @Basic
    @Column(name = "ll_lang", nullable = false)
    public byte[] getLlLang() {
        return llLang;
    }

    public void setLlLang(byte[] llLang) {
        this.llLang = llLang;
    }

    @Basic
    @Column(name = "ll_title", nullable = false)
    public byte[] getLlTitle() {
        return llTitle;
    }

    public void setLlTitle(byte[] llTitle) {
        this.llTitle = llTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeLanglinksEntity that = (WelcomeLanglinksEntity) o;

        if (llFrom != that.llFrom) return false;
        if (!Arrays.equals(llLang, that.llLang)) return false;
        if (!Arrays.equals(llTitle, that.llTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = llFrom;
        result = 31 * result + Arrays.hashCode(llLang);
        result = 31 * result + Arrays.hashCode(llTitle);
        return result;
    }
}
