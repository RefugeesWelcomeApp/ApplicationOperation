package ra.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@javax.persistence.Table(name = "welcome_recentchanges", schema = "refugeewiki", catalog = "")
public class WelcomeRecentchangesEntity {
    private int rcId;

    @Id
    @javax.persistence.Column(name = "rc_id", nullable = false)
    public int getRcId() {
        return rcId;
    }

    public void setRcId(int rcId) {
        this.rcId = rcId;
    }

    private byte[] rcTimestamp;

    @Basic
    @javax.persistence.Column(name = "rc_timestamp", nullable = false)
    public byte[] getRcTimestamp() {
        return rcTimestamp;
    }

    public void setRcTimestamp(byte[] rcTimestamp) {
        this.rcTimestamp = rcTimestamp;
    }

    private int rcUser;

    @Basic
    @javax.persistence.Column(name = "rc_user", nullable = false)
    public int getRcUser() {
        return rcUser;
    }

    public void setRcUser(int rcUser) {
        this.rcUser = rcUser;
    }

    private byte[] rcUserText;

    @Basic
    @javax.persistence.Column(name = "rc_user_text", nullable = false)
    public byte[] getRcUserText() {
        return rcUserText;
    }

    public void setRcUserText(byte[] rcUserText) {
        this.rcUserText = rcUserText;
    }

    private int rcNamespace;

    @Basic
    @javax.persistence.Column(name = "rc_namespace", nullable = false)
    public int getRcNamespace() {
        return rcNamespace;
    }

    public void setRcNamespace(int rcNamespace) {
        this.rcNamespace = rcNamespace;
    }

    private byte[] rcTitle;

    @Basic
    @javax.persistence.Column(name = "rc_title", nullable = false)
    public byte[] getRcTitle() {
        return rcTitle;
    }

    public void setRcTitle(byte[] rcTitle) {
        this.rcTitle = rcTitle;
    }

    private byte[] rcComment;

    @Basic
    @javax.persistence.Column(name = "rc_comment", nullable = false)
    public byte[] getRcComment() {
        return rcComment;
    }

    public void setRcComment(byte[] rcComment) {
        this.rcComment = rcComment;
    }

    private byte rcMinor;

    @Basic
    @javax.persistence.Column(name = "rc_minor", nullable = false)
    public byte getRcMinor() {
        return rcMinor;
    }

    public void setRcMinor(byte rcMinor) {
        this.rcMinor = rcMinor;
    }

    private byte rcBot;

    @Basic
    @javax.persistence.Column(name = "rc_bot", nullable = false)
    public byte getRcBot() {
        return rcBot;
    }

    public void setRcBot(byte rcBot) {
        this.rcBot = rcBot;
    }

    private byte rcNew;

    @Basic
    @javax.persistence.Column(name = "rc_new", nullable = false)
    public byte getRcNew() {
        return rcNew;
    }

    public void setRcNew(byte rcNew) {
        this.rcNew = rcNew;
    }

    private int rcCurId;

    @Basic
    @javax.persistence.Column(name = "rc_cur_id", nullable = false)
    public int getRcCurId() {
        return rcCurId;
    }

    public void setRcCurId(int rcCurId) {
        this.rcCurId = rcCurId;
    }

    private int rcThisOldid;

    @Basic
    @javax.persistence.Column(name = "rc_this_oldid", nullable = false)
    public int getRcThisOldid() {
        return rcThisOldid;
    }

    public void setRcThisOldid(int rcThisOldid) {
        this.rcThisOldid = rcThisOldid;
    }

    private int rcLastOldid;

    @Basic
    @javax.persistence.Column(name = "rc_last_oldid", nullable = false)
    public int getRcLastOldid() {
        return rcLastOldid;
    }

    public void setRcLastOldid(int rcLastOldid) {
        this.rcLastOldid = rcLastOldid;
    }

    private byte rcType;

    @Basic
    @javax.persistence.Column(name = "rc_type", nullable = false)
    public byte getRcType() {
        return rcType;
    }

    public void setRcType(byte rcType) {
        this.rcType = rcType;
    }

    private byte[] rcSource;

    @Basic
    @javax.persistence.Column(name = "rc_source", nullable = false)
    public byte[] getRcSource() {
        return rcSource;
    }

    public void setRcSource(byte[] rcSource) {
        this.rcSource = rcSource;
    }

    private byte rcPatrolled;

    @Basic
    @javax.persistence.Column(name = "rc_patrolled", nullable = false)
    public byte getRcPatrolled() {
        return rcPatrolled;
    }

    public void setRcPatrolled(byte rcPatrolled) {
        this.rcPatrolled = rcPatrolled;
    }

    private byte[] rcIp;

    @Basic
    @javax.persistence.Column(name = "rc_ip", nullable = false)
    public byte[] getRcIp() {
        return rcIp;
    }

    public void setRcIp(byte[] rcIp) {
        this.rcIp = rcIp;
    }

    private Integer rcOldLen;

