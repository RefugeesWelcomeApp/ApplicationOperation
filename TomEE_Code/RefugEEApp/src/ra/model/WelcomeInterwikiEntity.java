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
@Table(name = "welcome_interwiki", schema = "refugeewiki", catalog = "")
public class WelcomeInterwikiEntity {
    private byte[] iwPrefix;
    private byte[] iwUrl;
    private byte[] iwApi;
    private byte[] iwWikiid;
    private byte iwLocal;
    private byte iwTrans;

    @Basic
    @Column(name = "iw_prefix", nullable = false)
    public byte[] getIwPrefix() {
        return iwPrefix;
    }

    public void setIwPrefix(byte[] iwPrefix) {
        this.iwPrefix = iwPrefix;
    }

    @Basic
    @Column(name = "iw_url", nullable = false)
    public byte[] getIwUrl() {
        return iwUrl;
    }

    public void setIwUrl(byte[] iwUrl) {
        this.iwUrl = iwUrl;
    }

    @Basic
    @Column(name = "iw_api", nullable = false)
    public byte[] getIwApi() {
        return iwApi;
    }

    public void setIwApi(byte[] iwApi) {
        this.iwApi = iwApi;
    }

    @Basic
    @Column(name = "iw_wikiid", nullable = false)
    public byte[] getIwWikiid() {
        return iwWikiid;
    }

    public void setIwWikiid(byte[] iwWikiid) {
        this.iwWikiid = iwWikiid;
    }

    @Basic
    @Column(name = "iw_local", nullable = false)
    public byte getIwLocal() {
        return iwLocal;
    }

    public void setIwLocal(byte iwLocal) {
        this.iwLocal = iwLocal;
    }

    @Basic
    @Column(name = "iw_trans", nullable = false)
    public byte getIwTrans() {
        return iwTrans;
    }

    public void setIwTrans(byte iwTrans) {
        this.iwTrans = iwTrans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeInterwikiEntity that = (WelcomeInterwikiEntity) o;

        if (iwLocal != that.iwLocal) return false;
        if (iwTrans != that.iwTrans) return false;
        if (!Arrays.equals(iwPrefix, that.iwPrefix)) return false;
        if (!Arrays.equals(iwUrl, that.iwUrl)) return false;
        if (!Arrays.equals(iwApi, that.iwApi)) return false;
        if (!Arrays.equals(iwWikiid, that.iwWikiid)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(iwPrefix);
        result = 31 * result + Arrays.hashCode(iwUrl);
        result = 31 * result + Arrays.hashCode(iwApi);
        result = 31 * result + Arrays.hashCode(iwWikiid);
        result = 31 * result + (int) iwLocal;
        result = 31 * result + (int) iwTrans;
        return result;
    }
}
