package com.dxh.mem.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class MemLabel implements Serializable {
    /**
	*记录编号<br/>
	**/
    private Long id;

    /**
	*所属商家ID<br/>
	**/
    private Long vendorId;

    /**
	*标签编码-uuid<br/>
	**/
    private String labelCode;

    /**
	*标签名称<br/>
	**/
    private String labelName;

    /**
	*父级标签<br/>
	**/
    private String parentCode;

    /**
	*标签描述<br/>
	**/
    private String labelDesc;

    /**
	*标签属性(0-普通标签)<br/>
	**/
    private Integer labelAttr;

    /**
	*标签类型(0-分组 1-标签)<br/>
	**/
    private Integer labelType;

    /**
	*创建日期<br/>
	**/
    private Date createDate;

    /**
	*修改日期<br/>
	**/
    private Date modifyDate;

    /**
	*创建人<br/>
	**/
    private String creator;

    /**
	*修改人<br/>
	**/
    private String mender;

    /**
	*是否已删除1删除 0正常<br/>
	**/
    private Integer df;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table memlabel
     *
     * @mbggenerated Tue Sep 03 16:07:01 GMT+08:00 2019
     */
    private static final long serialVersionUID = 1L;

    @Lable("记录编号")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Lable("所属商家ID")
    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    @Lable("标签编码-uuid")
    public String getLabelCode() {
        return labelCode;
    }

    public void setLabelCode(String labelCode) {
        this.labelCode = labelCode == null ? null : labelCode.trim();
    }

    @Lable("标签名称")
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    @Lable("父级标签")
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    @Lable("标签描述")
    public String getLabelDesc() {
        return labelDesc;
    }

    public void setLabelDesc(String labelDesc) {
        this.labelDesc = labelDesc == null ? null : labelDesc.trim();
    }

    @Lable("标签属性(0-普通标签)")
    public Integer getLabelAttr() {
        return labelAttr;
    }

    public void setLabelAttr(Integer labelAttr) {
        this.labelAttr = labelAttr;
    }

    @Lable("标签类型(0-分组 1-标签)")
    public Integer getLabelType() {
        return labelType;
    }

    public void setLabelType(Integer labelType) {
        this.labelType = labelType;
    }

    @Lable("创建日期")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Lable("修改日期")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Lable("创建人")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    @Lable("修改人")
    public String getMender() {
        return mender;
    }

    public void setMender(String mender) {
        this.mender = mender == null ? null : mender.trim();
    }

    @Lable("是否已删除1删除 0正常")
    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }
}