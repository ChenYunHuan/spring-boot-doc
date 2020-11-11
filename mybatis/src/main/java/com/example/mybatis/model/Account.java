package com.example.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @desc 账户实体类
 * @date 2020/11/10
 * @author chenyunhuan
 */
public class Account implements Serializable {

    private static final long serialVersionUID = -8961284524778162752L;

    private Integer accountId;

    private String accountName;

    private String comment;

    private BigDecimal amount;

    private Date createDate;

    private Date updateDate;

    private String state;

    private String certId;

    private String certType;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", comment='" + comment + '\'' +
                ", amount=" + amount +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", state='" + state + '\'' +
                ", certId='" + certId + '\'' +
                ", certType='" + certType + '\'' +
                '}';
    }
}
