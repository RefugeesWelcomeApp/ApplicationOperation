package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_searchindex", schema = "refugeewiki", catalog = "")
public class WelcomeSearchindexEntity {
    private int siPage;
    private String siTitle;
    private String siText;

    @Basic
    @Column(name = "si_page", nullable = false)
    public int getSiPage() {
        return siPage;
    }

    public void setSiPage(int siPage) {
        this.siPage = siPage;
    }

    @Basic
    @Column(name = "si_title", nullable = false, length = 255)
    public String getSiTitle() {
        return siTitle;
    }

    public void setSiTitle(String siTitle) {
        this.siTitle = siTitle;
    }

    @Basic
    @Column(name = "si_text", nullable = false, length = -1)
    public String getSiText() {
        return siText;
    }

    public void setSiText(String siText) {
        this.siText = siText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeSearchindexEntity that = (WelcomeSearchindexEntity) o;

        if (siPage != that.siPage) return false;
        if (siTitle != null ? !siTitle.equals(that.siTitle) : that.siTitle != null) return false;
        if (siText != null ? !siText.equals(that.siText) : that.siText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = siPage;
        result = 31 * result + (siTitle != null ? siTitle.hashCode() : 0);
        result = 31 * result + (siText != null ? siText.hashCode() : 0);
        return result;
    }
}
