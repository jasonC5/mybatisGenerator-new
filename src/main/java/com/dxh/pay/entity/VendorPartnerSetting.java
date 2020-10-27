package com.dxh.pay.entity;

import java.io.Serializable;
import java.util.Date;

public class VendorPartnerSetting implements Serializable {
    /**
	*记录ID<br/>
	**/
    private Long id;

    /**
	*商家（代理商）ID<br/>
	**/
    private Long vendorId;

    /**
	*代理商编码<br/>
	**/
    private String vendorCode;

    /**
	*代理商名称<br/>
	**/
    private String vendorName;

    /**
	*权限类型-0.ISV服务商 1-聚合支付渠道<br/>
	**/
    private Integer accountType;

    /**
	*授权模式下对应的支付表 dxh_pay.platform_account 中的 account_code 或者 在线支付 渠道编码 <br/>
	**/
    private String isvAccountCode;

    /**
	*isv服务商名称或渠道名称<br/>
	**/
    private String isvAccountName;

    /**
	*备注<br/>
	**/
    private String memo;

    /**
	*是否启用（1.启用 0.停用）<br/>
	**/
    private Integer usable;

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
     * This field corresponds to the database table vendorpartnersetting
     *
     * @mbggenerated Thu Jun 11 14:20:42 GMT+08:00 2020
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

    @Lable("代理商编码")
    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }

    @Lable("代理商名称")
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    @Lable("权限类型-0.ISV服务商 1-聚合支付渠道")
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    @Lable("授权模式下对应的支付表 dxh_pay.platform_account 中的 account_code 或者 在线支付 渠道编码 ")
    public String getIsvAccountCode() {
        return isvAccountCode;
    }

    public void setIsvAccountCode(String isvAccountCode) {
        this.isvAccountCode = isvAccountCode == null ? null : isvAccountCode.trim();
    }

    @Lable("isv服务商名称或渠道名称")
    public String getIsvAccountName() {
        return isvAccountName;
    }

    public void setIsvAccountName(String isvAccountName) {
        this.isvAccountName = isvAccountName == null ? null : isvAccountName.trim();
    }

    @Lable("备注")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    @Lable("是否启用（1.启用 0.停用）")
    public Integer getUsable() {
        return usable;
    }

    public void setUsable(Integer usable) {
        this.usable = usable;
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