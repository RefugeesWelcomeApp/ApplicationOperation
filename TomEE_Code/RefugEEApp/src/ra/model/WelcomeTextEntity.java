package ra.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_text", schema = "refugeewiki", catalog = "")
public class WelcomeTextEntity {
    private int oldId;
    private byte[] oldText;
    private Serializable oldFlags;

    @Id
    @Column(name = "old_id", nullable = false)
    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    @Basic
    @Column(name = "old_text", nullable = false)
    public byte[] getOldText() {
        return oldText;
    }

    public void setOldText(byte[] oldText) {
        this.oldText = oldText;
    }

    @Basic
    @Column(name = "old_flags", nullable = false)
    public Serializable getOldFlags() {
        return oldFlags;
    }

    public void setOldFlags(Serializable oldFlags) {
        this.oldFlags = oldFlags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTextEntity that = (WelcomeTextEntity) o;

        if (oldId != that.oldId) return false;
        if (!Arrays.equals(oldText, that.oldText)) return false;
        if (oldFlags != null ? !oldFlags.equals(that.oldFlags) : that.oldFlags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oldId;
        result = 31 * result + Arrays.hashCode(oldText);
        result = 31 * result + (oldFlags != null ? oldFlags.hashCode() : 0);
        return result;
    }
}
