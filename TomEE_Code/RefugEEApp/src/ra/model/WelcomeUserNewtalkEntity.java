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
@Table(name = "welcome_user_newtalk", schema = "refugeewiki", catalog = "")
public class WelcomeUserNewtalkEntity {
    private int userId;
    private byte[] userIp;
    private byte[] userLastTimestamp;

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_ip", nullable = false)
    public byte[] getUserIp() {
        return userIp;
    }

    public void setUserIp(byte[] userIp) {
        this.userIp = userIp;
    }

    @Basic
    @Column(name = "user_last_timestamp", nullable = true)
    public byte[] getUserLastTimestamp() {
        return userLastTimestamp;
    }

    public void setUserLastTimestamp(byte[] userLastTimestamp) {
        this.userLastTimestamp = userLastTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeUserNewtalkEntity that = (WelcomeUserNewtalkEntity) o;

        if (userId != that.userId) return false;
        if (!Arrays.equals(userIp, that.userIp)) return false;
        if (!Arrays.equals(userLastTimestamp, that.userLastTimestamp)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + Arrays.hashCode(userIp);
        result = 31 * result + Arrays.hashCode(userLastTimestamp);
        return result;
    }
}
