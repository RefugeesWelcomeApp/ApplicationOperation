package ra.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_user", schema = "refugeewiki", catalog = "")
public class WelcomeUserEntity {
    private int userId;
    private byte[] userName;
    private byte[] userRealName;
    private Serializable userPassword;
    private Serializable userNewpassword;
    private byte[] userNewpassTime;
    private Serializable userEmail;
    private byte[] userTouched;
    private byte[] userToken;
    private byte[] userEmailAuthenticated;
    private byte[] userEmailToken;
    private byte[] userEmailTokenExpires;
    private byte[] userRegistration;
    private Integer userEditcount;
    private byte[] userPasswordExpires;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = false)
    public byte[] getUserName() {
        return userName;
    }

    public void setUserName(byte[] userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_real_name", nullable = false)
    public byte[] getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(byte[] userRealName) {
        this.userRealName = userRealName;
    }

    @Basic
    @Column(name = "user_password", nullable = false)
    public Serializable getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Serializable userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_newpassword", nullable = false)
    public Serializable getUserNewpassword() {
        return userNewpassword;
    }

    public void setUserNewpassword(Serializable userNewpassword) {
        this.userNewpassword = userNewpassword;
    }

    @Basic
    @Column(name = "user_newpass_time", nullable = true)
    public byte[] getUserNewpassTime() {
        return userNewpassTime;
    }

    public void setUserNewpassTime(byte[] userNewpassTime) {
        this.userNewpassTime = userNewpassTime;
    }

    @Basic
    @Column(name = "user_email", nullable = false)
    public Serializable getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Serializable userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_touched", nullable = false)
    public byte[] getUserTouched() {
        return userTouched;
    }

    public void setUserTouched(byte[] userTouched) {
        this.userTouched = userTouched;
    }

    @Basic
    @Column(name = "user_token", nullable = false)
    public byte[] getUserToken() {
        return userToken;
    }

    public void setUserToken(byte[] userToken) {
        this.userToken = userToken;
    }

    @Basic
    @Column(name = "user_email_authenticated", nullable = true)
    public byte[] getUserEmailAuthenticated() {
        return userEmailAuthenticated;
    }

    public void setUserEmailAuthenticated(byte[] userEmailAuthenticated) {
        this.userEmailAuthenticated = userEmailAuthenticated;
    }

    @Basic
    @Column(name = "user_email_token", nullable = true)
    public byte[] getUserEmailToken() {
        return userEmailToken;
    }

    public void setUserEmailToken(byte[] userEmailToken) {
        this.userEmailToken = userEmailToken;
    }

    @Basic
    @Column(name = "user_email_token_expires", nullable = true)
    public byte[] getUserEmailTokenExpires() {
        return userEmailTokenExpires;
    }

    public void setUserEmailTokenExpires(byte[] userEmailTokenExpires) {
        this.userEmailTokenExpires = userEmailTokenExpires;
    }

    @Basic
    @Column(name = "user_registration", nullable = true)
    public byte[] getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(byte[] userRegistration) {
        this.userRegistration = userRegistration;
    }

    @Basic
    @Column(name = "user_editcount", nullable = true)
    public Integer getUserEditcount() {
        return userEditcount;
    }

    public void setUserEditcount(Integer userEditcount) {
        this.userEditcount = userEditcount;
    }

    @Basic
    @Column(name = "user_password_expires", nullable = true)
    public byte[] getUserPasswordExpires() {
        return userPasswordExpires;
    }

    public void setUserPasswordExpires(byte[] userPasswordExpires) {
        this.userPasswordExpires = userPasswordExpires;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeUserEntity that = (WelcomeUserEntity) o;

        if (userId != that.userId) return false;
        if (!Arrays.equals(userName, that.userName)) return false;
        if (!Arrays.equals(userRealName, that.userRealName)) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;
        if (userNewpassword != null ? !userNewpassword.equals(that.userNewpassword) : that.userNewpassword != null)
            return false;
        if (!Arrays.equals(userNewpassTime, that.userNewpassTime)) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (!Arrays.equals(userTouched, that.userTouched)) return false;
        if (!Arrays.equals(userToken, that.userToken)) return false;
        if (!Arrays.equals(userEmailAuthenticated, that.userEmailAuthenticated)) return false;
        if (!Arrays.equals(userEmailToken, that.userEmailToken)) return false;
        if (!Arrays.equals(userEmailTokenExpires, that.userEmailTokenExpires)) return false;
        if (!Arrays.equals(userRegistration, that.userRegistration)) return false;
        if (userEditcount != null ? !userEditcount.equals(that.userEditcount) : that.userEditcount != null)
            return false;
        if (!Arrays.equals(userPasswordExpires, that.userPasswordExpires)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + Arrays.hashCode(userName);
        result = 31 * result + Arrays.hashCode(userRealName);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userNewpassword != null ? userNewpassword.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userNewpassTime);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userTouched);
        result = 31 * result + Arrays.hashCode(userToken);
        result = 31 * result + Arrays.hashCode(userEmailAuthenticated);
        result = 31 * result + Arrays.hashCode(userEmailToken);
        result = 31 * result + Arrays.hashCode(userEmailTokenExpires);
        result = 31 * result + Arrays.hashCode(userRegistration);
        result = 31 * result + (userEditcount != null ? userEditcount.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userPasswordExpires);
        return result;
    }
}
