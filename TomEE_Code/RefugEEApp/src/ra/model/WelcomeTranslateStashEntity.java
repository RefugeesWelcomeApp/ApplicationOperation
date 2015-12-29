package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_translate_stash", schema = "refugeewiki", catalog = "")
@IdClass(WelcomeTranslateStashEntityPK.class)
public class WelcomeTranslateStashEntity {
    private int tsUser;
    private int tsNamespace;
    private byte[] tsTitle;
    private byte[] tsValue;
    private byte[] tsMetadata;

    @Id
    @Column(name = "ts_user", nullable = false)
    public int getTsUser() {
        return tsUser;
    }

    public void setTsUser(int tsUser) {
        this.tsUser = tsUser;
    }

    @Id
    @Column(name = "ts_namespace", nullable = false)
    public int getTsNamespace() {
        return tsNamespace;
    }

    public void setTsNamespace(int tsNamespace) {
        this.tsNamespace = tsNamespace;
    }

    @Id
    @Column(name = "ts_title", nullable = false)
    public byte[] getTsTitle() {
        return tsTitle;
    }

    public void setTsTitle(byte[] tsTitle) {
        this.tsTitle = tsTitle;
    }

    @Basic
    @Column(name = "ts_value", nullable = false)
    public byte[] getTsValue() {
        return tsValue;
    }

    public void setTsValue(byte[] tsValue) {
        this.tsValue = tsValue;
    }

    @Basic
    @Column(name = "ts_metadata", nullable = false)
    public byte[] getTsMetadata() {
        return tsMetadata;
    }

    public void setTsMetadata(byte[] tsMetadata) {
        this.tsMetadata = tsMetadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateStashEntity that = (WelcomeTranslateStashEntity) o;

        if (tsUser != that.tsUser) return false;
        if (tsNamespace != that.tsNamespace) return false;
        if (!Arrays.equals(tsTitle, that.tsTitle)) return false;
        if (!Arrays.equals(tsValue, that.tsValue)) return false;
        if (!Arrays.equals(tsMetadata, that.tsMetadata)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tsUser;
        result = 31 * result + tsNamespace;
        result = 31 * result + Arrays.hashCode(tsTitle);
        result = 31 * result + Arrays.hashCode(tsValue);
        result = 31 * result + Arrays.hashCode(tsMetadata);
        return result;
    }
}
