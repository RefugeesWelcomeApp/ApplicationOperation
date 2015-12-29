package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_logging", schema = "refugeewiki", catalog = "")
public class WelcomeLoggingEntity {
    private int logId;
    private byte[] logType;
    private byte[] logAction;
    private byte[] logTimestamp;
    private int logUser;
    private byte[] logUserText;
    private int logNamespace;
    private byte[] logTitle;
    private Integer logPage;
    private byte[] logComment;
    private byte[] logParams;
    private byte logDeleted;

    @Id
    @Column(name = "log_id", nullable = false)
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    @Basic
    @Column(name = "log_type", nullable = false)
    public byte[] getLogType() {
        return logType;
    }

    public void setLogType(byte[] logType) {
        this.logType = logType;
    }

    @Basic
    @Column(name = "log_action", nullable = false)
    public byte[] getLogAction() {
        return logAction;
    }

    public void setLogAction(byte[] logAction) {
        this.logAction = logAction;
    }

    @Basic
    @Column(name = "log_timestamp", nullable = false)
    public byte[] getLogTimestamp() {
        return logTimestamp;
    }

    public void setLogTimestamp(byte[] logTimestamp) {
        this.logTimestamp = logTimestamp;
    }

    @Basic
    @Column(name = "log_user", nullable = false)
    public int getLogUser() {
        return logUser;
    }

    public void setLogUser(int logUser) {
        this.logUser = logUser;
    }

    @Basic
    @Column(name = "log_user_text", nullable = false)
    public byte[] getLogUserText() {
        return logUserText;
    }

    public void setLogUserText(byte[] logUserText) {
        this.logUserText = logUserText;
    }

    @Basic
    @Column(name = "log_namespace", nullable = false)
    public int getLogNamespace() {
        return logNamespace;
    }

    public void setLogNamespace(int logNamespace) {
        this.logNamespace = logNamespace;
    }

    @Basic
    @Column(name = "log_title", nullable = false)
    public byte[] getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(byte[] logTitle) {
        this.logTitle = logTitle;
    }

    @Basic
    @Column(name = "log_page", nullable = true)
    public Integer getLogPage() {
        return logPage;
    }

    public void setLogPage(Integer logPage) {
        this.logPage = logPage;
    }

    @Basic
    @Column(name = "log_comment", nullable = false)
    public byte[] getLogComment() {
        return logComment;
    }

    public void setLogComment(byte[] logComment) {
        this.logComment = logComment;
    }

    @Basic
    @Column(name = "log_params", nullable = false)
    public byte[] getLogParams() {
        return logParams;
    }

    public void setLogParams(byte[] logParams) {
        this.logParams = logParams;
    }

    @Basic
    @Column(name = "log_deleted", nullable = false)
    public byte getLogDeleted() {
        return logDeleted;
    }

    public void setLogDeleted(byte logDeleted) {
        this.logDeleted = logDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeLoggingEntity that = (WelcomeLoggingEntity) o;

        if (logId != that.logId) return false;
        if (logUser != that.logUser) return false;
        if (logNamespace != that.logNamespace) return false;
        if (logDeleted != that.logDeleted) return false;
        if (!Arrays.equals(logType, that.logType)) return false;
        if (!Arrays.equals(logAction, that.logAction)) return false;
        if (!Arrays.equals(logTimestamp, that.logTimestamp)) return false;
        if (!Arrays.equals(logUserText, that.logUserText)) return false;
        if (!Arrays.equals(logTitle, that.logTitle)) return false;
        if (logPage != null ? !logPage.equals(that.logPage) : that.logPage != null) return false;
        if (!Arrays.equals(logComment, that.logComment)) return false;
        if (!Arrays.equals(logParams, that.logParams)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logId;
        result = 31 * result + Arrays.hashCode(logType);
        result = 31 * result + Arrays.hashCode(logAction);
        result = 31 * result + Arrays.hashCode(logTimestamp);
        result = 31 * result + logUser;
        result = 31 * result + Arrays.hashCode(logUserText);
        result = 31 * result + logNamespace;
        result = 31 * result + Arrays.hashCode(logTitle);
        result = 31 * result + (logPage != null ? logPage.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(logComment);
        result = 31 * result + Arrays.hashCode(logParams);
        result = 31 * result + (int) logDeleted;
        return result;
    }
}
