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
@Table(name = "welcome_watchlist", schema = "refugeewiki", catalog = "")
public class WelcomeWatchlistEntity {
    private int wlUser;
    private int wlNamespace;
    private byte[] wlTitle;
    private byte[] wlNotificationtimestamp;

    @Basic
    @Column(name = "wl_user", nullable = false)
    public int getWlUser() {
        return wlUser;
    }

    public void setWlUser(int wlUser) {
        this.wlUser = wlUser;
    }

    @Basic
    @Column(name = "wl_namespace", nullable = false)
    public int getWlNamespace() {
        return wlNamespace;
    }

    public void setWlNamespace(int wlNamespace) {
        this.wlNamespace = wlNamespace;
    }

    @Basic
    @Column(name = "wl_title", nullable = false)
    public byte[] getWlTitle() {
        return wlTitle;
    }

    public void setWlTitle(byte[] wlTitle) {
        this.wlTitle = wlTitle;
    }

    @Basic
    @Column(name = "wl_notificationtimestamp", nullable = true)
    public byte[] getWlNotificationtimestamp() {
        return wlNotificationtimestamp;
    }

    public void setWlNotificationtimestamp(byte[] wlNotificationtimestamp) {
        this.wlNotificationtimestamp = wlNotificationtimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeWatchlistEntity that = (WelcomeWatchlistEntity) o;

        if (wlUser != that.wlUser) return false;
        if (wlNamespace != that.wlNamespace) return false;
        if (!Arrays.equals(wlTitle, that.wlTitle)) return false;
        if (!Arrays.equals(wlNotificationtimestamp, that.wlNotificationtimestamp)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wlUser;
        result = 31 * result + wlNamespace;
        result = 31 * result + Arrays.hashCode(wlTitle);
        result = 31 * result + Arrays.hashCode(wlNotificationtimestamp);
        return result;
    }
}
