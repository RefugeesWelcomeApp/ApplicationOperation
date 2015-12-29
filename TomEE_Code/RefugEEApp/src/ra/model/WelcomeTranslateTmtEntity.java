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
@Table(name = "welcome_translate_tmt", schema = "refugeewiki", catalog = "")
public class WelcomeTranslateTmtEntity {
    private int tmtSid;
    private byte[] tmtLang;
    private byte[] tmtText;

    @Basic
    @Column(name = "tmt_sid", nullable = false)
    public int getTmtSid() {
        return tmtSid;
    }

    public void setTmtSid(int tmtSid) {
        this.tmtSid = tmtSid;
    }

    @Basic
    @Column(name = "tmt_lang", nullable = false)
    public byte[] getTmtLang() {
        return tmtLang;
    }

    public void setTmtLang(byte[] tmtLang) {
        this.tmtLang = tmtLang;
    }

    @Basic
    @Column(name = "tmt_text", nullable = false)
    public byte[] getTmtText() {
        return tmtText;
    }

    public void setTmtText(byte[] tmtText) {
        this.tmtText = tmtText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeTranslateTmtEntity that = (WelcomeTranslateTmtEntity) o;

        if (tmtSid != that.tmtSid) return false;
        if (!Arrays.equals(tmtLang, that.tmtLang)) return false;
        if (!Arrays.equals(tmtText, that.tmtText)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tmtSid;
        result = 31 * result + Arrays.hashCode(tmtLang);
        result = 31 * result + Arrays.hashCode(tmtText);
        return result;
    }
}
