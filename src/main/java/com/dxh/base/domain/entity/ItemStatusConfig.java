package com.dxh.base.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class ItemStatusConfig implements Serializable {
    /**
	*记录编号<br/>
	**/
    private Long id;

    /**
	*商家ID<br/>
	**/
    private Long vendorId;

    /**
	*生命周期 0正常 1停购 2停售 3淘汰 4归档 5新品 7新品审核 8暂时禁销售 9季节商品<br/>
	**/
    private Integer itemStatus;

    /**
	*生命周期名称<br/>
	**/
    private String statusName;

    /**
	*是否使用 0不使用 1使用<br/>
	**/
    private Integer usable;

    /**
	*备注<br/>
	**/
    private String memo;

    /**
	*是否已删除1删除 0正常<br/>
	**/
    private Integer df;

    /**
	*创建人<br/>
	**/
    private String crater;

    /**
	*修改人<br/>
	**/
    private String mender;

    /**
	*创建日期<br/>
	**/
    private Date createDate;

    /**
	*修改日期<br/>
	**/
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table itemstatusconfig
     *
     * @mbggenerated Wed Mar 11 10:30:55 GMT+08:00 2020
     */
    private static final long serialVersionUID = 1L;

    @Lable("记录编号")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Lable("商家ID")
    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    @Lable("生命周期 0正常 1停购 2停售 3淘汰 4归档 5新品 7新品审核 8暂时禁销售 9季节商品")
    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    @Lable("生命周期名称")
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    @Lable("是否使用 0不使用 1使用")
    public Integer getUsable() {
        return usable;
    }

    public void setUsable(Integer usable) {
        this.usable = usable;
    }

    @Lable("备注")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    @Lable("是否已删除1删除 0正常")
    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }

    @Lable("创建人")
    public String getCrater() {
        return crater;
    }

    public void setCrater(String crater) {
        this.crater = crater == null ? null : crater.trim();
    }

    @Lable("修改人")
    public String getMender() {
        return mender;
    }

    public void setMender(String mender) {
        this.mender = mender == null ? null : mender.trim();
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
}