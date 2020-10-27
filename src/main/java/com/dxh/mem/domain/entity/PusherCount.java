package com.dxh.mem.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class PusherCount implements Serializable {
    /**
	*记录ID<br/>
	**/
    private Long id;

    /**
	*所属商家ID<br/>
	**/
    private Long vendorId;

    /**
	*推广员编码<br/>
	**/
    private String pusherCode;

    /**
	*门店编码<br/>
	**/
    private String storeCode;

    /**
	*门店名称<br/>
	**/
    private String storeName;

    /**
	*扫码数<br/>
	**/
    private Integer scanQRNum;

    /**
	*注册数<br/>
	**/
    private Integer registerNum;

    /**
	*首单参考金额<br/>
	**/
    private Double firstOrderAmount;

    /**
	*首单数量(小于等于首单参考金额)<br/>
	**/
    private Integer lessFirstOrderNum;

    /**
	*首单数量(大于等于首单参考金额)<br/>
	**/
    private Integer moreFirstOrderNum;

    /**
	*二购参考金额<br/>
	**/
    private Double secondOrderAmount;

    /**
	*二购数量(小于等于二购参考金额)<br/>
	**/
    private Integer lessSecondOrderNum;

    /**
	*二购数量(大于等于二购参考金额)<br/>
	**/
    private Integer moreSecondOrderNum;

    /**
	*首单退货数量(小于等于首单参考金额)<br/>
	**/
    private Integer lessFirstOrderNum2;

    /**
	*首单退货数量(大于等于首单参考金额)<br/>
	**/
    private Integer moreFirstOrderNum2;

    /**
	*二购退货数量(小于等于二购参考金额)<br/>
	**/
    private Integer lessSecondOrderNum2;

    /**
	*二购退货数量(大于等于二购参考金额)<br/>
	**/
    private Integer moreSecondOrderNum2;

    /**
	*完成时间<br/>
	**/
    private Date finishDate;

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
     * This field corresponds to the database table pushercount
     *
     * @mbggenerated Wed Apr 17 10:26:42 GMT+08:00 2019
     */
    private static final long serialVersionUID = 1L;

    @Lable("记录ID")
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

    @Lable("推广员编码")
    public String getPusherCode() {
        return pusherCode;
    }

    public void setPusherCode(String pusherCode) {
        this.pusherCode = pusherCode == null ? null : pusherCode.trim();
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

    @Lable("扫码数")
    public Integer getScanQRNum() {
        return scanQRNum;
    }

    public void setScanQRNum(Integer scanQRNum) {
        this.scanQRNum = scanQRNum;
    }

    @Lable("注册数")
    public Integer getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(Integer registerNum) {
        this.registerNum = registerNum;
    }

    @Lable("首单参考金额")
    public Double getFirstOrderAmount() {
        return firstOrderAmount;
    }

    public void setFirstOrderAmount(Double firstOrderAmount) {
        this.firstOrderAmount = firstOrderAmount;
    }

    @Lable("首单数量(小于等于首单参考金额)")
    public Integer getLessFirstOrderNum() {
        return lessFirstOrderNum;
    }

    public void setLessFirstOrderNum(Integer lessFirstOrderNum) {
        this.lessFirstOrderNum = lessFirstOrderNum;
    }

    @Lable("首单数量(大于等于首单参考金额)")
    public Integer getMoreFirstOrderNum() {
        return moreFirstOrderNum;
    }

    public void setMoreFirstOrderNum(Integer moreFirstOrderNum) {
        this.moreFirstOrderNum = moreFirstOrderNum;
    }

    @Lable("二购参考金额")
    public Double getSecondOrderAmount() {
        return secondOrderAmount;
    }

    public void setSecondOrderAmount(Double secondOrderAmount) {
        this.secondOrderAmount = secondOrderAmount;
    }

    @Lable("二购数量(小于等于二购参考金额)")
    public Integer getLessSecondOrderNum() {
        return lessSecondOrderNum;
    }

    public void setLessSecondOrderNum(Integer lessSecondOrderNum) {
        this.lessSecondOrderNum = lessSecondOrderNum;
    }

    @Lable("二购数量(大于等于二购参考金额)")
    public Integer getMoreSecondOrderNum() {
        return moreSecondOrderNum;
    }

    public void setMoreSecondOrderNum(Integer moreSecondOrderNum) {
        this.moreSecondOrderNum = moreSecondOrderNum;
    }

    @Lable("首单退货数量(小于等于首单参考金额)")
    public Integer getLessFirstOrderNum2() {
        return lessFirstOrderNum2;
    }

    public void setLessFirstOrderNum2(Integer lessFirstOrderNum2) {
        this.lessFirstOrderNum2 = lessFirstOrderNum2;
    }

    @Lable("首单退货数量(大于等于首单参考金额)")
    public Integer getMoreFirstOrderNum2() {
        return moreFirstOrderNum2;
    }

    public void setMoreFirstOrderNum2(Integer moreFirstOrderNum2) {
        this.moreFirstOrderNum2 = moreFirstOrderNum2;
    }

    @Lable("二购退货数量(小于等于二购参考金额)")
    public Integer getLessSecondOrderNum2() {
        return lessSecondOrderNum2;
    }

    public void setLessSecondOrderNum2(Integer lessSecondOrderNum2) {
        this.lessSecondOrderNum2 = lessSecondOrderNum2;
    }

    @Lable("二购退货数量(大于等于二购参考金额)")
    public Integer getMoreSecondOrderNum2() {
        return moreSecondOrderNum2;
    }

    public void setMoreSecondOrderNum2(Integer moreSecondOrderNum2) {
        this.moreSecondOrderNum2 = moreSecondOrderNum2;
    }

    @Lable("完成时间")
    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
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