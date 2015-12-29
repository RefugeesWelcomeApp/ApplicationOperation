package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_category", schema = "refugeewiki", catalog = "")
public class WelcomeCategoryEntity {
    private int catId;
    private byte[] catTitle;
    private int catPages;
    private int catSubcats;
    private int catFiles;

    @Id
    @Column(name = "cat_id", nullable = false)
    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    @Basic
    @Column(name = "cat_title", nullable = false)
    public byte[] getCatTitle() {
        return catTitle;
    }

    public void setCatTitle(byte[] catTitle) {
        this.catTitle = catTitle;
    }

    @Basic
    @Column(name = "cat_pages", nullable = false)
    public int getCatPages() {
        return catPages;
    }

    public void setCatPages(int catPages) {
        this.catPages = catPages;
    }

    @Basic
    @Column(name = "cat_subcats", nullable = false)
    public int getCatSubcats() {
        return catSubcats;
    }

    public void setCatSubcats(int catSubcats) {
        this.catSubcats = catSubcats;
    }

    @Basic
    @Column(name = "cat_files", nullable = false)
    public int getCatFiles() {
        return catFiles;
    }

    public void setCatFiles(int catFiles) {
        this.catFiles = catFiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeCategoryEntity that = (WelcomeCategoryEntity) o;

        if (catId != that.catId) return false;
        if (catPages != that.catPages) return false;
        if (catSubcats != that.catSubcats) return false;
        if (catFiles != that.catFiles) return false;
        if (!Arrays.equals(catTitle, that.catTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = catId;
        result = 31 * result + Arrays.hashCode(catTitle);
        result = 31 * result + catPages;
        result = 31 * result + catSubcats;
        result = 31 * result + catFiles;
        return result;
    }
}
