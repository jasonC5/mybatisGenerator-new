package com.dxh.retail.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TempSaleOrder implements Serializable {
    /**
	*记录ID<br/>
	**/
    private Long id;

    /**
	*所属商家ID<br/>
	**/
    private Long vendorId;

    /**
	*单据号<br/>
	**/
    private String orderNo;

    /**
	*销售点设备编码 例:pos机编码 手持编码<br/>
	**/
    private String posCode;

    /**
	*订单归属门店<br/>
	**/
    private String orderStore;

    /**
	*订单归属门店名称<br/>
	**/
    private String orderStoreName;

    /**
	*下单门店<br/>
	**/
    private String srcStore;

    /**
	*下单门店名称<br/>
	**/
    private String srcStoreName;

    /**
	*机构编码<br/>
	**/
    private String organCode;

    /**
	*机构名称<br/>
	**/
    private String organName;

    /**
	*下单机构Name<br/>
	**/
    private String srcOrganName;

    /**
	*下单机构<br/>
	**/
    private String srcOrganCode;

    /**
	*微信openId<br/>
	**/
    private String openId;

    /**
	*微信公众号<br/>
	**/
    private String account;

    /**
	*会员卡号<br/>
	**/
    private String memberCode;

    /**
	*父级会员卡号<br/>
	**/
    private String parentMemPin;

    /**
	*会员用户名 系统登录名<br/>
	**/
    private String memberPin;

    /**
	*会员手机号<br/>
	**/
    private String memberPhone;

    /**
	*会员储值卡号<br/>
	**/
    private String memberCardNo;

    /**
	*会员储值ID<br/>
	**/
    private String memberCardId;

    /**
	*会员等级类别编码<br/>
	**/
    private String memberCatCode;

    /**
	*会员等级类别名称<br/>
	**/
    private String memberCatName;

    /**
	*订单总额优惠前的金额<br/>
	**/
    private BigDecimal orderAmount;

    /**
	*客户实际支付的金额<br/>
	**/
    private BigDecimal realPayAmount;

    /**
	*订单小计金额（orderAmount减去单品优惠，不减整单优惠）<br/>
	**/
    private BigDecimal subtotalAmount;

    /**
	*订单优惠总金额（orderAmount 减 realPayAmount）<br/>
	**/
    private BigDecimal discountAmount;

    /**
	*整单折扣率<br/>
	**/
    private BigDecimal discount;

    /**
	*商品数量<br/>
	**/
    private BigDecimal skuNum;

    /**
	*销售库存单位数量<br/>
	**/
    private BigDecimal saleStockNum;

    /**
	*运费<br/>
	**/
    private BigDecimal transFee;

    /**
	*积分<br/>
	**/
    private BigDecimal integral;

    /**
	*原单据号-针对退货单；拼团销售拆单的主单据号<br/>
	**/
    private String origNo;

    /**
	*提货码<br/>
	**/
    private String pickUpCode;

    /**
	*配送方式 【0：在线配送 、1.：门店自提】<br/>
	**/
    private Integer distributionType;

    /**
	*支付模式 【0：线上支付、 1：门店支付 、2.：货到付款】<br/>
	**/
    private Integer payMode;

    /**
	*快递单号<br/>
	**/
    private String expressNo;

    /**
	*快递名称<br/>
	**/
    private String expressName;

    /**
	*支付结算状态 【1：已支付、 0：未支付】<br/>
	**/
    private Integer payFlag;

    /**
	*是否返佣<br/>
	**/
    private Integer distFlag;

    /**
	*收银员<br/>
	**/
    private String cashier;

    /**
	*收银员名称<br/>
	**/
    private String cashierName;

    /**
	*订单状态 【0：已提交、 1：待发货 、2：已发货、 3：已完成 、4：已取消、10：已退款】<br/>
	**/
    private Integer orderStatus;

    /**
	*是否已确认<br/>
	**/
    private Integer confirmFlag;

    /**
	*是否允许退货 【1：允许， 0 ：不允许】<br/>
	**/
    private Integer refund;

    /**
	*结算标识<br/>
	**/
    private Integer settleFlag;

    /**
	*单据标记 【0：销售单 、1：退货单 、2：退款单】<br/>
	**/
    private Integer orderFlag;

    /**
	*订单来源【 0：pos 、 1：微店  、2：PC商城  、4：B2B 、5：自由购 、6：美团 、7：饿了么 、8：无人货柜、 9：安卓pos 、10：小程序订单】<br/>
	**/
    private Integer source;

    /**
	*第三方订单号<br/>
	**/
    private String thirdOrderNo;

    /**
	*支付宝、微信支付码<br/>
	**/
    private String webPayNo;

    /**
	*备注<br/>
	**/
    private String memo;

    /**
	*卖家备注<br/>
	**/
    private String sellMemo;

    /**
	*是否已推送至财务系统 【0：未推送 、1：已推送】<br/>
	**/
    private Integer syncFlag;

    /**
	*收货人地址<br/>
	**/
    private String recipientAddress;

    /**
	*送达要求 0立即送达 其余为送达时间字符串<br/>
	**/
    private String deliveryTime;

    /**
	*促销员编码<br/>
	**/
    private String distMemPin;

    /**
	*是否已删除  【1：删除、 0：正常】<br/>
	**/
    private Integer df;

    /**
	*记录创建人用户名<br/>
	**/
    private String creator;

    /**
	*最后修改人用户名<br/>
	**/
    private String mender;

    /**
	*版本<br/>
	**/
    private Integer version;

    /**
	*确认订单时间<br/>
	**/
    private Date confirmOrderDate;

    /**
	*配送时间<br/>
	**/
    private Date deliveryOrderDate;

    /**
	*完成时间<br/>
	**/
    private Date finishDate;

    /**
	*下单日期<br/>
	**/
    private Date orderDate;

    /**
	*下单修改日期<br/>
	**/
    private Date orderModifyDate;

    /**
	*订单上传到后台的时间<br/>
	**/
    private Date uploadDate;

    /**
	*创建日期<br/>
	**/
    private Date createDate;

    /**
	*修改日期<br/>
	**/
    private Date modifyDate;

    /**
	*处理标识(外卖专用) 【0：sku匹配成功、 1：sku匹配失败 、2：库存处理成功、 3：库存处理失败】<br/>
	**/
    private Integer dealFlag;

    /**
	*商家实收/预计收入<br/>
	**/
    private BigDecimal income;

    /**
	*在线支付金额<br/>
	**/
    private BigDecimal onlinePay;

    /**
	*平台服务费/菜品分成<br/>
	**/
    private BigDecimal serviceFee;

    /**
	*商户承担活动补贴<br/>
	**/
    private BigDecimal shopPart;

    /**
	*外卖平台承担活动补贴<br/>
	**/
    private BigDecimal wmPart;

    /**
	*优惠券优惠金额(元)<br/>
	**/
    private BigDecimal couponAmount;

    /**
	*SYS分账平台服务费(分)<br/>
	**/
    private BigDecimal sysDivBalanceAmount;

    /**
	*系统分账标志位  【0：无效、 1：系统分账 、2：商家SAAS分账】<br/>
	**/
    private Integer sysDivBalanceFlag;

    /**
	*配送方式 【0 ：物流发货、 1 ：门店配送、 2：美团、3：饿了么、<br/>
	**/
    private Integer deliveryType;

    /**
	*是否打印过发票【0：未 、1：已】<br/>
	**/
    private String isPrintReceipt;

    /**
	*否自动打印小票【0：否、1：是】<br/>
	**/
    private String autoPrintTicket;

    /**
	*促销员名称<br/>
	**/
    private String distMemName;

    /**
	*促销员手机号<br/>
	**/
    private String distMemPhone;

    /**
	*是否是新版本订单数据【0:老版本、1:新版本】<br/>
	**/
    private Integer orderVersionFlag;

    /**
	*原saleorder表id<br/>
	**/
    private Long oldId;

    /**
	*是否全部退【0：部分退、1：全部退】<br/>
	**/
    private Integer isWholeRefund;

    /**
	*是否有返利<br/>
	**/
    private Integer hasRebate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tempsaleorder
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
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

    @Lable("单据号")
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    @Lable("销售点设备编码 例:pos机编码 手持编码")
    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode == null ? null : posCode.trim();
    }

    @Lable("订单归属门店")
    public String getOrderStore() {
        return orderStore;
    }

    public void setOrderStore(String orderStore) {
        this.orderStore = orderStore == null ? null : orderStore.trim();
    }

    @Lable("订单归属门店名称")
    public String getOrderStoreName() {
        return orderStoreName;
    }

    public void setOrderStoreName(String orderStoreName) {
        this.orderStoreName = orderStoreName == null ? null : orderStoreName.trim();
    }

    @Lable("下单门店")
    public String getSrcStore() {
        return srcStore;
    }

    public void setSrcStore(String srcStore) {
        this.srcStore = srcStore == null ? null : srcStore.trim();
    }

    @Lable("下单门店名称")
    public String getSrcStoreName() {
        return srcStoreName;
    }

    public void setSrcStoreName(String srcStoreName) {
        this.srcStoreName = srcStoreName == null ? null : srcStoreName.trim();
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

    @Lable("下单机构Name")
    public String getSrcOrganName() {
        return srcOrganName;
    }

    public void setSrcOrganName(String srcOrganName) {
        this.srcOrganName = srcOrganName == null ? null : srcOrganName.trim();
    }

    @Lable("下单机构")
    public String getSrcOrganCode() {
        return srcOrganCode;
    }

    public void setSrcOrganCode(String srcOrganCode) {
        this.srcOrganCode = srcOrganCode == null ? null : srcOrganCode.trim();
    }

    @Lable("微信openId")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    @Lable("微信公众号")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    @Lable("会员卡号")
    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode == null ? null : memberCode.trim();
    }

    @Lable("父级会员卡号")
    public String getParentMemPin() {
        return parentMemPin;
    }

    public void setParentMemPin(String parentMemPin) {
        this.parentMemPin = parentMemPin == null ? null : parentMemPin.trim();
    }

    @Lable("会员用户名 系统登录名")
    public String getMemberPin() {
        return memberPin;
    }

    public void setMemberPin(String memberPin) {
        this.memberPin = memberPin == null ? null : memberPin.trim();
    }

    @Lable("会员手机号")
    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    @Lable("会员储值卡号")
    public String getMemberCardNo() {
        return memberCardNo;
    }

    public void setMemberCardNo(String memberCardNo) {
        this.memberCardNo = memberCardNo == null ? null : memberCardNo.trim();
    }

    @Lable("会员储值ID")
    public String getMemberCardId() {
        return memberCardId;
    }

    public void setMemberCardId(String memberCardId) {
        this.memberCardId = memberCardId == null ? null : memberCardId.trim();
    }

    @Lable("会员等级类别编码")
    public String getMemberCatCode() {
        return memberCatCode;
    }

    public void setMemberCatCode(String memberCatCode) {
        this.memberCatCode = memberCatCode == null ? null : memberCatCode.trim();
    }

    @Lable("会员等级类别名称")
    public String getMemberCatName() {
        return memberCatName;
    }

    public void setMemberCatName(String memberCatName) {
        this.memberCatName = memberCatName == null ? null : memberCatName.trim();
    }

    @Lable("订单总额优惠前的金额")
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Lable("客户实际支付的金额")
    public BigDecimal getRealPayAmount() {
        return realPayAmount;
    }

    public void setRealPayAmount(BigDecimal realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    @Lable("订单小计金额（orderAmount减去单品优惠，不减整单优惠）")
    public BigDecimal getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(BigDecimal subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    @Lable("订单优惠总金额（orderAmount 减 realPayAmount）")
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Lable("整单折扣率")
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Lable("商品数量")
    public BigDecimal getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(BigDecimal skuNum) {
        this.skuNum = skuNum;
    }

    @Lable("销售库存单位数量")
    public BigDecimal getSaleStockNum() {
        return saleStockNum;
    }

    public void setSaleStockNum(BigDecimal saleStockNum) {
        this.saleStockNum = saleStockNum;
    }

    @Lable("运费")
    public BigDecimal getTransFee() {
        return transFee;
    }

    public void setTransFee(BigDecimal transFee) {
        this.transFee = transFee;
    }

    @Lable("积分")
    public BigDecimal getIntegral() {
        return integral;
    }

    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    @Lable("原单据号-针对退货单；拼团销售拆单的主单据号")
    public String getOrigNo() {
        return origNo;
    }

    public void setOrigNo(String origNo) {
        this.origNo = origNo == null ? null : origNo.trim();
    }

    @Lable("提货码")
    public String getPickUpCode() {
        return pickUpCode;
    }

    public void setPickUpCode(String pickUpCode) {
        this.pickUpCode = pickUpCode == null ? null : pickUpCode.trim();
    }

    @Lable("配送方式 【0：在线配送 、1.：门店自提】")
    public Integer getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Integer distributionType) {
        this.distributionType = distributionType;
    }

    @Lable("支付模式 【0：线上支付、 1：门店支付 、2.：货到付款】")
    public Integer getPayMode() {
        return payMode;
    }

    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    @Lable("快递单号")
    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    @Lable("快递名称")
    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName == null ? null : expressName.trim();
    }

    @Lable("支付结算状态 【1：已支付、 0：未支付】")
    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }

    @Lable("是否返佣")
    public Integer getDistFlag() {
        return distFlag;
    }

    public void setDistFlag(Integer distFlag) {
        this.distFlag = distFlag;
    }

    @Lable("收银员")
    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier == null ? null : cashier.trim();
    }

    @Lable("收银员名称")
    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName == null ? null : cashierName.trim();
    }

    @Lable("订单状态 【0：已提交、 1：待发货 、2：已发货、 3：已完成 、4：已取消、10：已退款】")
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Lable("是否已确认")
    public Integer getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(Integer confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    @Lable("是否允许退货 【1：允许， 0 ：不允许】")
    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }

    @Lable("结算标识")
    public Integer getSettleFlag() {
        return settleFlag;
    }

    public void setSettleFlag(Integer settleFlag) {
        this.settleFlag = settleFlag;
    }

    @Lable("单据标记 【0：销售单 、1：退货单 、2：退款单】")
    public Integer getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

    @Lable("订单来源【 0：pos 、 1：微店  、2：PC商城  、4：B2B 、5：自由购 、6：美团 、7：饿了么 、8：无人货柜、 9：安卓pos 、10：小程序订单】")
    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    @Lable("第三方订单号")
    public String getThirdOrderNo() {
        return thirdOrderNo;
    }

    public void setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo == null ? null : thirdOrderNo.trim();
    }

    @Lable("支付宝、微信支付码")
    public String getWebPayNo() {
        return webPayNo;
    }

    public void setWebPayNo(String webPayNo) {
        this.webPayNo = webPayNo == null ? null : webPayNo.trim();
    }

    @Lable("备注")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    @Lable("卖家备注")
    public String getSellMemo() {
        return sellMemo;
    }

    public void setSellMemo(String sellMemo) {
        this.sellMemo = sellMemo == null ? null : sellMemo.trim();
    }

    @Lable("是否已推送至财务系统 【0：未推送 、1：已推送】")
    public Integer getSyncFlag() {
        return syncFlag;
    }

    public void setSyncFlag(Integer syncFlag) {
        this.syncFlag = syncFlag;
    }

    @Lable("收货人地址")
    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress == null ? null : recipientAddress.trim();
    }

    @Lable("送达要求 0立即送达 其余为送达时间字符串")
    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime == null ? null : deliveryTime.trim();
    }

    @Lable("促销员编码")
    public String getDistMemPin() {
        return distMemPin;
    }

    public void setDistMemPin(String distMemPin) {
        this.distMemPin = distMemPin == null ? null : distMemPin.trim();
    }

    @Lable("是否已删除  【1：删除、 0：正常】")
    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }

    @Lable("记录创建人用户名")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    @Lable("最后修改人用户名")
    public String getMender() {
        return mender;
    }

    public void setMender(String mender) {
        this.mender = mender == null ? null : mender.trim();
    }

    @Lable("版本")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Lable("确认订单时间")
    public Date getConfirmOrderDate() {
        return confirmOrderDate;
    }

    public void setConfirmOrderDate(Date confirmOrderDate) {
        this.confirmOrderDate = confirmOrderDate;
    }

    @Lable("配送时间")
    public Date getDeliveryOrderDate() {
        return deliveryOrderDate;
    }

    public void setDeliveryOrderDate(Date deliveryOrderDate) {
        this.deliveryOrderDate = deliveryOrderDate;
    }

    @Lable("完成时间")
    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    @Lable("下单日期")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Lable("下单修改日期")
    public Date getOrderModifyDate() {
        return orderModifyDate;
    }

    public void setOrderModifyDate(Date orderModifyDate) {
        this.orderModifyDate = orderModifyDate;
    }

    @Lable("订单上传到后台的时间")
    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
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

    @Lable("处理标识(外卖专用) 【0：sku匹配成功、 1：sku匹配失败 、2：库存处理成功、 3：库存处理失败】")
    public Integer getDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(Integer dealFlag) {
        this.dealFlag = dealFlag;
    }

    @Lable("商家实收/预计收入")
    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    @Lable("在线支付金额")
    public BigDecimal getOnlinePay() {
        return onlinePay;
    }

    public void setOnlinePay(BigDecimal onlinePay) {
        this.onlinePay = onlinePay;
    }

    @Lable("平台服务费/菜品分成")
    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    @Lable("商户承担活动补贴")
    public BigDecimal getShopPart() {
        return shopPart;
    }

    public void setShopPart(BigDecimal shopPart) {
        this.shopPart = shopPart;
    }

    @Lable("外卖平台承担活动补贴")
    public BigDecimal getWmPart() {
        return wmPart;
    }

    public void setWmPart(BigDecimal wmPart) {
        this.wmPart = wmPart;
    }

    @Lable("优惠券优惠金额(元)")
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Lable("SYS分账平台服务费(分)")
    public BigDecimal getSysDivBalanceAmount() {
        return sysDivBalanceAmount;
    }

    public void setSysDivBalanceAmount(BigDecimal sysDivBalanceAmount) {
        this.sysDivBalanceAmount = sysDivBalanceAmount;
    }

    @Lable("系统分账标志位  【0：无效、 1：系统分账 、2：商家SAAS分账】")
    public Integer getSysDivBalanceFlag() {
        return sysDivBalanceFlag;
    }

    public void setSysDivBalanceFlag(Integer sysDivBalanceFlag) {
        this.sysDivBalanceFlag = sysDivBalanceFlag;
    }

    @Lable("配送方式 【0 ：物流发货、 1 ：门店配送、 2：美团、3：饿了么、")
    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Lable("是否打印过发票【0：未 、1：已】")
    public String getIsPrintReceipt() {
        return isPrintReceipt;
    }

    public void setIsPrintReceipt(String isPrintReceipt) {
        this.isPrintReceipt = isPrintReceipt == null ? null : isPrintReceipt.trim();
    }

    @Lable("否自动打印小票【0：否、1：是】")
    public String getAutoPrintTicket() {
        return autoPrintTicket;
    }

    public void setAutoPrintTicket(String autoPrintTicket) {
        this.autoPrintTicket = autoPrintTicket == null ? null : autoPrintTicket.trim();
    }

    @Lable("促销员名称")
    public String getDistMemName() {
        return distMemName;
    }

    public void setDistMemName(String distMemName) {
        this.distMemName = distMemName == null ? null : distMemName.trim();
    }

    @Lable("促销员手机号")
    public String getDistMemPhone() {
        return distMemPhone;
    }

    public void setDistMemPhone(String distMemPhone) {
        this.distMemPhone = distMemPhone == null ? null : distMemPhone.trim();
    }

    @Lable("是否是新版本订单数据【0:老版本、1:新版本】")
    public Integer getOrderVersionFlag() {
        return orderVersionFlag;
    }

    public void setOrderVersionFlag(Integer orderVersionFlag) {
        this.orderVersionFlag = orderVersionFlag;
    }

    @Lable("原saleorder表id")
    public Long getOldId() {
        return oldId;
    }

    public void setOldId(Long oldId) {
        this.oldId = oldId;
    }

    @Lable("是否全部退【0：部分退、1：全部退】")
    public Integer getIsWholeRefund() {
        return isWholeRefund;
    }

    public void setIsWholeRefund(Integer isWholeRefund) {
        this.isWholeRefund = isWholeRefund;
    }

    @Lable("是否有返利")
    public Integer getHasRebate() {
        return hasRebate;
    }

    public void setHasRebate(Integer hasRebate) {
        this.hasRebate = hasRebate;
    }
}