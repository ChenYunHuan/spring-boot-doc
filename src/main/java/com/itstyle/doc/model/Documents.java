package com.itstyle.doc.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "md_documents")
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "document_id", nullable = false)
    private Integer documentId;
    @Column(nullable = false)
    private String documentName;
    @Column(nullable = false)
    private String identify;
    @Column(nullable = false)
    private Integer bookId;
    @Column(nullable = true)
    private Integer parentId;

    @Column(nullable = false)
    private Integer orderSort;
    @Column(nullable = false)
    private String markdown;
    @Column(nullable = true)
    private String release;
    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Timestamp createTime;
    @Column(nullable = false)
    private Integer memberId;
    @Column(nullable = false)
    private Timestamp modifyTime;
    @Column(nullable = true)
    private Integer modify_at;
    @Column(nullable = true)
    private Integer version;

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderSort() {
        return orderSort;
    }

    public void setOrderSort(Integer orderSort) {
        this.orderSort = orderSort;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Integer getModify_at() {
        return modify_at;
    }

    public void setModify_at(Integer modify_at) {
        this.modify_at = modify_at;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
