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
@Table(name = "welcome_protected_titles", schema = "refugeewiki", catalog = "")
public class WelcomeProtectedTitlesEntity {
    private int ptNamespace;
    private byte[] ptTitle;
    private int ptUser;
    private byte[] ptReason;
    private byte[] ptTimestamp;
    private byte[] ptExpiry;
    private byte[] ptCreatePerm;

    @Basic
    @Column(name = "pt_namespace", nullable = false)
    public int getPtNamespace() {
        return ptNamespace;
    }

    public void setPtNamespace(int ptNamespace) {
        this.ptNamespace = ptNamespace;
    }

    @Basic
    @Column(name = "pt_title", nullable = false)
    public byte[] getPtTitle() {
        return ptTitle;
    }

    public void setPtTitle(byte[] ptTitle) {
        this.ptTitle = ptTitle;
    }

    @Basic
    @Column(name = "pt_user", nullable = false)
    public int getPtUser() {
        return ptUser;
    }

    public void setPtUser(int ptUser) {
        this.ptUser = ptUser;
    }

    @Basic
    @Column(name = "pt_reason", nullable = true)
    public byte[] getPtReason() {
        return ptReason;
    }

    public void setPtReason(byte[] ptReason) {
        this.ptReason = ptReason;
    }

    @Basic
    @Column(name = "pt_timestamp", nullable = false)
    public byte[] getPtTimestamp() {
        return ptTimestamp;
    }

    public void setPtTimestamp(byte[] ptTimestamp) {
        this.ptTimestamp = ptTimestamp;
    }

    @Basic
    @Column(name = "pt_expiry", nullable = false)
    public byte[] getPtExpiry() {
        return ptExpiry;
    }

    public void setPtExpiry(byte[] ptExpiry) {
        this.ptExpiry = ptExpiry;
    }

    @Basic
    @Column(name = "pt_create_perm", nullable = false)
    public byte[] getPtCreatePerm() {
        return ptCreatePerm;
    }

    public void setPtCreatePerm(byte[] ptCreatePerm) {
        this.ptCreatePerm = ptCreatePerm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeProtectedTitlesEntity that = (WelcomeProtectedTitlesEntity) o;

        if (ptNamespace != that.ptNamespace) return false;
        if (ptUser != that.ptUser) return false;
        if (!Arrays.equals(ptTitle, that.ptTitle)) return false;
        if (!Arrays.equals(ptReason, that.ptReason)) return false;
        if (!Arrays.equals(ptTimestamp, that.ptTimestamp)) return false;
        if (!Arrays.equals(ptExpiry, that.ptExpiry)) return false;
        if (!Arrays.equals(ptCreatePerm, that.ptCreatePerm)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ptNamespace;
        result = 31 * result + Arrays.hashCode(ptTitle);
        result = 31 * result + ptUser;
        result = 31 * result + Arrays.hashCode(ptReason);
        result = 31 * result + Arrays.hashCode(ptTimestamp);
        result = 31 * result + Arrays.hashCode(ptExpiry);
        result = 31 * result + Arrays.hashCode(ptCreatePerm);
        return result;
    }
}
