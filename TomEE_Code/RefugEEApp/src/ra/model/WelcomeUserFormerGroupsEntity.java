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
@Table(name = "welcome_user_former_groups", schema = "refugeewiki", catalog = "")
public class WelcomeUserFormerGroupsEntity {
    private int ufgUser;
    private byte[] ufgGroup;

    @Basic
    @Column(name = "ufg_user", nullable = false)
    public int getUfgUser() {
        return ufgUser;
    }

    public void setUfgUser(int ufgUser) {
        this.ufgUser = ufgUser;
    }

    @Basic
    @Column(name = "ufg_group", nullable = false)
    public byte[] getUfgGroup() {
        return ufgGroup;
    }

    public void setUfgGroup(byte[] ufgGroup) {
        this.ufgGroup = ufgGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeUserFormerGroupsEntity that = (WelcomeUserFormerGroupsEntity) o;

        if (ufgUser != that.ufgUser) return false;
        if (!Arrays.equals(ufgGroup, that.ufgGroup)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ufgUser;
        result = 31 * result + Arrays.hashCode(ufgGroup);
        return result;
    }
}
