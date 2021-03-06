package com.dxh.order.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class DpReportExpIcat implements Serializable {
    /**
	*记录编号<br/>
	**/
    private Long id;

    /**
	*商家ID<br/>
	**/
    private Long vendorId;

    /**
	*类别编码<br/>
	**/
    private String icatCode;

    /**
	*类别名称<br/>
	**/
    private String icatName;

    /**
	*备注<br/>
	**/
    private String memo;

    /**
	*是否已删除1删除 0正常<br/>
	**/
    private Integer df;

    /**
	*创建日期<br/>
	**/
    private Date createDate;

    /**
	*创建人<br/>
	**/
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dpreportexpicat
     *
     * @mbggenerated Fri Feb 14 12:06:56 GMT+08:00 2020
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

    @Lable("类别编码")
    public String getIcatCode() {
        return icatCode;
    }

    public void setIcatCode(String icatCode) {
        this.icatCode = icatCode == null ? null : icatCode.trim();
    }

    @Lable("类别名称")
    public String getIcatName() {
        return icatName;
    }

    public void setIcatName(String icatName) {
        this.icatName = icatName == null ? null : icatName.trim();
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

    @Lable("创建日期")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Lable("创建人")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}