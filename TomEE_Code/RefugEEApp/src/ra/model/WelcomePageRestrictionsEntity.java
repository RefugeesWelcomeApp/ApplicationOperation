package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_page_restrictions", schema = "refugeewiki", catalog = "")
public class WelcomePageRestrictionsEntity {
    private int prId;
    private int prPage;
    private byte[] prType;
    private byte[] prLevel;
    private byte prCascade;
    private Integer prUser;
    private byte[] prExpiry;

    @Id
    @Column(name = "pr_id", nullable = false)
    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
    }

    @Basic
    @Column(name = "pr_page", nullable = false)
    public int getPrPage() {
        return prPage;
    }

    public void setPrPage(int prPage) {
        this.prPage = prPage;
    }

    @Basic
    @Column(name = "pr_type", nullable = false)
    public byte[] getPrType() {
        return prType;
    }

    public void setPrType(byte[] prType) {
        this.prType = prType;
    }

    @Basic
    @Column(name = "pr_level", nullable = false)
    public byte[] getPrLevel() {
        return prLevel;
    }

    public void setPrLevel(byte[] prLevel) {
        this.prLevel = prLevel;
    }

    @Basic
    @Column(name = "pr_cascade", nullable = false)
    public byte getPrCascade() {
        return prCascade;
    }

    public void setPrCascade(byte prCascade) {
        this.prCascade = prCascade;
    }

    @Basic
    @Column(name = "pr_user", nullable = true)
    public Integer getPrUser() {
        return prUser;
    }

    public void setPrUser(Integer prUser) {
        this.prUser = prUser;
    }

    @Basic
    @Column(name = "pr_expiry", nullable = true)
    public byte[] getPrExpiry() {
        return prExpiry;
    }

    public void setPrExpiry(byte[] prExpiry) {
        this.prExpiry = prExpiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomePageRestrictionsEntity that = (WelcomePageRestrictionsEntity) o;

        if (prId != that.prId) return false;
        if (prPage != that.prPage) return false;
        if (prCascade != that.prCascade) return false;
        if (!Arrays.equals(prType, that.prType)) return false;
        if (!Arrays.equals(prLevel, that.prLevel)) return false;
        if (prUser != null ? !prUser.equals(that.prUser) : that.prUser != null) return false;
        if (!Arrays.equals(prExpiry, that.prExpiry)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prId;
        result = 31 * result + prPage;
        result = 31 * result + Arrays.hashCode(prType);
        result = 31 * result + Arrays.hashCode(prLevel);
        result = 31 * result + (int) prCascade;
        result = 31 * result + (prUser != null ? prUser.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(prExpiry);
        return result;
    }
}
