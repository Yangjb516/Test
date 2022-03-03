package com.zixuan.mybatisPlus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author yjb
 * @since 2022-03-03
 */
@TableName("pub_books")
public class PubBooks implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.NONE)
    private String id;

    @TableField("BOOK_CODE")
    private String bookCode;

    @TableField("BOOK_NAME")
    private String bookName;

    @TableField("AUTHOR")
    private String author;

    @TableField("DESCRI")
    private String descri;

    @TableField("BOOK_TYPE")
    private String bookType;

    @TableField("PRESS")
    private String press;

    @TableField("CUR_NUM")
    private String curNum;

    @TableField("TOTAL_NUM")
    private String totalNum;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @TableField("UPDATE_DATE")
    private LocalDateTime updateDate;

    @TableField("QY_FLAG")
    private String qyFlag;

    /**
     * 借阅次数
     */
    @TableField("BOR_NUM")
    private String borNum;

    /**
     * 续借次数
     */
    @TableField("RE_BOR_NUM")
    private String reBorNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
    public String getCurNum() {
        return curNum;
    }

    public void setCurNum(String curNum) {
        this.curNum = curNum;
    }
    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
    public String getQyFlag() {
        return qyFlag;
    }

    public void setQyFlag(String qyFlag) {
        this.qyFlag = qyFlag;
    }
    public String getBorNum() {
        return borNum;
    }

    public void setBorNum(String borNum) {
        this.borNum = borNum;
    }
    public String getReBorNum() {
        return reBorNum;
    }

    public void setReBorNum(String reBorNum) {
        this.reBorNum = reBorNum;
    }

    @Override
    public String toString() {
        return "PubBooks{" +
            "id=" + id +
            ", bookCode=" + bookCode +
            ", bookName=" + bookName +
            ", author=" + author +
            ", descri=" + descri +
            ", bookType=" + bookType +
            ", press=" + press +
            ", curNum=" + curNum +
            ", totalNum=" + totalNum +
            ", createBy=" + createBy +
            ", updateBy=" + updateBy +
            ", createDate=" + createDate +
            ", updateDate=" + updateDate +
            ", qyFlag=" + qyFlag +
            ", borNum=" + borNum +
            ", reBorNum=" + reBorNum +
        "}";
    }
}
