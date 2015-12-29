package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_translate_groupreviews", schema = "refugeewiki", catalog = "")
@IdClass(WelcomeTranslateGroupreviewsEntityPK.class)
public class WelcomeTranslateGroupreviewsEntity {
    private byte[] tgrGroup;
    private byte[] tgrLang;
    private byte[] tgrState;

    @Id
    @Column(name = "tgr_group", nullable = false)
    public byte[] getTgrGroup() {
        return tgrGroup;
    }

    public void setTgrGroup(byte[] tgrGroup) {
        this.tgrGroup = tgrGroup;
    }

    @Id
    @Column(name = "tgr_lang", nullable = false)
    public byte[] getTgrLang() {
        return tgrLang;
    }

    public void setTgrLang(byte[] tgrLang) {
        this.tgrLang = tgrLang;
    }

    @Basic
    @Column(name = "tgr_state", nullable = false)
    public byte[] getTgrState() {
        return tgrState;
    }

    public void setTgrState(byte[] tgrState) {
        this.tgrState = tgrState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateGroupreviewsEntity that = (WelcomeTranslateGroupreviewsEntity) o;

        if (!Arrays.equals(tgrGroup, that.tgrGroup)) return false;
        if (!Arrays.equals(tgrLang, that.tgrLang)) return false;
        if (!Arrays.equals(tgrState, that.tgrState)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(tgrGroup);
        result = 31 * result + Arrays.hashCode(tgrLang);
        result = 31 * result + Arrays.hashCode(tgrState);
        return result;
    }
}
