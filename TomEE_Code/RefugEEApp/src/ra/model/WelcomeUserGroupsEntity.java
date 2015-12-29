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
@Table(name = "welcome_user_groups", schema = "refugeewiki", catalog = "")
public class WelcomeUserGroupsEntity {
    private int ugUser;
    private byte[] ugGroup;

    @Basic
    @Column(name = "ug_user", nullable = false)
    public int getUgUser() {
        return ugUser;
    }

    public void setUgUser(int ugUser) {
        this.ugUser = ugUser;
    }

    @Basic
    @Column(name = "ug_group", nullable = false)
    public byte[] getUgGroup() {
        return ugGroup;
    }

    public void setUgGroup(byte[] ugGroup) {
        this.ugGroup = ugGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeUserGroupsEntity that = (WelcomeUserGroupsEntity) o;

        if (ugUser != that.ugUser) return false;
        if (!Arrays.equals(ugGroup, that.ugGroup)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ugUser;
        result = 31 * result + Arrays.hashCode(ugGroup);
        return result;
    }
}
