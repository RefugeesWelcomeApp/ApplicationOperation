package ra.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@javax.persistence.Table(name = "welcome_ipblocks", schema = "refugeewiki", catalog = "")
public class WelcomeIpblocksEntity {
    private int ipbId;

    @Id
    @javax.persistence.Column(name = "ipb_id", nullable = false)
    public int getIpbId() {
        return ipbId;
    }

    public void setIpbId(int ipbId) {
        this.ipbId = ipbId;
    }

    private Serializable ipbAddress;

    @Basic
    @javax.persistence.Column(name = "ipb_address", nullable = false)
    public Serializable getIpbAddress() {
        return ipbAddress;
    }

    public void setIpbAddress(Serializable ipbAddress) {
        this.ipbAddress = ipbAddress;
    }

    private int ipbUser;

    @Basic
    @javax.persistence.Column(name = "ipb_user", nullable = false)
    public int getIpbUser() {
        return ipbUser;
    }

    public void setIpbUser(int ipbUser) {
        this.ipbUser = ipbUser;
    }

    private int ipbBy;

    @Basic
    @javax.persistence.Column(name = "ipb_by", nullable = false)
    public int getIpbBy() {
        return ipbBy;
    }

    public void setIpbBy(int ipbBy) {
        this.ipbBy = ipbBy;
    }

    private byte[] ipbByText;

    @Basic
    @javax.persistence.Column(name = "ipb_by_text", nullable = false)
    public byte[] getIpbByText() {
        return ipbByText;
    }

    public void setIpbByText(byte[] ipbByText) {
        this.ipbByText = ipbByText;
    }

    private byte[] ipbReason;

    @Basic
    @javax.persistence.Column(name = "ipb_reason", nullable = false)
    public byte[] getIpbReason() {
        return ipbReason;
    }

    public void setIpbReason(byte[] ipbReason) {
        this.ipbReason = ipbReason;
    }

    private byte[] ipbTimestamp;

    @Basic
    @javax.persistence.Column(name = "ipb_timestamp", nullable = false)
    public byte[] getIpbTimestamp() {
        return ipbTimestamp;
    }

    public void setIpbTimestamp(byte[] ipbTimestamp) {
        this.ipbTimestamp = ipbTimestamp;
    }

    private byte ipbAuto;

    @Basic
    @javax.persistence.Column(name = "ipb_auto", nullable = false)
    public byte getIpbAuto() {
        return ipbAuto;
    }

    public void setIpbAuto(byte ipbAuto) {
        this.ipbAuto = ipbAuto;
    }

    private byte ipbAnonOnly;

    @Basic
    @javax.persistence.Column(name = "ipb_anon_only", nullable = false)
    public byte getIpbAnonOnly() {
        return ipbAnonOnly;
    }

    public void setIpbAnonOnly(byte ipbAnonOnly) {
        this.ipbAnonOnly = ipbAnonOnly;
    }

    private byte ipbCreateAccount;

    @Basic
    @javax.persistence.Column(name = "ipb_create_account", nullable = false)
    public byte getIpbCreateAccount() {
        return ipbCreateAccount;
    }

    public void setIpbCreateAccount(byte ipbCreateAccount) {
        this.ipbCreateAccount = ipbCreateAccount;
    }

    private byte ipbEnableAutoblock;

    @Basic
    @javax.persistence.Column(name = "ipb_enable_autoblock", nullable = false)
    public byte getIpbEnableAutoblock() {
        return ipbEnableAutoblock;
    }

    public void setIpbEnableAutoblock(byte ipbEnableAutoblock) {
        this.ipbEnableAutoblock = ipbEnableAutoblock;
    }

    private byte[] ipbExpiry;

    @Basic
    @javax.persistence.Column(name = "ipb_expiry", nullable = false)
    public byte[] getIpbExpiry() {
        return ipbExpiry;
    }

    public void setIpbExpiry(byte[] ipbExpiry) {
        this.ipbExpiry = ipbExpiry;
    }

    private Serializable ipbRangeStart;

    @Basic
    @javax.persistence.Column(name = "ipb_range_start", nullable = false)
    public Serializable getIpbRangeStart() {
        return ipbRangeStart;
    }

    public void setIpbRangeStart(Serializable ipbRangeStart) {
        this.ipbRangeStart = ipbRangeStart;
    }

    private Serializable ipbRangeEnd;

    @Basic
    @javax.persistence.Column(name = "ipb_range_end", nullable = false)
    public Serializable getIpbRangeEnd() {
        return ipbRangeEnd;
    }

