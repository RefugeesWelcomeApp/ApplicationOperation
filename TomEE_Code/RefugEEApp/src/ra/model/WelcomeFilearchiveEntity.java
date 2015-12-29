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
@javax.persistence.Table(name = "welcome_filearchive", schema = "refugeewiki", catalog = "")
public class WelcomeFilearchiveEntity {
    private int faId;

    @Id
    @javax.persistence.Column(name = "fa_id", nullable = false)
    public int getFaId() {
        return faId;
    }

    public void setFaId(int faId) {
        this.faId = faId;
    }

    private byte[] faName;

    @Basic
    @javax.persistence.Column(name = "fa_name", nullable = false)
    public byte[] getFaName() {
        return faName;
    }

    public void setFaName(byte[] faName) {
        this.faName = faName;
    }

    private byte[] faArchiveName;

    @Basic
    @javax.persistence.Column(name = "fa_archive_name", nullable = true)
    public byte[] getFaArchiveName() {
        return faArchiveName;
    }

    public void setFaArchiveName(byte[] faArchiveName) {
        this.faArchiveName = faArchiveName;
    }

    private byte[] faStorageGroup;

    @Basic
    @javax.persistence.Column(name = "fa_storage_group", nullable = true)
    public byte[] getFaStorageGroup() {
        return faStorageGroup;
    }

    public void setFaStorageGroup(byte[] faStorageGroup) {
        this.faStorageGroup = faStorageGroup;
    }

    private byte[] faStorageKey;

    @Basic
    @javax.persistence.Column(name = "fa_storage_key", nullable = true)
    public byte[] getFaStorageKey() {
        return faStorageKey;
    }

    public void setFaStorageKey(byte[] faStorageKey) {
        this.faStorageKey = faStorageKey;
    }

    private Integer faDeletedUser;

    @Basic
    @javax.persistence.Column(name = "fa_deleted_user", nullable = true)
    public Integer getFaDeletedUser() {
        return faDeletedUser;
    }

    public void setFaDeletedUser(Integer faDeletedUser) {
        this.faDeletedUser = faDeletedUser;
    }

    private byte[] faDeletedTimestamp;

    @Basic
    @javax.persistence.Column(name = "fa_deleted_timestamp", nullable = true)
    public byte[] getFaDeletedTimestamp() {
        return faDeletedTimestamp;
    }

    public void setFaDeletedTimestamp(byte[] faDeletedTimestamp) {
        this.faDeletedTimestamp = faDeletedTimestamp;
    }

    private byte[] faDeletedReason;

    @Basic
    @javax.persistence.Column(name = "fa_deleted_reason", nullable = true)
    public byte[] getFaDeletedReason() {
        return faDeletedReason;
    }

    public void setFaDeletedReason(byte[] faDeletedReason) {
        this.faDeletedReason = faDeletedReason;
    }

    private Integer faSize;

    @Basic
    @javax.persistence.Column(name = "fa_size", nullable = true)
    public Integer getFaSize() {
        return faSize;
    }

    public void setFaSize(Integer faSize) {
        this.faSize = faSize;
    }

    private Integer faWidth;

    @Basic
    @javax.persistence.Column(name = "fa_width", nullable = true)
    public Integer getFaWidth() {
        return faWidth;
    }

    public void setFaWidth(Integer faWidth) {
        this.faWidth = faWidth;
    }

    private Integer faHeight;

    @Basic
    @javax.persistence.Column(name = "fa_height", nullable = true)
    public Integer getFaHeight() {
        return faHeight;
    }

    public void setFaHeight(Integer faHeight) {
        this.faHeight = faHeight;
    }

    private byte[] faMetadata;

    @Basic
    @javax.persistence.Column(name = "fa_metadata", nullable = true)
    public byte[] getFaMetadata() {
        return faMetadata;
    }

    public void setFaMetadata(byte[] faMetadata) {
        this.faMetadata = faMetadata;
    }

    private Integer faBits;

    @Basic
    @javax.persistence.Column(name = "fa_bits", nullable = true)
    public Integer getFaBits() {
        return faBits;
    }

    public void setFaBits(Integer faBits) {
        this.faBits = faBits;
    }

    private Serializable faMediaType;

    @Basic
    @javax.persistence.Column(name = "fa_media_type", nullable = true)
    public Serializable getFaMediaType() {
        return faMediaType;
    }

    public void setFaMediaType(Serializable faMediaType) {
        this.faMediaType = faMediaType;
    }

    private Serializable faMajorMime;

    @Basic
    @javax.persistence.Column(name = "fa_major_mime", nullable = true, length = -1)
    public Serializable getFaMajorMime() {
        return faMajorMime;
    }

    public void setFaMajorMime(Serializable faMajorMime) {
        this.faMajorMime = faMajorMime;
    }

    private byte[] faMinorMime;

    @Basic
    @javax.persistence.Column(name = "fa_minor_mime", nullable = true)
    public byte[] getFaMinorMime() {
        return faMinorMime;
    }

