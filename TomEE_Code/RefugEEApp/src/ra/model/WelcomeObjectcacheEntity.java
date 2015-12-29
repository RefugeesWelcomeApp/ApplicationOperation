package ra.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_objectcache", schema = "refugeewiki", catalog = "")
public class WelcomeObjectcacheEntity {
    private byte[] keyname;
    private byte[] value;
    private Serializable exptime;

    @Id
    @Column(name = "keyname", nullable = false)
    public byte[] getKeyname() {
        return keyname;
    }

    public void setKeyname(byte[] keyname) {
        this.keyname = keyname;
    }

    @Basic
    @Column(name = "value", nullable = true)
    public byte[] getValue() {
        return value;
    }

    public void setValue(byte[] value) {
        this.value = value;
    }

    @Basic
    @Column(name = "exptime", nullable = true)
    public Serializable getExptime() {
        return exptime;
    }

    public void setExptime(Serializable exptime) {
        this.exptime = exptime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeObjectcacheEntity that = (WelcomeObjectcacheEntity) o;

        if (!Arrays.equals(keyname, that.keyname)) return false;
        if (!Arrays.equals(value, that.value)) return false;
        if (exptime != null ? !exptime.equals(that.exptime) : that.exptime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(keyname);
        result = 31 * result + Arrays.hashCode(value);
        result = 31 * result + (exptime != null ? exptime.hashCode() : 0);
        return result;
    }
}
