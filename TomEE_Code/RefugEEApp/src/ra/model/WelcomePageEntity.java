package ra.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_page", schema = "refugeewiki", catalog = "")
public class WelcomePageEntity {
    private int pageId;
    private int pageNamespace;
    private byte[] pageTitle;
    private Serializable pageRestrictions;
    private byte pageIsRedirect;
    private byte pageIsNew;
    private Serializable pageRandom;
    private byte[] pageTouched;
    private byte[] pageLinksUpdated;
    private int pageLatest;
    private int pageLen;
    private byte[] pageContentModel;
    private byte[] pageLang;

    @Id
    @Column(name = "page_id", nullable = false)
    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    @Basic
    @Column(name = "page_namespace", nullable = false)
    public int getPageNamespace() {
        return pageNamespace;
    }

    public void setPageNamespace(int pageNamespace) {
        this.pageNamespace = pageNamespace;
    }

    @Basic
    @Column(name = "page_title", nullable = false)
    public byte[] getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(byte[] pageTitle) {
        this.pageTitle = pageTitle;
    }

    @Basic
    @Column(name = "page_restrictions", nullable = false)
    public Serializable getPageRestrictions() {
        return pageRestrictions;
    }

    public void setPageRestrictions(Serializable pageRestrictions) {
        this.pageRestrictions = pageRestrictions;
    }

    @Basic
    @Column(name = "page_is_redirect", nullable = false)
    public byte getPageIsRedirect() {
        return pageIsRedirect;
    }

    public void setPageIsRedirect(byte pageIsRedirect) {
        this.pageIsRedirect = pageIsRedirect;
    }

    @Basic
    @Column(name = "page_is_new", nullable = false)
    public byte getPageIsNew() {
        return pageIsNew;
    }

    public void setPageIsNew(byte pageIsNew) {
        this.pageIsNew = pageIsNew;
    }

    @Basic
    @Column(name = "page_random", nullable = false, precision = 0)
    public Serializable getPageRandom() {
        return pageRandom;
    }

    public void setPageRandom(Serializable pageRandom) {
        this.pageRandom = pageRandom;
    }

    @Basic
    @Column(name = "page_touched", nullable = false)
    public byte[] getPageTouched() {
        return pageTouched;
    }

    public void setPageTouched(byte[] pageTouched) {
        this.pageTouched = pageTouched;
    }

    @Basic
    @Column(name = "page_links_updated", nullable = true)
    public byte[] getPageLinksUpdated() {
        return pageLinksUpdated;
    }

    public void setPageLinksUpdated(byte[] pageLinksUpdated) {
        this.pageLinksUpdated = pageLinksUpdated;
    }

    @Basic
    @Column(name = "page_latest", nullable = false)
    public int getPageLatest() {
        return pageLatest;
    }

    public void setPageLatest(int pageLatest) {
        this.pageLatest = pageLatest;
    }

    @Basic
    @Column(name = "page_len", nullable = false)
    public int getPageLen() {
        return pageLen;
    }

    public void setPageLen(int pageLen) {
        this.pageLen = pageLen;
    }

    @Basic
    @Column(name = "page_content_model", nullable = true)
    public byte[] getPageContentModel() {
        return pageContentModel;
    }

    public void setPageContentModel(byte[] pageContentModel) {
        this.pageContentModel = pageContentModel;
    }

    @Basic
    @Column(name = "page_lang", nullable = true)
    public byte[] getPageLang() {
        return pageLang;
    }

    public void setPageLang(byte[] pageLang) {
        this.pageLang = pageLang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomePageEntity that = (WelcomePageEntity) o;

        if (pageId != that.pageId) return false;
        if (pageNamespace != that.pageNamespace) return false;
        if (pageIsRedirect != that.pageIsRedirect) return false;
        if (pageIsNew != that.pageIsNew) return false;
        if (pageLatest != that.pageLatest) return false;
        if (pageLen != that.pageLen) return false;
        if (!Arrays.equals(pageTitle, that.pageTitle)) return false;
        if (pageRestrictions != null ? !pageRestrictions.equals(that.pageRestrictions) : that.pageRestrictions != null)
            return false;
        if (pageRandom != null ? !pageRandom.equals(that.pageRandom) : that.pageRandom != null) return false;
        if (!Arrays.equals(pageTouched, that.pageTouched)) return false;
        if (!Arrays.equals(pageLinksUpdated, that.pageLinksUpdated)) return false;
        if (!Arrays.equals(pageContentModel, that.pageContentModel)) return false;
        if (!Arrays.equals(pageLang, that.pageLang)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pageId;
        result = 31 * result + pageNamespace;
        result = 31 * result + Arrays.hashCode(pageTitle);
        result = 31 * result + (pageRestrictions != null ? pageRestrictions.hashCode() : 0);
        result = 31 * result + (int) pageIsRedirect;
        result = 31 * result + (int) pageIsNew;
        result = 31 * result + (pageRandom != null ? pageRandom.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(pageTouched);
        result = 31 * result + Arrays.hashCode(pageLinksUpdated);
        result = 31 * result + pageLatest;
        result = 31 * result + pageLen;
        result = 31 * result + Arrays.hashCode(pageContentModel);
        result = 31 * result + Arrays.hashCode(pageLang);
        return result;
    }
}
