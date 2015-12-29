package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_translate_reviews", schema = "refugeewiki", catalog = "")
public class WelcomeTranslateReviewsEntity {
    private int trrUser;
    private int trrPage;
    private int trrRevision;

    @Basic
    @Column(name = "trr_user", nullable = false)
    public int getTrrUser() {
        return trrUser;
    }

    public void setTrrUser(int trrUser) {
        this.trrUser = trrUser;
    }

    @Basic
    @Column(name = "trr_page", nullable = false)
    public int getTrrPage() {
        return trrPage;
    }

    public void setTrrPage(int trrPage) {
        this.trrPage = trrPage;
    }

    @Basic
    @Column(name = "trr_revision", nullable = false)
    public int getTrrRevision() {
        return trrRevision;
    }

    public void setTrrRevision(int trrRevision) {
        this.trrRevision = trrRevision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateReviewsEntity that = (WelcomeTranslateReviewsEntity) o;

        if (trrUser != that.trrUser) return false;
        if (trrPage != that.trrPage) return false;
        if (trrRevision != that.trrRevision) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trrUser;
        result = 31 * result + trrPage;
        result = 31 * result + trrRevision;
        return result;
    }
}
