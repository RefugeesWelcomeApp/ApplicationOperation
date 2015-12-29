package ra.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_uploadstash", schema = "refugeewiki", catalog = "")
public class WelcomeUploadstashEntity {
    private int usId;
    private int usUser;
    private byte[] usKey;
    private byte[] usOrigPath;
    private byte[] usPath;
    private byte[] usSourceType;
    private byte[] usTimestamp;
    private byte[] usStatus;
    private Integer usChunkInx;
    private byte[] usProps;
    private int usSize;
    private byte[] usSha1;
    private byte[] usMime;
    private Serializable usMediaType;
    private Integer usImageWidth;
    private Integer usImageHeight;
    private Short usImageBits;

    @Id
    @Column(name = "us_id", nullable = false)
    public int getUsId() {
        return usId;
    }

    public void setUsId(int usId) {
        this.usId = usId;
    }

    @Basic
    @Column(name = "us_user", nullable = false)
    public int getUsUser() {
        return usUser;
    }

    public void setUsUser(int usUser) {
        this.usUser = usUser;
    }

    @Basic
    @Column(name = "us_key", nullable = false)
    public byte[] getUsKey() {
        return usKey;
    }

    public void setUsKey(byte[] usKey) {
        this.usKey = usKey;
    }

    @Basic
    @Column(name = "us_orig_path", nullable = false)
    public byte[] getUsOrigPath() {
        return usOrigPath;
    }

    public void setUsOrigPath(byte[] usOrigPath) {
        this.usOrigPath = usOrigPath;
    }

    @Basic
    @Column(name = "us_path", nullable = false)
    public byte[] getUsPath() {
        return usPath;
    }

    public void setUsPath(byte[] usPath) {
        this.usPath = usPath;
    }

    @Basic
    @Column(name = "us_source_type", nullable = true)
    public byte[] getUsSourceType() {
        return usSourceType;
    }

    public void setUsSourceType(byte[] usSourceType) {
        this.usSourceType = usSourceType;
    }

    @Basic
    @Column(name = "us_timestamp", nullable = false)
    public byte[] getUsTimestamp() {
        return usTimestamp;
    }

    public void setUsTimestamp(byte[] usTimestamp) {
        this.usTimestamp = usTimestamp;
    }

    @Basic
    @Column(name = "us_status", nullable = false)
    public byte[] getUsStatus() {
        return usStatus;
    }

    public void setUsStatus(byte[] usStatus) {
        this.usStatus = usStatus;
    }

    @Basic
    @Column(name = "us_chunk_inx", nullable = true)
    public Integer getUsChunkInx() {
        return usChunkInx;
    }

    public void setUsChunkInx(Integer usChunkInx) {
        this.usChunkInx = usChunkInx;
    }

    @Basic
    @Column(name = "us_props", nullable = true)
    public byte[] getUsProps() {
        return usProps;
    }

    public void setUsProps(byte[] usProps) {
        this.usProps = usProps;
    }

    @Basic
    @Column(name = "us_size", nullable = false)
    public int getUsSize() {
        return usSize;
    }

    public void setUsSize(int usSize) {
        this.usSize = usSize;
    }

    @Basic
    @Column(name = "us_sha1", nullable = false)
    public byte[] getUsSha1() {
        return usSha1;
    }

    public void setUsSha1(byte[] usSha1) {
        this.usSha1 = usSha1;
    }

    @Basic
    @Column(name = "us_mime", nullable = true)
    public byte[] getUsMime() {
        return usMime;
    }

    public void setUsMime(byte[] usMime) {
        this.usMime = usMime;
    }

    @Basic
    @Column(name = "us_media_type", nullable = true)
    public Serializable getUsMediaType() {
        return usMediaType;
    }

    public void setUsMediaType(Serializable usMediaType) {
        this.usMediaType = usMediaType;
    }

    @Basic
    @Column(name = "us_image_width", nullable = true)
    public Integer getUsImageWidth() {
        return usImageWidth;
    }

    public void setUsImageWidth(Integer usImageWidth) {
        this.usImageWidth = usImageWidth;
    }

    @Basic
    @Column(name = "us_image_height", nullable = true)
    public Integer getUsImageHeight() {
        return usImageHeight;
    }

    public void setUsImageHeight(Integer usImageHeight) {
        this.usImageHeight = usImageHeight;
    }

    @Basic
    @Column(name = "us_image_bits", nullable = true)
    public Short getUsImageBits() {
        return usImageBits;
    }

    public void setUsImageBits(Short usImageBits) {
        this.usImageBits = usImageBits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeUploadstashEntity that = (WelcomeUploadstashEntity) o;

        if (usId != that.usId) return false;
        if (usUser != that.usUser) return false;
        if (usSize != that.usSize) return false;
        if (!Arrays.equals(usKey, that.usKey)) return false;
        if (!Arrays.equals(usOrigPath, that.usOrigPath)) return false;
        if (!Arrays.equals(usPath, that.usPath)) return false;
        if (!Arrays.equals(usSourceType, that.usSourceType)) return false;
        if (!Arrays.equals(usTimestamp, that.usTimestamp)) return false;
        if (!Arrays.equals(usStatus, that.usStatus)) return false;
        if (usChunkInx != null ? !usChunkInx.equals(that.usChunkInx) : that.usChunkInx != null) return false;
        if (!Arrays.equals(usProps, that.usProps)) return false;
        if (!Arrays.equals(usSha1, that.usSha1)) return false;
        if (!Arrays.equals(usMime, that.usMime)) return false;
        if (usMediaType != null ? !usMediaType.equals(that.usMediaType) : that.usMediaType != null) return false;
        if (usImageWidth != null ? !usImageWidth.equals(that.usImageWidth) : that.usImageWidth != null) return false;
        if (usImageHeight != null ? !usImageHeight.equals(that.usImageHeight) : that.usImageHeight != null)
            return false;
        if (usImageBits != null ? !usImageBits.equals(that.usImageBits) : that.usImageBits != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usId;
        result = 31 * result + usUser;
        result = 31 * result + Arrays.hashCode(usKey);
        result = 31 * result + Arrays.hashCode(usOrigPath);
        result = 31 * result + Arrays.hashCode(usPath);
        result = 31 * result + Arrays.hashCode(usSourceType);
        result = 31 * result + Arrays.hashCode(usTimestamp);
        result = 31 * result + Arrays.hashCode(usStatus);
        result = 31 * result + (usChunkInx != null ? usChunkInx.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(usProps);
        result = 31 * result + usSize;
        result = 31 * result + Arrays.hashCode(usSha1);
        result = 31 * result + Arrays.hashCode(usMime);
        result = 31 * result + (usMediaType != null ? usMediaType.hashCode() : 0);
        result = 31 * result + (usImageWidth != null ? usImageWidth.hashCode() : 0);
        result = 31 * result + (usImageHeight != null ? usImageHeight.hashCode() : 0);
        result = 31 * result + (usImageBits != null ? usImageBits.hashCode() : 0);
        return result;
    }
}
