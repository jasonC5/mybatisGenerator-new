package com.dxh.wd.entity;

import java.io.Serializable;
import java.util.Date;

public class ThirdStoreBind implements Serializable {
    /**
	*记录编号<br/>
	**/
    private Long id;

    /**
	*所属商家Id<br/>
	**/
    private Long vendorId;

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
	*绑定类型：0得益京东到家<br/>
	**/
    private Integer bindType;

    /**
	*第三方门店(京东到家)编码<br/>
	**/
    private String thirdStoreCode;

    /**
	*财务配置flag<br/>
	**/
    private Integer configFlag;

    /**
	*订单佣金flag 0否 1是<br/>
	**/
    private Integer commissionFlag;

    /**
	*商家承担运费补贴 0否 1是<br/>
	**/
    private Integer transFeeFlag;

    /**
	*删除标记<br/>
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
	*创建人<br/>
	**/
    private String creator;

    /**
	*修改人<br/>
	**/
    private String mendor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table thirdstorebind
     *
     * @mbggenerated Fri Oct 16 14:19:37 GMT+08:00 2020
     */
    private static final long serialVersionUID = 1L;

    @Lable("记录编号")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Lable("所属商家Id")
    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
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

    @Lable("绑定类型：0得益京东到家")
    public Integer getBindType() {
        return bindType;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    @Lable("第三方门店(京东到家)编码")
    public String getThirdStoreCode() {
        return thirdStoreCode;
    }

    public void setThirdStoreCode(String thirdStoreCode) {
        this.thirdStoreCode = thirdStoreCode == null ? null : thirdStoreCode.trim();
    }

    @Lable("财务配置flag")
    public Integer getConfigFlag() {
        return configFlag;
    }

    public void setConfigFlag(Integer configFlag) {
        this.configFlag = configFlag;
    }

    @Lable("订单佣金flag 0否 1是")
    public Integer getCommissionFlag() {
        return commissionFlag;
    }

    public void setCommissionFlag(Integer commissionFlag) {
        this.commissionFlag = commissionFlag;
    }

    @Lable("商家承担运费补贴 0否 1是")
    public Integer getTransFeeFlag() {
        return transFeeFlag;
    }

    public void setTransFeeFlag(Integer transFeeFlag) {
        this.transFeeFlag = transFeeFlag;
    }

    @Lable("删除标记")
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

    @Lable("创建人")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    @Lable("修改人")
    public String getMendor() {
        return mendor;
    }

    public void setMendor(String mendor) {
        this.mendor = mendor == null ? null : mendor.trim();
    }
}