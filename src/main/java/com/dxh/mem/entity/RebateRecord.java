package com.dxh.mem.entity;

import java.io.Serializable;
import java.util.Date;

public class RebateRecord implements Serializable {
    /**
	*记录ID<br/>
	**/
    private Long id;

    /**
	*商家（代理商）ID<br/>
	**/
    private Long vendorId;

    /**
	*记录状态：0预返利 1已生效<br/>
	**/
    private Integer recordStatus;

    /**
	*机构编码<br/>
	**/
    private String organCode;

    /**
	*机构名称<br/>
	**/
    private String organName;

    /**
	*门店编码<br/>
	**/
    private String storeCode;

    /**
	*门店名称<br/>
	**/
    private String storeName;

    /**
	*会员编号<br/>
	**/
    private String memNo;

    /**
	*会员手机号<br/>
	**/
    private String mobileNo;

    /**
	*会员名称<br/>
	**/
    private String memName;

    /**
	*返利活动单号<br/>
	**/
    private String smOrderNo;

    /**
	*销售单号<br/>
	**/
    private String saleOrderNo;

    /**
	*pos请求号<br/>
	**/
    private String rebateOrderNo;

    /**
	*商品编码<br/>
	**/
    private String skuCode;

    /**
	*商品名称<br/>
	**/
    private String skuName;

    /**
	*单位<br/>
	**/
    private String unit;

    /**
	*商品单价<br/>
	**/
    private Double salePrice;

    /**
	*商品数量<br/>
	**/
    private Double skuNum;

    /**
	*单个返利<br/>
	**/
    private Double rebate;

    /**
	*返利总额<br/>
	**/
    private Double rebateAmount;

    /**
	*是否首次返利<br/>
	**/
    private Integer firstRebate;

    /**
	*是否删除<br/>
	**/
    private Integer df;

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
     * This field corresponds to the database table rebaterecord
     *
     * @mbggenerated Fri Jul 31 16:08:09 GMT+08:00 2020
     */
    private static final long serialVersionUID = 1L;

    @Lable("记录ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Lable("商家（代理商）ID")
    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    @Lable("记录状态：0预返利 1已生效")
    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Lable("机构编码")
    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    @Lable("机构名称")
    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }

    @Lable("门店编码")
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    @Lable("门店名称")
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    @Lable("会员编号")
    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }

    @Lable("会员手机号")
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    @Lable("会员名称")
    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName == null ? null : memName.trim();
    }

    @Lable("返利活动单号")
    public String getSmOrderNo() {
        return smOrderNo;
    }

    public void setSmOrderNo(String smOrderNo) {
        this.smOrderNo = smOrderNo == null ? null : smOrderNo.trim();
    }

    @Lable("销售单号")
    public String getSaleOrderNo() {
        return saleOrderNo;
    }

    public void setSaleOrderNo(String saleOrderNo) {
        this.saleOrderNo = saleOrderNo == null ? null : saleOrderNo.trim();
    }

    @Lable("pos请求号")
    public String getRebateOrderNo() {
        return rebateOrderNo;
    }

    public void setRebateOrderNo(String rebateOrderNo) {
        this.rebateOrderNo = rebateOrderNo == null ? null : rebateOrderNo.trim();
    }

    @Lable("商品编码")
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    @Lable("商品名称")
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    @Lable("单位")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    @Lable("商品单价")
    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    @Lable("商品数量")
    public Double getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Double skuNum) {
        this.skuNum = skuNum;
    }

    @Lable("单个返利")
    public Double getRebate() {
        return rebate;
    }

    public void setRebate(Double rebate) {
        this.rebate = rebate;
    }

    @Lable("返利总额")
    public Double getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(Double rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    @Lable("是否首次返利")
    public Integer getFirstRebate() {
        return firstRebate;
    }

    public void setFirstRebate(Integer firstRebate) {
        this.firstRebate = firstRebate;
    }

    @Lable("是否删除")
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

    @Lable("修改日期")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}