    public void setFaMinorMime(byte[] faMinorMime) {
        this.faMinorMime = faMinorMime;
    }

    private byte[] faDescription;

    @Basic
    @javax.persistence.Column(name = "fa_description", nullable = true)
    public byte[] getFaDescription() {
        return faDescription;
    }

    public void setFaDescription(byte[] faDescription) {
        this.faDescription = faDescription;
    }

    private Integer faUser;

    @Basic
    @javax.persistence.Column(name = "fa_user", nullable = true)
    public Integer getFaUser() {
        return faUser;
    }

    public void setFaUser(Integer faUser) {
        this.faUser = faUser;
    }

    private byte[] faUserText;

    @Basic
    @javax.persistence.Column(name = "fa_user_text", nullable = true)
    public byte[] getFaUserText() {
        return faUserText;
    }

    public void setFaUserText(byte[] faUserText) {
        this.faUserText = faUserText;
    }

    private byte[] faTimestamp;

    @Basic
    @javax.persistence.Column(name = "fa_timestamp", nullable = true)
    public byte[] getFaTimestamp() {
        return faTimestamp;
    }

    public void setFaTimestamp(byte[] faTimestamp) {
        this.faTimestamp = faTimestamp;
    }

    private byte faDeleted;

    @Basic
    @javax.persistence.Column(name = "fa_deleted", nullable = false)
    public byte getFaDeleted() {
        return faDeleted;
    }

    public void setFaDeleted(byte faDeleted) {
        this.faDeleted = faDeleted;
    }

    private byte[] faSha1;

    @Basic
    @javax.persistence.Column(name = "fa_sha1", nullable = false)
    public byte[] getFaSha1() {
        return faSha1;
    }

    public void setFaSha1(byte[] faSha1) {
        this.faSha1 = faSha1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeFilearchiveEntity that = (WelcomeFilearchiveEntity) o;

        if (faId != that.faId) return false;
        if (faDeleted != that.faDeleted) return false;
        if (!Arrays.equals(faName, that.faName)) return false;
        if (!Arrays.equals(faArchiveName, that.faArchiveName)) return false;
        if (!Arrays.equals(faStorageGroup, that.faStorageGroup)) return false;
        if (!Arrays.equals(faStorageKey, that.faStorageKey)) return false;
        if (faDeletedUser != null ? !faDeletedUser.equals(that.faDeletedUser) : that.faDeletedUser != null)
            return false;
        if (!Arrays.equals(faDeletedTimestamp, that.faDeletedTimestamp)) return false;
        if (!Arrays.equals(faDeletedReason, that.faDeletedReason)) return false;
        if (faSize != null ? !faSize.equals(that.faSize) : that.faSize != null) return false;
        if (faWidth != null ? !faWidth.equals(that.faWidth) : that.faWidth != null) return false;
        if (faHeight != null ? !faHeight.equals(that.faHeight) : that.faHeight != null) return false;
        if (!Arrays.equals(faMetadata, that.faMetadata)) return false;
        if (faBits != null ? !faBits.equals(that.faBits) : that.faBits != null) return false;
        if (faMediaType != null ? !faMediaType.equals(that.faMediaType) : that.faMediaType != null) return false;
        if (faMajorMime != null ? !faMajorMime.equals(that.faMajorMime) : that.faMajorMime != null) return false;
        if (!Arrays.equals(faMinorMime, that.faMinorMime)) return false;
        if (!Arrays.equals(faDescription, that.faDescription)) return false;
        if (faUser != null ? !faUser.equals(that.faUser) : that.faUser != null) return false;
        if (!Arrays.equals(faUserText, that.faUserText)) return false;
        if (!Arrays.equals(faTimestamp, that.faTimestamp)) return false;
        if (!Arrays.equals(faSha1, that.faSha1)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = faId;
        result = 31 * result + Arrays.hashCode(faName);
        result = 31 * result + Arrays.hashCode(faArchiveName);
        result = 31 * result + Arrays.hashCode(faStorageGroup);
        result = 31 * result + Arrays.hashCode(faStorageKey);
        result = 31 * result + (faDeletedUser != null ? faDeletedUser.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(faDeletedTimestamp);
        result = 31 * result + Arrays.hashCode(faDeletedReason);
        result = 31 * result + (faSize != null ? faSize.hashCode() : 0);
        result = 31 * result + (faWidth != null ? faWidth.hashCode() : 0);
        result = 31 * result + (faHeight != null ? faHeight.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(faMetadata);
        result = 31 * result + (faBits != null ? faBits.hashCode() : 0);
        result = 31 * result + (faMediaType != null ? faMediaType.hashCode() : 0);
        result = 31 * result + (faMajorMime != null ? faMajorMime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(faMinorMime);
        result = 31 * result + Arrays.hashCode(faDescription);
        result = 31 * result + (faUser != null ? faUser.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(faUserText);
        result = 31 * result + Arrays.hashCode(faTimestamp);
        result = 31 * result + (int) faDeleted;
        result = 31 * result + Arrays.hashCode(faSha1);
        return result;
    }
}
