package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_oldimage", schema = "refugeewiki", catalog = "")
public class WelcomeOldimageEntity {
    private byte[] oiName;
    private byte[] oiArchiveName;
    private int oiSize;
    private int oiWidth;
    private int oiHeight;
    private int oiBits;
    private byte[] oiDescription;
    private int oiUser;
    private byte[] oiUserText;
    private byte[] oiTimestamp;
    private byte[] oiMetadata;
    private Serializable oiMediaType;
    private Serializable oiMajorMime;
    private byte[] oiMinorMime;
    private byte oiDeleted;
    private byte[] oiSha1;

    @Basic
    @Column(name = "oi_name", nullable = false)
    public byte[] getOiName() {
        return oiName;
    }

    public void setOiName(byte[] oiName) {
        this.oiName = oiName;
    }

    @Basic
    @Column(name = "oi_archive_name", nullable = false)
    public byte[] getOiArchiveName() {
        return oiArchiveName;
    }

    public void setOiArchiveName(byte[] oiArchiveName) {
        this.oiArchiveName = oiArchiveName;
    }

    @Basic
    @Column(name = "oi_size", nullable = false)
    public int getOiSize() {
        return oiSize;
    }

    public void setOiSize(int oiSize) {
        this.oiSize = oiSize;
    }

    @Basic
    @Column(name = "oi_width", nullable = false)
    public int getOiWidth() {
        return oiWidth;
    }

    public void setOiWidth(int oiWidth) {
        this.oiWidth = oiWidth;
    }

    @Basic
    @Column(name = "oi_height", nullable = false)
    public int getOiHeight() {
        return oiHeight;
    }

    public void setOiHeight(int oiHeight) {
        this.oiHeight = oiHeight;
    }

    @Basic
    @Column(name = "oi_bits", nullable = false)
    public int getOiBits() {
        return oiBits;
    }

    public void setOiBits(int oiBits) {
        this.oiBits = oiBits;
    }

    @Basic
    @Column(name = "oi_description", nullable = false)
    public byte[] getOiDescription() {
        return oiDescription;
    }

    public void setOiDescription(byte[] oiDescription) {
        this.oiDescription = oiDescription;
    }

    @Basic
    @Column(name = "oi_user", nullable = false)
    public int getOiUser() {
        return oiUser;
    }

    public void setOiUser(int oiUser) {
        this.oiUser = oiUser;
    }

    @Basic
    @Column(name = "oi_user_text", nullable = false)
    public byte[] getOiUserText() {
        return oiUserText;
    }

    public void setOiUserText(byte[] oiUserText) {
        this.oiUserText = oiUserText;
    }

    @Basic
    @Column(name = "oi_timestamp", nullable = false)
    public byte[] getOiTimestamp() {
        return oiTimestamp;
    }

    public void setOiTimestamp(byte[] oiTimestamp) {
        this.oiTimestamp = oiTimestamp;
    }

    @Basic
    @Column(name = "oi_metadata", nullable = false)
    public byte[] getOiMetadata() {
        return oiMetadata;
    }

    public void setOiMetadata(byte[] oiMetadata) {
        this.oiMetadata = oiMetadata;
    }

    @Basic
    @Column(name = "oi_media_type", nullable = true)
    public Serializable getOiMediaType() {
        return oiMediaType;
    }

    public void setOiMediaType(Serializable oiMediaType) {
        this.oiMediaType = oiMediaType;
    }

    @Basic
    @Column(name = "oi_major_mime", nullable = false, length = -1)
    public Serializable getOiMajorMime() {
        return oiMajorMime;
    }

    public void setOiMajorMime(Serializable oiMajorMime) {
        this.oiMajorMime = oiMajorMime;
    }

    @Basic
    @Column(name = "oi_minor_mime", nullable = false)
    public byte[] getOiMinorMime() {
        return oiMinorMime;
    }

    public void setOiMinorMime(byte[] oiMinorMime) {
        this.oiMinorMime = oiMinorMime;
    }

    @Basic
    @Column(name = "oi_deleted", nullable = false)
    public byte getOiDeleted() {
        return oiDeleted;
    }

    public void setOiDeleted(byte oiDeleted) {
        this.oiDeleted = oiDeleted;
    }

    @Basic
    @Column(name = "oi_sha1", nullable = false)
    public byte[] getOiSha1() {
        return oiSha1;
    }

    public void setOiSha1(byte[] oiSha1) {
        this.oiSha1 = oiSha1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeOldimageEntity that = (WelcomeOldimageEntity) o;

        if (oiSize != that.oiSize) return false;
        if (oiWidth != that.oiWidth) return false;
        if (oiHeight != that.oiHeight) return false;
        if (oiBits != that.oiBits) return false;
        if (oiUser != that.oiUser) return false;
        if (oiDeleted != that.oiDeleted) return false;
        if (!Arrays.equals(oiName, that.oiName)) return false;
        if (!Arrays.equals(oiArchiveName, that.oiArchiveName)) return false;
        if (!Arrays.equals(oiDescription, that.oiDescription)) return false;
        if (!Arrays.equals(oiUserText, that.oiUserText)) return false;
        if (!Arrays.equals(oiTimestamp, that.oiTimestamp)) return false;
        if (!Arrays.equals(oiMetadata, that.oiMetadata)) return false;
        if (oiMediaType != null ? !oiMediaType.equals(that.oiMediaType) : that.oiMediaType != null) return false;
        if (oiMajorMime != null ? !oiMajorMime.equals(that.oiMajorMime) : that.oiMajorMime != null) return false;
        if (!Arrays.equals(oiMinorMime, that.oiMinorMime)) return false;
        if (!Arrays.equals(oiSha1, that.oiSha1)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(oiName);
        result = 31 * result + Arrays.hashCode(oiArchiveName);
        result = 31 * result + oiSize;
        result = 31 * result + oiWidth;
        result = 31 * result + oiHeight;
        result = 31 * result + oiBits;
        result = 31 * result + Arrays.hashCode(oiDescription);
        result = 31 * result + oiUser;
        result = 31 * result + Arrays.hashCode(oiUserText);
        result = 31 * result + Arrays.hashCode(oiTimestamp);
        result = 31 * result + Arrays.hashCode(oiMetadata);
        result = 31 * result + (oiMediaType != null ? oiMediaType.hashCode() : 0);
        result = 31 * result + (oiMajorMime != null ? oiMajorMime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(oiMinorMime);
        result = 31 * result + (int) oiDeleted;
        result = 31 * result + Arrays.hashCode(oiSha1);
        return result;
    }
}
