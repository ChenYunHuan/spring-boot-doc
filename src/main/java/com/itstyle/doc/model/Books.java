package com.itstyle.doc.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "md_books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id", nullable = false)
    private Integer bookId;
    @Column(nullable = false)
    private String bookName;
    @Column(nullable = false)
    private String identify;
    @Column(nullable = false)
    private Integer orderIndex;
    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private String label;
    @Column(nullable = false)
    private Integer privatelyOwned;
    @Column(nullable = true)
    private String private_token;
    @Column(nullable = false)
    private Integer status;

    @Column(nullable = false)
    private String editor;
    @Column(nullable = false)
    private Integer docCount;
    @Column(nullable = false)
    private String commentStatus;
    @Column(nullable = true)
    private Integer commentCount;

    @Column(nullable = false)
    private String cover;
    @Column(nullable = false)
    private String theme;
    @Column(nullable = false)
    private Timestamp createTime;
    @Column(nullable = true)
    private Integer memberId;
    @Column(nullable = false)
    private Timestamp modifyTime;
    @Column(nullable = true)
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
}
