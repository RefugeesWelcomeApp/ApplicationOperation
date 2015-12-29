package ra.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_module_deps", schema = "refugeewiki", catalog = "")
public class WelcomeModuleDepsEntity {
    private byte[] mdModule;
    private byte[] mdSkin;
    private byte[] mdDeps;

    @Basic
    @Column(name = "md_module", nullable = false)
    public byte[] getMdModule() {
        return mdModule;
    }

    public void setMdModule(byte[] mdModule) {
        this.mdModule = mdModule;
    }

    @Basic
    @Column(name = "md_skin", nullable = false)
    public byte[] getMdSkin() {
        return mdSkin;
    }

    public void setMdSkin(byte[] mdSkin) {
        this.mdSkin = mdSkin;
    }

    @Basic
    @Column(name = "md_deps", nullable = false)
    public byte[] getMdDeps() {
        return mdDeps;
    }

    public void setMdDeps(byte[] mdDeps) {
        this.mdDeps = mdDeps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeModuleDepsEntity that = (WelcomeModuleDepsEntity) o;

        if (!Arrays.equals(mdModule, that.mdModule)) return false;
        if (!Arrays.equals(mdSkin, that.mdSkin)) return false;
        if (!Arrays.equals(mdDeps, that.mdDeps)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(mdModule);
        result = 31 * result + Arrays.hashCode(mdSkin);
        result = 31 * result + Arrays.hashCode(mdDeps);
        return result;
    }
}
