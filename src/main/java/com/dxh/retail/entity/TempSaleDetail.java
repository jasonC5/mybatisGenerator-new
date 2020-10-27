package com.dxh.retail.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TempSaleDetail implements Serializable {
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
	*商品编码<br/>
	**/
    private String skuCode;

    /**
	*sku名称<br/>
	**/
    private String skuName;

    /**
	*原销售商品详情id(针对退货)<br/>
	**/
    private Long origDetailId;

    /**
	*国际条形码<br/>
	**/
    private String barcode;

    /**
	*销售附加码<br/>
	**/
    private String salePlusCode;

    /**
	*价签码 用于称重商品<br/>
	**/
    private String priceCode;

    /**
	*图片路径<br/>
	**/
    private String imgPath;

    /**
	*计价方式【 0：普通 、1：记重 、2：记时、 3：记数】<br/>
	**/
    private Integer saleType;

    /**
	*商品类型【0：普通商品、 1：制单组合、 2：制单拆分 、3：捆绑 、4：自动转货 、5：自动加工】<br/>
	**/
    private Integer itemType;

    /**
	*平台佣金比率<br/>
	**/
    private BigDecimal brokerage;

    /**
	*平台佣金<br/>
	**/
    private BigDecimal brokerAmount;

    /**
	*平台品类<br/>
	**/
    private Long catId;

    /**
	*属性名和值冗余列,例: 颜色,红色<br/>
	**/
    private String attrOne;

    /**
	*属性名和值冗余列,例: 尺码,S<br/>
	**/
    private String attrTwo;

    /**
	*规格属性3 尺码,S<br/>
	**/
    private String attrThree;

    /**
	*原单价<br/>
	**/
    private BigDecimal salePrice;

    /**
	*实际单价<br/>
	**/
    private BigDecimal realPrice;

    /**
	*单品促销优惠金额<br/>
	**/
    private BigDecimal preAmount;

    /**
	*抹零分摊、满减分摊、组合商品分摊合计金额<br/>
	**/
    private BigDecimal orderShareAmount;

    /**
	*优惠券分摊合计金额<br/>
	**/
    private BigDecimal couponShareAmount;

    /**
	*数量<br/>
	**/
    private BigDecimal skuNum;

    /**
	*实际单价*数量<br/>
	**/
    private BigDecimal amount;

    /**
	*优惠类型【0： 默认、1 ：折扣 、2 ：议价、3： 赠送 、4 ：会员优惠 、5 ：特价 、6 ：满折 、7： 满减 、8 ：满送 、9 ：加价购】<br/>
	**/
    private Integer preType;

    /**
	*是否主动折扣 【0 ：否 1： 是】<br/>
	**/
    private Integer activeDiscount;

    /**
	*提成基准价<br/>
	**/
    private BigDecimal profitPrice;

    /**
	*折扣<br/>
	**/
    private BigDecimal discount;

    /**
	*成本价<br/>
	**/
    private BigDecimal costPrice;

    /**
	*进价<br/>
	**/
    private BigDecimal purchasePrice;

    /**
	*是否赠送【1：是 、0：否】<br/>
	**/
    private Integer present;

    /**
	*积分值<br/>
	**/
    private BigDecimal integral;

    /**
	*商品扣点 联营 代销扣点<br/>
	**/
    private BigDecimal deductRate;

    /**
	*扣点金额<br/>
	**/
    private BigDecimal deduction;

    /**
	*营业员提成比率<br/>
	**/
    private BigDecimal saleManRate;

    /**
	*提成金额<br/>
	**/
    private BigDecimal rateAmount;

    /**
	*销售单位<br/>
	**/
    private String saleUnit;

    /**
	*库存单位<br/>
	**/
    private String stockUnit;

    /**
	*销售库存单位数量<br/>
	**/
    private BigDecimal saleStockNum;

    /**
	*后台优惠金额<br/>
	**/
    private BigDecimal onLinePreAmount;

    /**
	*销售单位类型【 0：库存单位 、1：辅助单位、2：辅助单位】<br/>
	**/
    private Integer unitType;

    /**
	*库存单位应收金额<br/>
	**/
    private BigDecimal stockSaleAmount;

    /**
	*商家一级品类编码<br/>
	**/
    private String firstIcatCode;

    /**
	*商家二级品类编码<br/>
	**/
    private String secondIcatCode;

    /**
	*商家三级品类编码<br/>
	**/
    private String thirdIcatCode;

    /**
	*商家四级品类编码<br/>
	**/
    private String fourthIcatCode;

    /**
	*一级品牌编码<br/>
	**/
    private String firstBrandCode;

    /**
	*二级品牌编码<br/>
	**/
    private String secondBrandCode;

    /**
	*三级品牌编码<br/>
	**/
    private String thirdBrandCode;

    /**
	*供应商编码<br/>
	**/
    private String supCode;

    /**
	*进价税<br/>
	**/
    private BigDecimal purchaseTax;

    /**
	*销价税<br/>
	**/
    private BigDecimal saleTax;

    /**
	*是否已删除【1：删除 0：正常】<br/>
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
	*联营结算标识 【0 ：未结算 、1 ：结算中、 2 ：已结算】<br/>
	**/
    private Integer jointSettleFlag;

    /**
	*均摊金额(均摊销售单优惠金额和整单折扣)<br/>
	**/
    private BigDecimal goHalvesAmount;

    /**
	*微店端商品显示名称<br/>
	**/
    private String wdSkuName;

    /**
	*团长佣金比例<br/>
	**/
    private BigDecimal grpbrokerage;

    /**
	*佣金金额<br/>
	**/
    private BigDecimal grpbrokerAmount;

    /**
	*原saleDetail表id<br/>
	**/
    private Long oldId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tempsaledetail
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

    @Lable("商品编码")
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    @Lable("sku名称")
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    @Lable("原销售商品详情id(针对退货)")
    public Long getOrigDetailId() {
        return origDetailId;
    }

    public void setOrigDetailId(Long origDetailId) {
        this.origDetailId = origDetailId;
    }

    @Lable("国际条形码")
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    @Lable("销售附加码")
    public String getSalePlusCode() {
        return salePlusCode;
    }

    public void setSalePlusCode(String salePlusCode) {
        this.salePlusCode = salePlusCode == null ? null : salePlusCode.trim();
    }

    @Lable("价签码 用于称重商品")
    public String getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(String priceCode) {
        this.priceCode = priceCode == null ? null : priceCode.trim();
    }

    @Lable("图片路径")
    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    @Lable("计价方式【 0：普通 、1：记重 、2：记时、 3：记数】")
    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    @Lable("商品类型【0：普通商品、 1：制单组合、 2：制单拆分 、3：捆绑 、4：自动转货 、5：自动加工】")
    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    @Lable("平台佣金比率")
    public BigDecimal getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(BigDecimal brokerage) {
        this.brokerage = brokerage;
    }

    @Lable("平台佣金")
    public BigDecimal getBrokerAmount() {
        return brokerAmount;
    }

    public void setBrokerAmount(BigDecimal brokerAmount) {
        this.brokerAmount = brokerAmount;
    }

    @Lable("平台品类")
    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    @Lable("属性名和值冗余列,例: 颜色,红色")
    public String getAttrOne() {
        return attrOne;
    }

    public void setAttrOne(String attrOne) {
        this.attrOne = attrOne == null ? null : attrOne.trim();
    }

    @Lable("属性名和值冗余列,例: 尺码,S")
    public String getAttrTwo() {
        return attrTwo;
    }

    public void setAttrTwo(String attrTwo) {
        this.attrTwo = attrTwo == null ? null : attrTwo.trim();
    }

    @Lable("规格属性3 尺码,S")
    public String getAttrThree() {
        return attrThree;
    }

    public void setAttrThree(String attrThree) {
        this.attrThree = attrThree == null ? null : attrThree.trim();
    }

    @Lable("原单价")
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Lable("实际单价")
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Lable("单品促销优惠金额")
    public BigDecimal getPreAmount() {
        return preAmount;
    }

    public void setPreAmount(BigDecimal preAmount) {
        this.preAmount = preAmount;
    }

    @Lable("抹零分摊、满减分摊、组合商品分摊合计金额")
    public BigDecimal getOrderShareAmount() {
        return orderShareAmount;
    }

    public void setOrderShareAmount(BigDecimal orderShareAmount) {
        this.orderShareAmount = orderShareAmount;
    }

    @Lable("优惠券分摊合计金额")
    public BigDecimal getCouponShareAmount() {
        return couponShareAmount;
    }

    public void setCouponShareAmount(BigDecimal couponShareAmount) {
        this.couponShareAmount = couponShareAmount;
    }

    @Lable("数量")
    public BigDecimal getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(BigDecimal skuNum) {
        this.skuNum = skuNum;
    }

    @Lable("实际单价*数量")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Lable("优惠类型【0： 默认、1 ：折扣 、2 ：议价、3： 赠送 、4 ：会员优惠 、5 ：特价 、6 ：满折 、7： 满减 、8 ：满送 、9 ：加价购】")
    public Integer getPreType() {
        return preType;
    }

    public void setPreType(Integer preType) {
        this.preType = preType;
    }

    @Lable("是否主动折扣 【0 ：否 1： 是】")
    public Integer getActiveDiscount() {
        return activeDiscount;
    }

    public void setActiveDiscount(Integer activeDiscount) {
        this.activeDiscount = activeDiscount;
    }

    @Lable("提成基准价")
    public BigDecimal getProfitPrice() {
        return profitPrice;
    }

    public void setProfitPrice(BigDecimal profitPrice) {
        this.profitPrice = profitPrice;
    }

    @Lable("折扣")
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Lable("成本价")
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    @Lable("进价")
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Lable("是否赠送【1：是 、0：否】")
    public Integer getPresent() {
        return present;
    }

    public void setPresent(Integer present) {
        this.present = present;
    }

    @Lable("积分值")
    public BigDecimal getIntegral() {
        return integral;
    }

    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    @Lable("商品扣点 联营 代销扣点")
    public BigDecimal getDeductRate() {
        return deductRate;
    }

    public void setDeductRate(BigDecimal deductRate) {
        this.deductRate = deductRate;
    }

    @Lable("扣点金额")
    public BigDecimal getDeduction() {
        return deduction;
    }

    public void setDeduction(BigDecimal deduction) {
        this.deduction = deduction;
    }

    @Lable("营业员提成比率")
    public BigDecimal getSaleManRate() {
        return saleManRate;
    }

    public void setSaleManRate(BigDecimal saleManRate) {
        this.saleManRate = saleManRate;
    }

    @Lable("提成金额")
    public BigDecimal getRateAmount() {
        return rateAmount;
    }

    public void setRateAmount(BigDecimal rateAmount) {
        this.rateAmount = rateAmount;
    }

    @Lable("销售单位")
    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit == null ? null : saleUnit.trim();
    }

    @Lable("库存单位")
    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit == null ? null : stockUnit.trim();
    }

    @Lable("销售库存单位数量")
    public BigDecimal getSaleStockNum() {
        return saleStockNum;
    }

    public void setSaleStockNum(BigDecimal saleStockNum) {
        this.saleStockNum = saleStockNum;
    }

    @Lable("后台优惠金额")
    public BigDecimal getOnLinePreAmount() {
        return onLinePreAmount;
    }

    public void setOnLinePreAmount(BigDecimal onLinePreAmount) {
        this.onLinePreAmount = onLinePreAmount;
    }

    @Lable("销售单位类型【 0：库存单位 、1：辅助单位、2：辅助单位】")
    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    @Lable("库存单位应收金额")
    public BigDecimal getStockSaleAmount() {
        return stockSaleAmount;
    }

    public void setStockSaleAmount(BigDecimal stockSaleAmount) {
        this.stockSaleAmount = stockSaleAmount;
    }

    @Lable("商家一级品类编码")
    public String getFirstIcatCode() {
        return firstIcatCode;
    }

    public void setFirstIcatCode(String firstIcatCode) {
        this.firstIcatCode = firstIcatCode == null ? null : firstIcatCode.trim();
    }

    @Lable("商家二级品类编码")
    public String getSecondIcatCode() {
        return secondIcatCode;
    }

    public void setSecondIcatCode(String secondIcatCode) {
        this.secondIcatCode = secondIcatCode == null ? null : secondIcatCode.trim();
    }

    @Lable("商家三级品类编码")
    public String getThirdIcatCode() {
        return thirdIcatCode;
    }

    public void setThirdIcatCode(String thirdIcatCode) {
        this.thirdIcatCode = thirdIcatCode == null ? null : thirdIcatCode.trim();
    }

    @Lable("商家四级品类编码")
    public String getFourthIcatCode() {
        return fourthIcatCode;
    }

    public void setFourthIcatCode(String fourthIcatCode) {
        this.fourthIcatCode = fourthIcatCode == null ? null : fourthIcatCode.trim();
    }

    @Lable("一级品牌编码")
    public String getFirstBrandCode() {
        return firstBrandCode;
    }

    public void setFirstBrandCode(String firstBrandCode) {
        this.firstBrandCode = firstBrandCode == null ? null : firstBrandCode.trim();
    }

    @Lable("二级品牌编码")
    public String getSecondBrandCode() {
        return secondBrandCode;
    }

    public void setSecondBrandCode(String secondBrandCode) {
        this.secondBrandCode = secondBrandCode == null ? null : secondBrandCode.trim();
    }

    @Lable("三级品牌编码")
    public String getThirdBrandCode() {
        return thirdBrandCode;
    }

    public void setThirdBrandCode(String thirdBrandCode) {
        this.thirdBrandCode = thirdBrandCode == null ? null : thirdBrandCode.trim();
    }

    @Lable("供应商编码")
    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode == null ? null : supCode.trim();
    }

    @Lable("进价税")
    public BigDecimal getPurchaseTax() {
        return purchaseTax;
    }

    public void setPurchaseTax(BigDecimal purchaseTax) {
        this.purchaseTax = purchaseTax;
    }

    @Lable("销价税")
    public BigDecimal getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(BigDecimal saleTax) {
        this.saleTax = saleTax;
    }

    @Lable("是否已删除【1：删除 0：正常】")
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

    @Lable("联营结算标识 【0 ：未结算 、1 ：结算中、 2 ：已结算】")
    public Integer getJointSettleFlag() {
        return jointSettleFlag;
    }

    public void setJointSettleFlag(Integer jointSettleFlag) {
        this.jointSettleFlag = jointSettleFlag;
    }

    @Lable("均摊金额(均摊销售单优惠金额和整单折扣)")
    public BigDecimal getGoHalvesAmount() {
        return goHalvesAmount;
    }

    public void setGoHalvesAmount(BigDecimal goHalvesAmount) {
        this.goHalvesAmount = goHalvesAmount;
    }

    @Lable("微店端商品显示名称")
    public String getWdSkuName() {
        return wdSkuName;
    }

    public void setWdSkuName(String wdSkuName) {
        this.wdSkuName = wdSkuName == null ? null : wdSkuName.trim();
    }

    @Lable("团长佣金比例")
    public BigDecimal getGrpbrokerage() {
        return grpbrokerage;
    }

    public void setGrpbrokerage(BigDecimal grpbrokerage) {
        this.grpbrokerage = grpbrokerage;
    }

    @Lable("佣金金额")
    public BigDecimal getGrpbrokerAmount() {
        return grpbrokerAmount;
    }

    public void setGrpbrokerAmount(BigDecimal grpbrokerAmount) {
        this.grpbrokerAmount = grpbrokerAmount;
    }

    @Lable("原saleDetail表id")
    public Long getOldId() {
        return oldId;
    }

    public void setOldId(Long oldId) {
        this.oldId = oldId;
    }
}