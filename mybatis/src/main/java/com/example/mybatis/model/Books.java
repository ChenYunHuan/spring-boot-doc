package com.example.mybatis.model;


import java.io.Serializable;
import java.sql.Timestamp;


public class Books implements Serializable {

    private static final long serialVersionUID = -456773092984214841L;

    private Integer bookId;

    private String bookName;

    private String identify;

    private Integer orderIndex;

    private String description;


    private String label;

    private Integer privatelyOwned;

    private String private_token;

    private Integer status;


    private String editor;

    private Integer docCount;

    private String commentStatus;

    private Integer commentCount;

    private String cover;

    private String theme;

    private Timestamp createTime;

    private Integer memberId;

    private Timestamp modifyTime;

    private Integer version;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getPrivatelyOwned() {
        return privatelyOwned;
    }

    public void setPrivatelyOwned(Integer privatelyOwned) {
        this.privatelyOwned = privatelyOwned;
    }

    public String getPrivate_token() {
        return private_token;
    }

    public void setPrivate_token(String private_token) {
        this.private_token = private_token;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", identify='" + identify + '\'' +
                ", orderIndex=" + orderIndex +
                ", description='" + description + '\'' +
                ", label='" + label + '\'' +
                ", privatelyOwned=" + privatelyOwned +
                ", private_token='" + private_token + '\'' +
                ", status=" + status +
                ", editor='" + editor + '\'' +
                ", docCount=" + docCount +
                ", commentStatus='" + commentStatus + '\'' +
                ", commentCount=" + commentCount +
                ", cover='" + cover + '\'' +
                ", theme='" + theme + '\'' +
                ", createTime=" + createTime +
                ", memberId=" + memberId +
                ", modifyTime=" + modifyTime +
                ", version=" + version +
                '}';
    }


}
