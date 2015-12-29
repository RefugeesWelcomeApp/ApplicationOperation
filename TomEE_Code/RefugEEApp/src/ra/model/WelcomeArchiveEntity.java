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
@javax.persistence.Table(name = "welcome_archive", schema = "refugeewiki", catalog = "")
public class WelcomeArchiveEntity {
    private int arId;

    @Id
    @javax.persistence.Column(name = "ar_id", nullable = false)
    public int getArId() {
        return arId;
    }

    public void setArId(int arId) {
        this.arId = arId;
    }

    private int arNamespace;

    @Basic
    @javax.persistence.Column(name = "ar_namespace", nullable = false)
    public int getArNamespace() {
        return arNamespace;
    }

    public void setArNamespace(int arNamespace) {
        this.arNamespace = arNamespace;
    }

    private byte[] arTitle;

    @Basic
    @javax.persistence.Column(name = "ar_title", nullable = false)
    public byte[] getArTitle() {
        return arTitle;
    }

    public void setArTitle(byte[] arTitle) {
        this.arTitle = arTitle;
    }

    private byte[] arText;

    @Basic
    @javax.persistence.Column(name = "ar_text", nullable = false)
    public byte[] getArText() {
        return arText;
    }

    public void setArText(byte[] arText) {
        this.arText = arText;
    }

    private byte[] arComment;

    @Basic
    @javax.persistence.Column(name = "ar_comment", nullable = false)
    public byte[] getArComment() {
        return arComment;
    }

    public void setArComment(byte[] arComment) {
        this.arComment = arComment;
    }

    private int arUser;

    @Basic
    @javax.persistence.Column(name = "ar_user", nullable = false)
    public int getArUser() {
        return arUser;
    }

    public void setArUser(int arUser) {
        this.arUser = arUser;
    }

    private byte[] arUserText;

    @Basic
    @javax.persistence.Column(name = "ar_user_text", nullable = false)
    public byte[] getArUserText() {
        return arUserText;
    }

    public void setArUserText(byte[] arUserText) {
        this.arUserText = arUserText;
    }

    private byte[] arTimestamp;

    @Basic
    @javax.persistence.Column(name = "ar_timestamp", nullable = false)
    public byte[] getArTimestamp() {
        return arTimestamp;
    }

    public void setArTimestamp(byte[] arTimestamp) {
        this.arTimestamp = arTimestamp;
    }

    private byte arMinorEdit;

    @Basic
    @javax.persistence.Column(name = "ar_minor_edit", nullable = false)
    public byte getArMinorEdit() {
        return arMinorEdit;
    }

    public void setArMinorEdit(byte arMinorEdit) {
        this.arMinorEdit = arMinorEdit;
    }

    private Serializable arFlags;

    @Basic
    @javax.persistence.Column(name = "ar_flags", nullable = false)
    public Serializable getArFlags() {
        return arFlags;
    }

    public void setArFlags(Serializable arFlags) {
        this.arFlags = arFlags;
    }

    private Integer arRevId;

    @Basic
    @javax.persistence.Column(name = "ar_rev_id", nullable = true)
    public Integer getArRevId() {
        return arRevId;
    }

    public void setArRevId(Integer arRevId) {
        this.arRevId = arRevId;
    }

    private Integer arTextId;

    @Basic
    @javax.persistence.Column(name = "ar_text_id", nullable = true)
    public Integer getArTextId() {
        return arTextId;
    }

    public void setArTextId(Integer arTextId) {
        this.arTextId = arTextId;
    }

    private byte arDeleted;

    @Basic
    @javax.persistence.Column(name = "ar_deleted", nullable = false)
    public byte getArDeleted() {
        return arDeleted;
    }

    public void setArDeleted(byte arDeleted) {
        this.arDeleted = arDeleted;
    }

    private Integer arLen;

    @Basic
    @javax.persistence.Column(name = "ar_len", nullable = true)
    public Integer getArLen() {
        return arLen;
    }

    public void setArLen(Integer arLen) {
        this.arLen = arLen;
    }

