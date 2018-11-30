package com.alen.football.interceptor.log;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_logger_infos", schema = "football", catalog = "")
public class TLoggerInfosEntity {
    private int aliId;
    private String aliClientIp;
    private String aliUri;
    private String aliType;
    private String aliMethod;
    private String aliParamData;
    private String aliSessionId;
    private Timestamp aliTime;
    private String aliReturmTime;
    private String aliReturnData;
    private String aliHttpStatusCode;
    private Integer aliTimeConsuming;

    @Id
    @Column(name = "ali_id")
    public int getAliId() {
        return aliId;
    }

    public void setAliId(int aliId) {
        this.aliId = aliId;
    }

    @Basic
    @Column(name = "ali_client_ip")
    public String getAliClientIp() {
        return aliClientIp;
    }

    public void setAliClientIp(String aliClientIp) {
        this.aliClientIp = aliClientIp;
    }

    @Basic
    @Column(name = "ali_uri")
    public String getAliUri() {
        return aliUri;
    }

    public void setAliUri(String aliUri) {
        this.aliUri = aliUri;
    }

    @Basic
    @Column(name = "ali_type")
    public String getAliType() {
        return aliType;
    }

    public void setAliType(String aliType) {
        this.aliType = aliType;
    }

    @Basic
    @Column(name = "ali_method")
    public String getAliMethod() {
        return aliMethod;
    }

    public void setAliMethod(String aliMethod) {
        this.aliMethod = aliMethod;
    }

    @Basic
    @Column(name = "ali_param_data")
    public String getAliParamData() {
        return aliParamData;
    }

    public void setAliParamData(String aliParamData) {
        this.aliParamData = aliParamData;
    }

    @Basic
    @Column(name = "ali_session_id")
    public String getAliSessionId() {
        return aliSessionId;
    }

    public void setAliSessionId(String aliSessionId) {
        this.aliSessionId = aliSessionId;
    }

    @Basic
    @Column(name = "ali_time")
    public Timestamp getAliTime() {
        return aliTime;
    }

    public void setAliTime(Timestamp aliTime) {
        this.aliTime = aliTime;
    }

    @Basic
    @Column(name = "ali_returm_time")
    public String getAliReturmTime() {
        return aliReturmTime;
    }

    public void setAliReturmTime(String aliReturmTime) {
        this.aliReturmTime = aliReturmTime;
    }

    @Basic
    @Column(name = "ali_return_data")
    public String getAliReturnData() {
        return aliReturnData;
    }

    public void setAliReturnData(String aliReturnData) {
        this.aliReturnData = aliReturnData;
    }

    @Basic
    @Column(name = "ali_http_status_code")
    public String getAliHttpStatusCode() {
        return aliHttpStatusCode;
    }

    public void setAliHttpStatusCode(String aliHttpStatusCode) {
        this.aliHttpStatusCode = aliHttpStatusCode;
    }

    @Basic
    @Column(name = "ali_time_consuming")
    public Integer getAliTimeConsuming() {
        return aliTimeConsuming;
    }

    public void setAliTimeConsuming(Integer aliTimeConsuming) {
        this.aliTimeConsuming = aliTimeConsuming;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TLoggerInfosEntity that = (TLoggerInfosEntity) o;
        return aliId == that.aliId &&
                Objects.equals(aliClientIp, that.aliClientIp) &&
                Objects.equals(aliUri, that.aliUri) &&
                Objects.equals(aliType, that.aliType) &&
                Objects.equals(aliMethod, that.aliMethod) &&
                Objects.equals(aliParamData, that.aliParamData) &&
                Objects.equals(aliSessionId, that.aliSessionId) &&
                Objects.equals(aliTime, that.aliTime) &&
                Objects.equals(aliReturmTime, that.aliReturmTime) &&
                Objects.equals(aliReturnData, that.aliReturnData) &&
                Objects.equals(aliHttpStatusCode, that.aliHttpStatusCode) &&
                Objects.equals(aliTimeConsuming, that.aliTimeConsuming);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliId, aliClientIp, aliUri, aliType, aliMethod, aliParamData, aliSessionId, aliTime, aliReturmTime, aliReturnData, aliHttpStatusCode, aliTimeConsuming);
    }
}