    @Basic
    @javax.persistence.Column(name = "rc_old_len", nullable = true)
    public Integer getRcOldLen() {
        return rcOldLen;
    }

    public void setRcOldLen(Integer rcOldLen) {
        this.rcOldLen = rcOldLen;
    }

    private Integer rcNewLen;

    @Basic
    @javax.persistence.Column(name = "rc_new_len", nullable = true)
    public Integer getRcNewLen() {
        return rcNewLen;
    }

    public void setRcNewLen(Integer rcNewLen) {
        this.rcNewLen = rcNewLen;
    }

    private byte rcDeleted;

    @Basic
    @javax.persistence.Column(name = "rc_deleted", nullable = false)
    public byte getRcDeleted() {
        return rcDeleted;
    }

    public void setRcDeleted(byte rcDeleted) {
        this.rcDeleted = rcDeleted;
    }

    private int rcLogid;

    @Basic
    @javax.persistence.Column(name = "rc_logid", nullable = false)
    public int getRcLogid() {
        return rcLogid;
    }

    public void setRcLogid(int rcLogid) {
        this.rcLogid = rcLogid;
    }

    private byte[] rcLogType;

    @Basic
    @javax.persistence.Column(name = "rc_log_type", nullable = true)
    public byte[] getRcLogType() {
        return rcLogType;
    }

    public void setRcLogType(byte[] rcLogType) {
        this.rcLogType = rcLogType;
    }

    private byte[] rcLogAction;

    @Basic
    @javax.persistence.Column(name = "rc_log_action", nullable = true)
    public byte[] getRcLogAction() {
        return rcLogAction;
    }

    public void setRcLogAction(byte[] rcLogAction) {
        this.rcLogAction = rcLogAction;
    }

    private byte[] rcParams;

    @Basic
    @javax.persistence.Column(name = "rc_params", nullable = true)
    public byte[] getRcParams() {
        return rcParams;
    }

    public void setRcParams(byte[] rcParams) {
        this.rcParams = rcParams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeRecentchangesEntity that = (WelcomeRecentchangesEntity) o;

        if (rcId != that.rcId) return false;
        if (rcUser != that.rcUser) return false;
        if (rcNamespace != that.rcNamespace) return false;
        if (rcMinor != that.rcMinor) return false;
        if (rcBot != that.rcBot) return false;
        if (rcNew != that.rcNew) return false;
        if (rcCurId != that.rcCurId) return false;
        if (rcThisOldid != that.rcThisOldid) return false;
        if (rcLastOldid != that.rcLastOldid) return false;
        if (rcType != that.rcType) return false;
        if (rcPatrolled != that.rcPatrolled) return false;
        if (rcDeleted != that.rcDeleted) return false;
        if (rcLogid != that.rcLogid) return false;
        if (!Arrays.equals(rcTimestamp, that.rcTimestamp)) return false;
        if (!Arrays.equals(rcUserText, that.rcUserText)) return false;
        if (!Arrays.equals(rcTitle, that.rcTitle)) return false;
        if (!Arrays.equals(rcComment, that.rcComment)) return false;
        if (!Arrays.equals(rcSource, that.rcSource)) return false;
        if (!Arrays.equals(rcIp, that.rcIp)) return false;
        if (rcOldLen != null ? !rcOldLen.equals(that.rcOldLen) : that.rcOldLen != null) return false;
        if (rcNewLen != null ? !rcNewLen.equals(that.rcNewLen) : that.rcNewLen != null) return false;
        if (!Arrays.equals(rcLogType, that.rcLogType)) return false;
        if (!Arrays.equals(rcLogAction, that.rcLogAction)) return false;
        if (!Arrays.equals(rcParams, that.rcParams)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rcId;
        result = 31 * result + Arrays.hashCode(rcTimestamp);
        result = 31 * result + rcUser;
        result = 31 * result + Arrays.hashCode(rcUserText);
        result = 31 * result + rcNamespace;
        result = 31 * result + Arrays.hashCode(rcTitle);
        result = 31 * result + Arrays.hashCode(rcComment);
        result = 31 * result + (int) rcMinor;
        result = 31 * result + (int) rcBot;
        result = 31 * result + (int) rcNew;
        result = 31 * result + rcCurId;
        result = 31 * result + rcThisOldid;
        result = 31 * result + rcLastOldid;
        result = 31 * result + (int) rcType;
        result = 31 * result + Arrays.hashCode(rcSource);
        result = 31 * result + (int) rcPatrolled;
        result = 31 * result + Arrays.hashCode(rcIp);
        result = 31 * result + (rcOldLen != null ? rcOldLen.hashCode() : 0);
        result = 31 * result + (rcNewLen != null ? rcNewLen.hashCode() : 0);
        result = 31 * result + (int) rcDeleted;
        result = 31 * result + rcLogid;
        result = 31 * result + Arrays.hashCode(rcLogType);
        result = 31 * result + Arrays.hashCode(rcLogAction);
        result = 31 * result + Arrays.hashCode(rcParams);
        return result;
    }
}
