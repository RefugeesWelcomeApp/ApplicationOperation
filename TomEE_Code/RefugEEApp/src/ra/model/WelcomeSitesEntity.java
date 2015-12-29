package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_sites", schema = "refugeewiki", catalog = "")
public class WelcomeSitesEntity {
    private int siteId;
    private byte[] siteGlobalKey;
    private byte[] siteType;
    private byte[] siteGroup;
    private byte[] siteSource;
    private byte[] siteLanguage;
    private byte[] siteProtocol;
    private byte[] siteDomain;
    private byte[] siteData;
    private byte siteForward;
    private byte[] siteConfig;

    @Id
    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Basic
    @Column(name = "site_global_key", nullable = false)
    public byte[] getSiteGlobalKey() {
        return siteGlobalKey;
    }

    public void setSiteGlobalKey(byte[] siteGlobalKey) {
        this.siteGlobalKey = siteGlobalKey;
    }

    @Basic
    @Column(name = "site_type", nullable = false)
    public byte[] getSiteType() {
        return siteType;
    }

    public void setSiteType(byte[] siteType) {
        this.siteType = siteType;
    }

    @Basic
    @Column(name = "site_group", nullable = false)
    public byte[] getSiteGroup() {
        return siteGroup;
    }

    public void setSiteGroup(byte[] siteGroup) {
        this.siteGroup = siteGroup;
    }

    @Basic
    @Column(name = "site_source", nullable = false)
    public byte[] getSiteSource() {
        return siteSource;
    }

    public void setSiteSource(byte[] siteSource) {
        this.siteSource = siteSource;
    }

    @Basic
    @Column(name = "site_language", nullable = false)
    public byte[] getSiteLanguage() {
        return siteLanguage;
    }

    public void setSiteLanguage(byte[] siteLanguage) {
        this.siteLanguage = siteLanguage;
    }

    @Basic
    @Column(name = "site_protocol", nullable = false)
    public byte[] getSiteProtocol() {
        return siteProtocol;
    }

    public void setSiteProtocol(byte[] siteProtocol) {
        this.siteProtocol = siteProtocol;
    }

    @Basic
    @Column(name = "site_domain", nullable = false)
    public byte[] getSiteDomain() {
        return siteDomain;
    }

    public void setSiteDomain(byte[] siteDomain) {
        this.siteDomain = siteDomain;
    }

    @Basic
    @Column(name = "site_data", nullable = false)
    public byte[] getSiteData() {
        return siteData;
    }

    public void setSiteData(byte[] siteData) {
        this.siteData = siteData;
    }

    @Basic
    @Column(name = "site_forward", nullable = false)
    public byte getSiteForward() {
        return siteForward;
    }

    public void setSiteForward(byte siteForward) {
        this.siteForward = siteForward;
    }

    @Basic
    @Column(name = "site_config", nullable = false)
    public byte[] getSiteConfig() {
        return siteConfig;
    }

    public void setSiteConfig(byte[] siteConfig) {
        this.siteConfig = siteConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeSitesEntity that = (WelcomeSitesEntity) o;

        if (siteId != that.siteId) return false;
        if (siteForward != that.siteForward) return false;
        if (!Arrays.equals(siteGlobalKey, that.siteGlobalKey)) return false;
        if (!Arrays.equals(siteType, that.siteType)) return false;
        if (!Arrays.equals(siteGroup, that.siteGroup)) return false;
        if (!Arrays.equals(siteSource, that.siteSource)) return false;
        if (!Arrays.equals(siteLanguage, that.siteLanguage)) return false;
        if (!Arrays.equals(siteProtocol, that.siteProtocol)) return false;
        if (!Arrays.equals(siteDomain, that.siteDomain)) return false;
        if (!Arrays.equals(siteData, that.siteData)) return false;
        if (!Arrays.equals(siteConfig, that.siteConfig)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = siteId;
        result = 31 * result + Arrays.hashCode(siteGlobalKey);
        result = 31 * result + Arrays.hashCode(siteType);
        result = 31 * result + Arrays.hashCode(siteGroup);
        result = 31 * result + Arrays.hashCode(siteSource);
        result = 31 * result + Arrays.hashCode(siteLanguage);
        result = 31 * result + Arrays.hashCode(siteProtocol);
        result = 31 * result + Arrays.hashCode(siteDomain);
        result = 31 * result + Arrays.hashCode(siteData);
        result = 31 * result + (int) siteForward;
        result = 31 * result + Arrays.hashCode(siteConfig);
        return result;
    }
}
