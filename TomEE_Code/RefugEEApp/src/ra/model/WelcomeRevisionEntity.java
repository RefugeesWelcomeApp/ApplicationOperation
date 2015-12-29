package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_revision", schema = "refugeewiki", catalog = "")
public class WelcomeRevisionEntity {
    private int revId;
    private int revPage;
    private int revTextId;
    private byte[] revComment;
    private int revUser;
    private byte[] revUserText;
    private byte[] revTimestamp;
    private byte revMinorEdit;
    private byte revDeleted;
    private Integer revLen;
    private Integer revParentId;
    private byte[] revSha1;
    private byte[] revContentModel;
    private byte[] revContentFormat;

    @Id
    @Column(name = "rev_id", nullable = false)
    public int getRevId() {
        return revId;
    }

    public void setRevId(int revId) {
        this.revId = revId;
    }

    @Basic
    @Column(name = "rev_page", nullable = false)
    public int getRevPage() {
        return revPage;
    }

    public void setRevPage(int revPage) {
        this.revPage = revPage;
    }

    @Basic
    @Column(name = "rev_text_id", nullable = false)
    public int getRevTextId() {
        return revTextId;
    }

    public void setRevTextId(int revTextId) {
        this.revTextId = revTextId;
    }

    @Basic
    @Column(name = "rev_comment", nullable = false)
    public byte[] getRevComment() {
        return revComment;
    }

    public void setRevComment(byte[] revComment) {
        this.revComment = revComment;
    }

    @Basic
    @Column(name = "rev_user", nullable = false)
    public int getRevUser() {
        return revUser;
    }

    public void setRevUser(int revUser) {
        this.revUser = revUser;
    }

    @Basic
    @Column(name = "rev_user_text", nullable = false)
    public byte[] getRevUserText() {
        return revUserText;
    }

    public void setRevUserText(byte[] revUserText) {
        this.revUserText = revUserText;
    }

    @Basic
    @Column(name = "rev_timestamp", nullable = false)
    public byte[] getRevTimestamp() {
        return revTimestamp;
    }

    public void setRevTimestamp(byte[] revTimestamp) {
        this.revTimestamp = revTimestamp;
    }

    @Basic
    @Column(name = "rev_minor_edit", nullable = false)
    public byte getRevMinorEdit() {
        return revMinorEdit;
    }

    public void setRevMinorEdit(byte revMinorEdit) {
        this.revMinorEdit = revMinorEdit;
    }

    @Basic
    @Column(name = "rev_deleted", nullable = false)
    public byte getRevDeleted() {
        return revDeleted;
    }

    public void setRevDeleted(byte revDeleted) {
        this.revDeleted = revDeleted;
    }

    @Basic
    @Column(name = "rev_len", nullable = true)
    public Integer getRevLen() {
        return revLen;
    }

    public void setRevLen(Integer revLen) {
        this.revLen = revLen;
    }

    @Basic
    @Column(name = "rev_parent_id", nullable = true)
    public Integer getRevParentId() {
        return revParentId;
    }

    public void setRevParentId(Integer revParentId) {
        this.revParentId = revParentId;
    }

    @Basic
    @Column(name = "rev_sha1", nullable = false)
    public byte[] getRevSha1() {
        return revSha1;
    }

    public void setRevSha1(byte[] revSha1) {
        this.revSha1 = revSha1;
    }

    @Basic
    @Column(name = "rev_content_model", nullable = true)
    public byte[] getRevContentModel() {
        return revContentModel;
    }

    public void setRevContentModel(byte[] revContentModel) {
        this.revContentModel = revContentModel;
    }

    @Basic
    @Column(name = "rev_content_format", nullable = true)
    public byte[] getRevContentFormat() {
        return revContentFormat;
    }

    public void setRevContentFormat(byte[] revContentFormat) {
        this.revContentFormat = revContentFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeRevisionEntity that = (WelcomeRevisionEntity) o;

        if (revId != that.revId) return false;
        if (revPage != that.revPage) return false;
        if (revTextId != that.revTextId) return false;
        if (revUser != that.revUser) return false;
        if (revMinorEdit != that.revMinorEdit) return false;
        if (revDeleted != that.revDeleted) return false;
        if (!Arrays.equals(revComment, that.revComment)) return false;
        if (!Arrays.equals(revUserText, that.revUserText)) return false;
        if (!Arrays.equals(revTimestamp, that.revTimestamp)) return false;
        if (revLen != null ? !revLen.equals(that.revLen) : that.revLen != null) return false;
        if (revParentId != null ? !revParentId.equals(that.revParentId) : that.revParentId != null) return false;
        if (!Arrays.equals(revSha1, that.revSha1)) return false;
        if (!Arrays.equals(revContentModel, that.revContentModel)) return false;
        if (!Arrays.equals(revContentFormat, that.revContentFormat)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = revId;
        result = 31 * result + revPage;
        result = 31 * result + revTextId;
        result = 31 * result + Arrays.hashCode(revComment);
        result = 31 * result + revUser;
        result = 31 * result + Arrays.hashCode(revUserText);
        result = 31 * result + Arrays.hashCode(revTimestamp);
        result = 31 * result + (int) revMinorEdit;
        result = 31 * result + (int) revDeleted;
        result = 31 * result + (revLen != null ? revLen.hashCode() : 0);
        result = 31 * result + (revParentId != null ? revParentId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(revSha1);
        result = 31 * result + Arrays.hashCode(revContentModel);
        result = 31 * result + Arrays.hashCode(revContentFormat);
        return result;
    }
}