    public void setIpbRangeEnd(Serializable ipbRangeEnd) {
        this.ipbRangeEnd = ipbRangeEnd;
    }

    private byte ipbDeleted;

    @Basic
    @javax.persistence.Column(name = "ipb_deleted", nullable = false)
    public byte getIpbDeleted() {
        return ipbDeleted;
    }

    public void setIpbDeleted(byte ipbDeleted) {
        this.ipbDeleted = ipbDeleted;
    }

    private byte ipbBlockEmail;

    @Basic
    @javax.persistence.Column(name = "ipb_block_email", nullable = false)
    public byte getIpbBlockEmail() {
        return ipbBlockEmail;
    }

    public void setIpbBlockEmail(byte ipbBlockEmail) {
        this.ipbBlockEmail = ipbBlockEmail;
    }

    private byte ipbAllowUsertalk;

    @Basic
    @javax.persistence.Column(name = "ipb_allow_usertalk", nullable = false)
    public byte getIpbAllowUsertalk() {
        return ipbAllowUsertalk;
    }

    public void setIpbAllowUsertalk(byte ipbAllowUsertalk) {
        this.ipbAllowUsertalk = ipbAllowUsertalk;
    }

    private Integer ipbParentBlockId;

    @Basic
    @javax.persistence.Column(name = "ipb_parent_block_id", nullable = true)
    public Integer getIpbParentBlockId() {
        return ipbParentBlockId;
    }

    public void setIpbParentBlockId(Integer ipbParentBlockId) {
        this.ipbParentBlockId = ipbParentBlockId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeIpblocksEntity that = (WelcomeIpblocksEntity) o;

        if (ipbId != that.ipbId) return false;
        if (ipbUser != that.ipbUser) return false;
        if (ipbBy != that.ipbBy) return false;
        if (ipbAuto != that.ipbAuto) return false;
        if (ipbAnonOnly != that.ipbAnonOnly) return false;
        if (ipbCreateAccount != that.ipbCreateAccount) return false;
        if (ipbEnableAutoblock != that.ipbEnableAutoblock) return false;
        if (ipbDeleted != that.ipbDeleted) return false;
        if (ipbBlockEmail != that.ipbBlockEmail) return false;
        if (ipbAllowUsertalk != that.ipbAllowUsertalk) return false;
        if (ipbAddress != null ? !ipbAddress.equals(that.ipbAddress) : that.ipbAddress != null) return false;
        if (!Arrays.equals(ipbByText, that.ipbByText)) return false;
        if (!Arrays.equals(ipbReason, that.ipbReason)) return false;
        if (!Arrays.equals(ipbTimestamp, that.ipbTimestamp)) return false;
        if (!Arrays.equals(ipbExpiry, that.ipbExpiry)) return false;
        if (ipbRangeStart != null ? !ipbRangeStart.equals(that.ipbRangeStart) : that.ipbRangeStart != null)
            return false;
        if (ipbRangeEnd != null ? !ipbRangeEnd.equals(that.ipbRangeEnd) : that.ipbRangeEnd != null) return false;
        if (ipbParentBlockId != null ? !ipbParentBlockId.equals(that.ipbParentBlockId) : that.ipbParentBlockId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ipbId;
        result = 31 * result + (ipbAddress != null ? ipbAddress.hashCode() : 0);
        result = 31 * result + ipbUser;
        result = 31 * result + ipbBy;
        result = 31 * result + Arrays.hashCode(ipbByText);
        result = 31 * result + Arrays.hashCode(ipbReason);
        result = 31 * result + Arrays.hashCode(ipbTimestamp);
        result = 31 * result + (int) ipbAuto;
        result = 31 * result + (int) ipbAnonOnly;
        result = 31 * result + (int) ipbCreateAccount;
        result = 31 * result + (int) ipbEnableAutoblock;
        result = 31 * result + Arrays.hashCode(ipbExpiry);
        result = 31 * result + (ipbRangeStart != null ? ipbRangeStart.hashCode() : 0);
        result = 31 * result + (ipbRangeEnd != null ? ipbRangeEnd.hashCode() : 0);
        result = 31 * result + (int) ipbDeleted;
        result = 31 * result + (int) ipbBlockEmail;
        result = 31 * result + (int) ipbAllowUsertalk;
        result = 31 * result + (ipbParentBlockId != null ? ipbParentBlockId.hashCode() : 0);
        return result;
    }
}
