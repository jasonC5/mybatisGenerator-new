package com.dxh.retail.entity;

import java.io.Serializable;
import java.util.Date;

public class BalanceConsumeBatch implements Serializable {
    /**
	*记录ID<br/>
	**/
    private Long id;

    /**
	*商家ID<br/>
	**/
    private Long vendorId;

    /**
	*订单号<br/>
	**/
    private String orderNo;

    /**
	*订单类型 0销售 1退款<br/>
	**/
    private Integer orderFlag;

    /**
	*消费批次号<br/>
	**/
    private String batchNo;

    /**
	*批次类型 0正常储值 1赠送 2返利金 3环保金<br/>
	**/
    private Integer accountType;

    /**
	*批次消费金额<br/>
	**/
    private Double consumeAmount;

    /**
	*批次剩余金额<br/>
	**/
    private Double batchSurplusAmount;

    /**
	*充值机构编码<br/>
	**/
    private String rechargeOrganCode;

    /**
	*充值机构名称<br/>
	**/
    private String rechargeOrganName;

    /**
	*充值门店编码<br/>
	**/
    private String rechargeStoreCode;

    /**
	*充值门店名称<br/>
	**/
    private String rechargeStoreName;

    /**
	*消费机构编码<br/>
	**/
    private String consumeOrganCode;

    /**
	*消费机构名称<br/>
	**/
    private String consumeOrganName;

    /**
	*消费门店编码<br/>
	**/
    private String consumeStoreCode;

    /**
	*消费门店名称<br/>
	**/
    private String consumeStoreName;

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
     * This field corresponds to the database table balanceconsumebatch
     *
     * @mbggenerated Fri Aug 28 17:30:29 GMT+08:00 2020
     */
    private static final long serialVersionUID = 1L;

    @Lable("记录ID")
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

    @Lable("订单号")
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    @Lable("订单类型 0销售 1退款")
    public Integer getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

    @Lable("消费批次号")
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    @Lable("批次类型 0正常储值 1赠送 2返利金 3环保金")
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    @Lable("批次消费金额")
    public Double getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    @Lable("批次剩余金额")
    public Double getBatchSurplusAmount() {
        return batchSurplusAmount;
    }

    public void setBatchSurplusAmount(Double batchSurplusAmount) {
        this.batchSurplusAmount = batchSurplusAmount;
    }

    @Lable("充值机构编码")
    public String getRechargeOrganCode() {
        return rechargeOrganCode;
    }

    public void setRechargeOrganCode(String rechargeOrganCode) {
        this.rechargeOrganCode = rechargeOrganCode == null ? null : rechargeOrganCode.trim();
    }

    @Lable("充值机构名称")
    public String getRechargeOrganName() {
        return rechargeOrganName;
    }

    public void setRechargeOrganName(String rechargeOrganName) {
        this.rechargeOrganName = rechargeOrganName == null ? null : rechargeOrganName.trim();
    }

    @Lable("充值门店编码")
    public String getRechargeStoreCode() {
        return rechargeStoreCode;
    }

    public void setRechargeStoreCode(String rechargeStoreCode) {
        this.rechargeStoreCode = rechargeStoreCode == null ? null : rechargeStoreCode.trim();
    }

    @Lable("充值门店名称")
    public String getRechargeStoreName() {
        return rechargeStoreName;
    }

    public void setRechargeStoreName(String rechargeStoreName) {
        this.rechargeStoreName = rechargeStoreName == null ? null : rechargeStoreName.trim();
    }

    @Lable("消费机构编码")
    public String getConsumeOrganCode() {
        return consumeOrganCode;
    }

    public void setConsumeOrganCode(String consumeOrganCode) {
        this.consumeOrganCode = consumeOrganCode == null ? null : consumeOrganCode.trim();
    }

    @Lable("消费机构名称")
    public String getConsumeOrganName() {
        return consumeOrganName;
    }

    public void setConsumeOrganName(String consumeOrganName) {
        this.consumeOrganName = consumeOrganName == null ? null : consumeOrganName.trim();
    }

    @Lable("消费门店编码")
    public String getConsumeStoreCode() {
        return consumeStoreCode;
    }

    public void setConsumeStoreCode(String consumeStoreCode) {
        this.consumeStoreCode = consumeStoreCode == null ? null : consumeStoreCode.trim();
    }

    @Lable("消费门店名称")
    public String getConsumeStoreName() {
        return consumeStoreName;
    }

    public void setConsumeStoreName(String consumeStoreName) {
        this.consumeStoreName = consumeStoreName == null ? null : consumeStoreName.trim();
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