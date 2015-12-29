package ra.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_image", schema = "refugeewiki", catalog = "")
public class WelcomeImageEntity {
    private byte[] imgName;
    private int imgSize;
    private int imgWidth;
    private int imgHeight;
    private byte[] imgMetadata;
    private int imgBits;
    private Serializable imgMediaType;
    private Serializable imgMajorMime;
    private byte[] imgMinorMime;
    private byte[] imgDescription;
    private int imgUser;
    private byte[] imgUserText;
    private byte[] imgTimestamp;
    private byte[] imgSha1;

    @Id
    @Column(name = "img_name", nullable = false)
    public byte[] getImgName() {
        return imgName;
    }

    public void setImgName(byte[] imgName) {
        this.imgName = imgName;
    }

    @Basic
    @Column(name = "img_size", nullable = false)
    public int getImgSize() {
        return imgSize;
    }

    public void setImgSize(int imgSize) {
        this.imgSize = imgSize;
    }

    @Basic
    @Column(name = "img_width", nullable = false)
    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    @Basic
    @Column(name = "img_height", nullable = false)
    public int getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

    @Basic
    @Column(name = "img_metadata", nullable = false)
    public byte[] getImgMetadata() {
        return imgMetadata;
    }

    public void setImgMetadata(byte[] imgMetadata) {
        this.imgMetadata = imgMetadata;
    }

    @Basic
    @Column(name = "img_bits", nullable = false)
    public int getImgBits() {
        return imgBits;
    }

    public void setImgBits(int imgBits) {
        this.imgBits = imgBits;
    }

    @Basic
    @Column(name = "img_media_type", nullable = true)
    public Serializable getImgMediaType() {
        return imgMediaType;
    }

    public void setImgMediaType(Serializable imgMediaType) {
        this.imgMediaType = imgMediaType;
    }

    @Basic
    @Column(name = "img_major_mime", nullable = false, length = -1)
    public Serializable getImgMajorMime() {
        return imgMajorMime;
    }

    public void setImgMajorMime(Serializable imgMajorMime) {
        this.imgMajorMime = imgMajorMime;
    }

    @Basic
    @Column(name = "img_minor_mime", nullable = false)
    public byte[] getImgMinorMime() {
        return imgMinorMime;
    }

    public void setImgMinorMime(byte[] imgMinorMime) {
        this.imgMinorMime = imgMinorMime;
    }

    @Basic
    @Column(name = "img_description", nullable = false)
    public byte[] getImgDescription() {
        return imgDescription;
    }

    public void setImgDescription(byte[] imgDescription) {
        this.imgDescription = imgDescription;
    }

    @Basic
    @Column(name = "img_user", nullable = false)
    public int getImgUser() {
        return imgUser;
    }

    public void setImgUser(int imgUser) {
        this.imgUser = imgUser;
    }

    @Basic
    @Column(name = "img_user_text", nullable = false)
    public byte[] getImgUserText() {
        return imgUserText;
    }

    public void setImgUserText(byte[] imgUserText) {
        this.imgUserText = imgUserText;
    }

    @Basic
    @Column(name = "img_timestamp", nullable = false)
    public byte[] getImgTimestamp() {
        return imgTimestamp;
    }

    public void setImgTimestamp(byte[] imgTimestamp) {
        this.imgTimestamp = imgTimestamp;
    }

    @Basic
    @Column(name = "img_sha1", nullable = false)
    public byte[] getImgSha1() {
        return imgSha1;
    }

    public void setImgSha1(byte[] imgSha1) {
        this.imgSha1 = imgSha1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeImageEntity that = (WelcomeImageEntity) o;

        if (imgSize != that.imgSize) return false;
        if (imgWidth != that.imgWidth) return false;
        if (imgHeight != that.imgHeight) return false;
        if (imgBits != that.imgBits) return false;
        if (imgUser != that.imgUser) return false;
        if (!Arrays.equals(imgName, that.imgName)) return false;
        if (!Arrays.equals(imgMetadata, that.imgMetadata)) return false;
        if (imgMediaType != null ? !imgMediaType.equals(that.imgMediaType) : that.imgMediaType != null) return false;
        if (imgMajorMime != null ? !imgMajorMime.equals(that.imgMajorMime) : that.imgMajorMime != null) return false;
        if (!Arrays.equals(imgMinorMime, that.imgMinorMime)) return false;
        if (!Arrays.equals(imgDescription, that.imgDescription)) return false;
        if (!Arrays.equals(imgUserText, that.imgUserText)) return false;
        if (!Arrays.equals(imgTimestamp, that.imgTimestamp)) return false;
        if (!Arrays.equals(imgSha1, that.imgSha1)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(imgName);
        result = 31 * result + imgSize;
        result = 31 * result + imgWidth;
        result = 31 * result + imgHeight;
        result = 31 * result + Arrays.hashCode(imgMetadata);
        result = 31 * result + imgBits;
        result = 31 * result + (imgMediaType != null ? imgMediaType.hashCode() : 0);
        result = 31 * result + (imgMajorMime != null ? imgMajorMime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(imgMinorMime);
        result = 31 * result + Arrays.hashCode(imgDescription);
        result = 31 * result + imgUser;
        result = 31 * result + Arrays.hashCode(imgUserText);
        result = 31 * result + Arrays.hashCode(imgTimestamp);
        result = 31 * result + Arrays.hashCode(imgSha1);
        return result;
    }
}