    private Integer arPageId;

    @Basic
    @javax.persistence.Column(name = "ar_page_id", nullable = true)
    public Integer getArPageId() {
        return arPageId;
    }

    public void setArPageId(Integer arPageId) {
        this.arPageId = arPageId;
    }

    private Integer arParentId;

    @Basic
    @javax.persistence.Column(name = "ar_parent_id", nullable = true)
    public Integer getArParentId() {
        return arParentId;
    }

    public void setArParentId(Integer arParentId) {
        this.arParentId = arParentId;
    }

    private byte[] arSha1;

    @Basic
    @javax.persistence.Column(name = "ar_sha1", nullable = false)
    public byte[] getArSha1() {
        return arSha1;
    }

    public void setArSha1(byte[] arSha1) {
        this.arSha1 = arSha1;
    }

    private byte[] arContentModel;

    @Basic
    @javax.persistence.Column(name = "ar_content_model", nullable = true)
    public byte[] getArContentModel() {
        return arContentModel;
    }

    public void setArContentModel(byte[] arContentModel) {
        this.arContentModel = arContentModel;
    }

    private byte[] arContentFormat;

    @Basic
    @javax.persistence.Column(name = "ar_content_format", nullable = true)
    public byte[] getArContentFormat() {
        return arContentFormat;
    }

    public void setArContentFormat(byte[] arContentFormat) {
        this.arContentFormat = arContentFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeArchiveEntity that = (WelcomeArchiveEntity) o;

        if (arId != that.arId) return false;
        if (arNamespace != that.arNamespace) return false;
        if (arUser != that.arUser) return false;
        if (arMinorEdit != that.arMinorEdit) return false;
        if (arDeleted != that.arDeleted) return false;
        if (!Arrays.equals(arTitle, that.arTitle)) return false;
        if (!Arrays.equals(arText, that.arText)) return false;
        if (!Arrays.equals(arComment, that.arComment)) return false;
        if (!Arrays.equals(arUserText, that.arUserText)) return false;
        if (!Arrays.equals(arTimestamp, that.arTimestamp)) return false;
        if (arFlags != null ? !arFlags.equals(that.arFlags) : that.arFlags != null) return false;
        if (arRevId != null ? !arRevId.equals(that.arRevId) : that.arRevId != null) return false;
        if (arTextId != null ? !arTextId.equals(that.arTextId) : that.arTextId != null) return false;
        if (arLen != null ? !arLen.equals(that.arLen) : that.arLen != null) return false;
        if (arPageId != null ? !arPageId.equals(that.arPageId) : that.arPageId != null) return false;
        if (arParentId != null ? !arParentId.equals(that.arParentId) : that.arParentId != null) return false;
        if (!Arrays.equals(arSha1, that.arSha1)) return false;
        if (!Arrays.equals(arContentModel, that.arContentModel)) return false;
        if (!Arrays.equals(arContentFormat, that.arContentFormat)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = arId;
        result = 31 * result + arNamespace;
        result = 31 * result + Arrays.hashCode(arTitle);
        result = 31 * result + Arrays.hashCode(arText);
        result = 31 * result + Arrays.hashCode(arComment);
        result = 31 * result + arUser;
        result = 31 * result + Arrays.hashCode(arUserText);
        result = 31 * result + Arrays.hashCode(arTimestamp);
        result = 31 * result + (int) arMinorEdit;
        result = 31 * result + (arFlags != null ? arFlags.hashCode() : 0);
        result = 31 * result + (arRevId != null ? arRevId.hashCode() : 0);
        result = 31 * result + (arTextId != null ? arTextId.hashCode() : 0);
        result = 31 * result + (int) arDeleted;
        result = 31 * result + (arLen != null ? arLen.hashCode() : 0);
        result = 31 * result + (arPageId != null ? arPageId.hashCode() : 0);
        result = 31 * result + (arParentId != null ? arParentId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(arSha1);
        result = 31 * result + Arrays.hashCode(arContentModel);
        result = 31 * result + Arrays.hashCode(arContentFormat);
        return result;
    }
}
