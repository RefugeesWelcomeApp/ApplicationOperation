package ra.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by the-l_000 on 13.12.2015.
 */
@Entity
@Table(name = "welcome_job", schema = "refugeewiki", catalog = "")
public class WelcomeJobEntity {
    private int jobId;
    private byte[] jobCmd;
    private int jobNamespace;
    private byte[] jobTitle;
    private byte[] jobTimestamp;
    private byte[] jobParams;
    private int jobRandom;
    private int jobAttempts;
    private byte[] jobToken;
    private byte[] jobTokenTimestamp;
    private byte[] jobSha1;

    @Id
    @Column(name = "job_id", nullable = false)
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "job_cmd", nullable = false)
    public byte[] getJobCmd() {
        return jobCmd;
    }

    public void setJobCmd(byte[] jobCmd) {
        this.jobCmd = jobCmd;
    }

    @Basic
    @Column(name = "job_namespace", nullable = false)
    public int getJobNamespace() {
        return jobNamespace;
    }

    public void setJobNamespace(int jobNamespace) {
        this.jobNamespace = jobNamespace;
    }

    @Basic
    @Column(name = "job_title", nullable = false)
    public byte[] getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(byte[] jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Basic
    @Column(name = "job_timestamp", nullable = true)
    public byte[] getJobTimestamp() {
        return jobTimestamp;
    }

    public void setJobTimestamp(byte[] jobTimestamp) {
        this.jobTimestamp = jobTimestamp;
    }

    @Basic
    @Column(name = "job_params", nullable = false)
    public byte[] getJobParams() {
        return jobParams;
    }

    public void setJobParams(byte[] jobParams) {
        this.jobParams = jobParams;
    }

    @Basic
    @Column(name = "job_random", nullable = false)
    public int getJobRandom() {
        return jobRandom;
    }

    public void setJobRandom(int jobRandom) {
        this.jobRandom = jobRandom;
    }

    @Basic
    @Column(name = "job_attempts", nullable = false)
    public int getJobAttempts() {
        return jobAttempts;
    }

    public void setJobAttempts(int jobAttempts) {
        this.jobAttempts = jobAttempts;
    }

    @Basic
    @Column(name = "job_token", nullable = false)
    public byte[] getJobToken() {
        return jobToken;
    }

    public void setJobToken(byte[] jobToken) {
        this.jobToken = jobToken;
    }

    @Basic
    @Column(name = "job_token_timestamp", nullable = true)
    public byte[] getJobTokenTimestamp() {
        return jobTokenTimestamp;
    }

    public void setJobTokenTimestamp(byte[] jobTokenTimestamp) {
        this.jobTokenTimestamp = jobTokenTimestamp;
    }

    @Basic
    @Column(name = "job_sha1", nullable = false)
    public byte[] getJobSha1() {
        return jobSha1;
    }

    public void setJobSha1(byte[] jobSha1) {
        this.jobSha1 = jobSha1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelcomeJobEntity that = (WelcomeJobEntity) o;

        if (jobId != that.jobId) return false;
        if (jobNamespace != that.jobNamespace) return false;
        if (jobRandom != that.jobRandom) return false;
        if (jobAttempts != that.jobAttempts) return false;
        if (!Arrays.equals(jobCmd, that.jobCmd)) return false;
        if (!Arrays.equals(jobTitle, that.jobTitle)) return false;
        if (!Arrays.equals(jobTimestamp, that.jobTimestamp)) return false;
        if (!Arrays.equals(jobParams, that.jobParams)) return false;
        if (!Arrays.equals(jobToken, that.jobToken)) return false;
        if (!Arrays.equals(jobTokenTimestamp, that.jobTokenTimestamp)) return false;
        if (!Arrays.equals(jobSha1, that.jobSha1)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobId;
        result = 31 * result + Arrays.hashCode(jobCmd);
        result = 31 * result + jobNamespace;
        result = 31 * result + Arrays.hashCode(jobTitle);
        result = 31 * result + Arrays.hashCode(jobTimestamp);
        result = 31 * result + Arrays.hashCode(jobParams);
        result = 31 * result + jobRandom;
        result = 31 * result + jobAttempts;
        result = 31 * result + Arrays.hashCode(jobToken);
        result = 31 * result + Arrays.hashCode(jobTokenTimestamp);
        result = 31 * result + Arrays.hashCode(jobSha1);
        return result;
    }
}
