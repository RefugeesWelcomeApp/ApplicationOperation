package ra.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
public class WelcomeTranslateStashEntityPK implements Serializable {
    private int tsUser;
    private int tsNamespace;
    private byte[] tsTitle;

    @Column(name = "ts_user", nullable = false)
    @Id
    public int getTsUser() {
        return tsUser;
    }

    public void setTsUser(int tsUser) {
        this.tsUser = tsUser;
    }

    @Column(name = "ts_namespace", nullable = false)
    @Id
    public int getTsNamespace() {
        return tsNamespace;
    }

    public void setTsNamespace(int tsNamespace) {
        this.tsNamespace = tsNamespace;
    }

    @Column(name = "ts_title", nullable = false)
    @Id
    public byte[] getTsTitle() {
        return tsTitle;
    }

    public void setTsTitle(byte[] tsTitle) {
        this.tsTitle = tsTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateStashEntityPK that = (WelcomeTranslateStashEntityPK) o;

        if (tsUser != that.tsUser) return false;
        if (tsNamespace != that.tsNamespace) return false;
        if (!Arrays.equals(tsTitle, that.tsTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tsUser;
        result = 31 * result + tsNamespace;
        result = 31 * result + Arrays.hashCode(tsTitle);
        return result;
    }
}
