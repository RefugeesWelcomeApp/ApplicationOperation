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
@Table(name = "welcome_user_properties", schema = "refugeewiki", catalog = "")
public class WelcomeUserPropertiesEntity {
    private int upUser;
    private byte[] upProperty;
    private byte[] upValue;

    @Basic
    @Column(name = "up_user", nullable = false)
    public int getUpUser() {
        return upUser;
    }

    public void setUpUser(int upUser) {
        this.upUser = upUser;
    }

    @Basic
    @Column(name = "up_property", nullable = false)
    public byte[] getUpProperty() {
        return upProperty;
    }

    public void setUpProperty(byte[] upProperty) {
        this.upProperty = upProperty;
    }

    @Basic
    @Column(name = "up_value", nullable = true)
    public byte[] getUpValue() {
        return upValue;
    }

    public void setUpValue(byte[] upValue) {
        this.upValue = upValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeUserPropertiesEntity that = (WelcomeUserPropertiesEntity) o;

        if (upUser != that.upUser) return false;
        if (!Arrays.equals(upProperty, that.upProperty)) return false;
        if (!Arrays.equals(upValue, that.upValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = upUser;
        result = 31 * result + Arrays.hashCode(upProperty);
        result = 31 * result + Arrays.hashCode(upValue);
        return result;
    }
}
