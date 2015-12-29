package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_site_stats", schema = "refugeewiki", catalog = "")
public class WelcomeSiteStatsEntity {
    private int ssRowId;
    private Long ssTotalEdits;
    private Long ssGoodArticles;
    private Long ssTotalPages;
    private Long ssUsers;
    private Long ssActiveUsers;
    private Integer ssImages;

    @Basic
    @Column(name = "ss_row_id", nullable = false)
    public int getSsRowId() {
        return ssRowId;
    }

    public void setSsRowId(int ssRowId) {
        this.ssRowId = ssRowId;
    }

    @Basic
    @Column(name = "ss_total_edits", nullable = true)
    public Long getSsTotalEdits() {
        return ssTotalEdits;
    }

    public void setSsTotalEdits(Long ssTotalEdits) {
        this.ssTotalEdits = ssTotalEdits;
    }

    @Basic
    @Column(name = "ss_good_articles", nullable = true)
    public Long getSsGoodArticles() {
        return ssGoodArticles;
    }

    public void setSsGoodArticles(Long ssGoodArticles) {
        this.ssGoodArticles = ssGoodArticles;
    }

    @Basic
    @Column(name = "ss_total_pages", nullable = true)
    public Long getSsTotalPages() {
        return ssTotalPages;
    }

    public void setSsTotalPages(Long ssTotalPages) {
        this.ssTotalPages = ssTotalPages;
    }

    @Basic
    @Column(name = "ss_users", nullable = true)
    public Long getSsUsers() {
        return ssUsers;
    }

    public void setSsUsers(Long ssUsers) {
        this.ssUsers = ssUsers;
    }

    @Basic
    @Column(name = "ss_active_users", nullable = true)
    public Long getSsActiveUsers() {
        return ssActiveUsers;
    }

    public void setSsActiveUsers(Long ssActiveUsers) {
        this.ssActiveUsers = ssActiveUsers;
    }

    @Basic
    @Column(name = "ss_images", nullable = true)
    public Integer getSsImages() {
        return ssImages;
    }

    public void setSsImages(Integer ssImages) {
        this.ssImages = ssImages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeSiteStatsEntity that = (WelcomeSiteStatsEntity) o;

        if (ssRowId != that.ssRowId) return false;
        if (ssTotalEdits != null ? !ssTotalEdits.equals(that.ssTotalEdits) : that.ssTotalEdits != null) return false;
        if (ssGoodArticles != null ? !ssGoodArticles.equals(that.ssGoodArticles) : that.ssGoodArticles != null)
            return false;
        if (ssTotalPages != null ? !ssTotalPages.equals(that.ssTotalPages) : that.ssTotalPages != null) return false;
        if (ssUsers != null ? !ssUsers.equals(that.ssUsers) : that.ssUsers != null) return false;
        if (ssActiveUsers != null ? !ssActiveUsers.equals(that.ssActiveUsers) : that.ssActiveUsers != null)
            return false;
        if (ssImages != null ? !ssImages.equals(that.ssImages) : that.ssImages != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ssRowId;
        result = 31 * result + (ssTotalEdits != null ? ssTotalEdits.hashCode() : 0);
        result = 31 * result + (ssGoodArticles != null ? ssGoodArticles.hashCode() : 0);
        result = 31 * result + (ssTotalPages != null ? ssTotalPages.hashCode() : 0);
        result = 31 * result + (ssUsers != null ? ssUsers.hashCode() : 0);
        result = 31 * result + (ssActiveUsers != null ? ssActiveUsers.hashCode() : 0);
        result = 31 * result + (ssImages != null ? ssImages.hashCode() : 0);
        return result;
    }
}
