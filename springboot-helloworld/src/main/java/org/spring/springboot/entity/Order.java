package org.spring.springboot.entity;

import java.sql.Blob;
import java.sql.Date;

/**
 * 订单
 */
public class Order {
	/**
	 * ID
	 */
	protected Integer id;
	/**
	 * 创建日期
	 */
	protected Date createDate;
	/**
	 * 最后修改日期
	 */
	protected Date modifyDate;
	/**
	 * 地址
	 */
	protected String address;
	/**
	 * 订单金额
	 */
	protected Float amount;
	/**
	 * 已付金额
	 */
	protected Float amountPaid;
	/**
	 * 地区名称
	 */
	protected String areaName;
	/**
	 * 完成日期
	 */
	protected Date completeDate;
	/**
	 * 收货人
	 */
	protected String consignee;
	/**
	 * 优惠券折扣
	 */
	protected Float couponDiscount;
	/**
	 * 兑换积分
	 */
	protected Integer exchangePoint;
	/**
	 * 过期时间
	 */
	protected Date expire;
	/**
	 * 支付手续费
	 */
	protected Float fee;
	/**
	 * 运费
	 */
	protected Float freight;
	/**
	 * 发票
	 */
	protected String invoiceContent;
	/**
	 * 发票
	 */
	protected String invoiceTitle;
	/**
	 * 是否已分配库存
	 */
	protected Boolean isAllocatedStock;
	/**
	 * 是否已兑换积分
	 */
	protected Boolean isExchangePoint;
	/**
	 * 是否已使用优惠码
	 */
	protected Boolean isUseCouponCode;
	/**
	 * 附言
	 */
	protected String memo;
	/**
	 * 调整金额
	 */
	protected Float offsetAmount;
	/**
	 * 支付方式名称
	 */
	protected String paymentMethodName;
	/**
	 * 支付方式类型
	 */
	protected Integer paymentMethodType;
	/**
	 * 电话
	 */
	protected String phone;
	/**
	 * 价格
	 */
	protected Float price;
	/**
	 * 促销折扣
	 */
	protected Float promotionDiscount;
	/**
	 * 促销名称
	 */
	protected Blob promotionNames;
	/**
	 * 数量
	 */
	protected Integer quantity;
	/**
	 * 退款金额
	 */
	protected Float refundAmount;
	/**
	 * 已退货数量
	 */
	protected Integer returnedQuantity;
	/**
	 * 赠送积分
	 */
	protected Integer rewardPoint;
	/**
	 * 已发货数量
	 */
	protected Integer shippedQuantity;
	/**
	 * 配送方式名称
	 */
	protected String shippingMethodName;
	/**
	 * 编号
	 */
	protected String sn;
	/**
	 * 状态
	 */
	protected Integer status;
	/**
	 * 税金
	 */
	protected Float tax;
	/**
	 * 类型
	 */
	protected Integer type;
	/**
	 * 重量
	 */
	protected Integer weight;
	/**
	 * 邮编
	 */
	protected String zipCode;
	/**
	 * 地区
	 */
	protected Integer areaId;
	/**
	 * 优惠码
	 */
	protected Integer couponCodeId;
	/**
	 * 会员
	 */
	protected Integer memberId;
	/**
	 * 支付方式
	 */
	protected Integer paymentMethodId;
	/**
	 * 配送方式
	 */
	protected Integer shippingMethodId;
	/**
	 * 店铺
	 */
	protected Integer storeId;

	public Order() {
	}

	/**
	 * Get ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set ID
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Get 创建日期
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Set 创建日期
	 */
	public void setCreateDate(Date value) {
		this.createDate = value;
	}

	/**
	 * Get 最后修改日期
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * Set 最后修改日期
	 */
	public void setModifyDate(Date value) {
		this.modifyDate = value;
	}

	/**
	 * Get 地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Set 地址
	 */
	public void setAddress(String value) {
		this.address = value;
	}

	/**
	 * Get 订单金额
	 */
	public Float getAmount() {
		return amount;
	}

	/**
	 * Set 订单金额
	 */
	public void setAmount(Float value) {
		this.amount = value;
	}

	/**
	 * Get 已付金额
	 */
	public Float getAmountPaid() {
		return amountPaid;
	}

	/**
	 * Set 已付金额
	 */
	public void setAmountPaid(Float value) {
		this.amountPaid = value;
	}

	/**
	 * Get 地区名称
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * Set 地区名称
	 */
	public void setAreaName(String value) {
		this.areaName = value;
	}

	/**
	 * Get 完成日期
	 */
	public Date getCompleteDate() {
		return completeDate;
	}

	/**
	 * Set 完成日期
	 */
	public void setCompleteDate(Date value) {
		this.completeDate = value;
	}

	/**
	 * Get 收货人
	 */
	public String getConsignee() {
		return consignee;
	}

	/**
	 * Set 收货人
	 */
	public void setConsignee(String value) {
		this.consignee = value;
	}

	/**
	 * Get 优惠券折扣
	 */
	public Float getCouponDiscount() {
		return couponDiscount;
	}

	/**
	 * Set 优惠券折扣
	 */
	public void setCouponDiscount(Float value) {
		this.couponDiscount = value;
	}

	/**
	 * Get 兑换积分
	 */
	public Integer getExchangePoint() {
		return exchangePoint;
	}

	/**
	 * Set 兑换积分
	 */
	public void setExchangePoint(Integer value) {
		this.exchangePoint = value;
	}

	/**
	 * Get 过期时间
	 */
	public Date getExpire() {
		return expire;
	}

	/**
	 * Set 过期时间
	 */
	public void setExpire(Date value) {
		this.expire = value;
	}

	/**
	 * Get 支付手续费
	 */
	public Float getFee() {
		return fee;
	}

	/**
	 * Set 支付手续费
	 */
	public void setFee(Float value) {
		this.fee = value;
	}

	/**
	 * Get 运费
	 */
	public Float getFreight() {
		return freight;
	}

	/**
	 * Set 运费
	 */
	public void setFreight(Float value) {
		this.freight = value;
	}

	/**
	 * Get 发票
	 */
	public String getInvoiceContent() {
		return invoiceContent;
	}

	/**
	 * Set 发票
	 */
	public void setInvoiceContent(String value) {
		this.invoiceContent = value;
	}

	/**
	 * Get 发票
	 */
	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	/**
	 * Set 发票
	 */
	public void setInvoiceTitle(String value) {
		this.invoiceTitle = value;
	}

	/**
	 * Get 是否已分配库存
	 */
	public Boolean getIsAllocatedStock() {
		return isAllocatedStock;
	}

	/**
	 * Set 是否已分配库存
	 */
	public void setIsAllocatedStock(Boolean value) {
		this.isAllocatedStock = value;
	}

	/**
	 * Get 是否已兑换积分
	 */
	public Boolean getIsExchangePoint() {
		return isExchangePoint;
	}

	/**
	 * Set 是否已兑换积分
	 */
	public void setIsExchangePoint(Boolean value) {
		this.isExchangePoint = value;
	}

	/**
	 * Get 是否已使用优惠码
	 */
	public Boolean getIsUseCouponCode() {
		return isUseCouponCode;
	}

	/**
	 * Set 是否已使用优惠码
	 */
	public void setIsUseCouponCode(Boolean value) {
		this.isUseCouponCode = value;
	}

	/**
	 * Get 附言
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * Set 附言
	 */
	public void setMemo(String value) {
		this.memo = value;
	}

	/**
	 * Get 调整金额
	 */
	public Float getOffsetAmount() {
		return offsetAmount;
	}

	/**
	 * Set 调整金额
	 */
	public void setOffsetAmount(Float value) {
		this.offsetAmount = value;
	}

	/**
	 * Get 支付方式名称
	 */
	public String getPaymentMethodName() {
		return paymentMethodName;
	}

	/**
	 * Set 支付方式名称
	 */
	public void setPaymentMethodName(String value) {
		this.paymentMethodName = value;
	}

	/**
	 * Get 支付方式类型
	 */
	public Integer getPaymentMethodType() {
		return paymentMethodType;
	}

	/**
	 * Set 支付方式类型
	 */
	public void setPaymentMethodType(Integer value) {
		this.paymentMethodType = value;
	}

	/**
	 * Get 电话
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Set 电话
	 */
	public void setPhone(String value) {
		this.phone = value;
	}

	/**
	 * Get 价格
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * Set 价格
	 */
	public void setPrice(Float value) {
		this.price = value;
	}

	/**
	 * Get 促销折扣
	 */
	public Float getPromotionDiscount() {
		return promotionDiscount;
	}

	/**
	 * Set 促销折扣
	 */
	public void setPromotionDiscount(Float value) {
		this.promotionDiscount = value;
	}

	/**
	 * Get 促销名称
	 */
	public Blob getPromotionNames() {
		return promotionNames;
	}

	/**
	 * Set 促销名称
	 */
	public void setPromotionNames(Blob value) {
		this.promotionNames = value;
	}

	/**
	 * Get 数量
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * Set 数量
	 */
	public void setQuantity(Integer value) {
		this.quantity = value;
	}

	/**
	 * Get 退款金额
	 */
	public Float getRefundAmount() {
		return refundAmount;
	}

	/**
	 * Set 退款金额
	 */
	public void setRefundAmount(Float value) {
		this.refundAmount = value;
	}

	/**
	 * Get 已退货数量
	 */
	public Integer getReturnedQuantity() {
		return returnedQuantity;
	}

	/**
	 * Set 已退货数量
	 */
	public void setReturnedQuantity(Integer value) {
		this.returnedQuantity = value;
	}

	/**
	 * Get 赠送积分
	 */
	public Integer getRewardPoint() {
		return rewardPoint;
	}

	/**
	 * Set 赠送积分
	 */
	public void setRewardPoint(Integer value) {
		this.rewardPoint = value;
	}

	/**
	 * Get 已发货数量
	 */
	public Integer getShippedQuantity() {
		return shippedQuantity;
	}

	/**
	 * Set 已发货数量
	 */
	public void setShippedQuantity(Integer value) {
		this.shippedQuantity = value;
	}

	/**
	 * Get 配送方式名称
	 */
	public String getShippingMethodName() {
		return shippingMethodName;
	}

	/**
	 * Set 配送方式名称
	 */
	public void setShippingMethodName(String value) {
		this.shippingMethodName = value;
	}

	/**
	 * Get 编号
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * Set 编号
	 */
	public void setSn(String value) {
		this.sn = value;
	}

	/**
	 * Get 状态
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Set 状态
	 */
	public void setStatus(Integer value) {
		this.status = value;
	}

	/**
	 * Get 税金
	 */
	public Float getTax() {
		return tax;
	}

	/**
	 * Set 税金
	 */
	public void setTax(Float value) {
		this.tax = value;
	}

	/**
	 * Get 类型
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * Set 类型
	 */
	public void setType(Integer value) {
		this.type = value;
	}

	/**
	 * Get 重量
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * Set 重量
	 */
	public void setWeight(Integer value) {
		this.weight = value;
	}

	/**
	 * Get 邮编
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Set 邮编
	 */
	public void setZipCode(String value) {
		this.zipCode = value;
	}

	/**
	 * Get 地区
	 */
	public Integer getAreaId() {
		return areaId;
	}

	/**
	 * Set 地区
	 */
	public void setAreaId(Integer value) {
		this.areaId = value;
	}

	/**
	 * Get 优惠码
	 */
	public Integer getCouponCodeId() {
		return couponCodeId;
	}

	/**
	 * Set 优惠码
	 */
	public void setCouponCodeId(Integer value) {
		this.couponCodeId = value;
	}

	/**
	 * Get 会员
	 */
	public Integer getMemberId() {
		return memberId;
	}

	/**
	 * Set 会员
	 */
	public void setMemberId(Integer value) {
		this.memberId = value;
	}

	/**
	 * Get 支付方式
	 */
	public Integer getPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * Set 支付方式
	 */
	public void setPaymentMethodId(Integer value) {
		this.paymentMethodId = value;
	}

	/**
	 * Get 配送方式
	 */
	public Integer getShippingMethodId() {
		return shippingMethodId;
	}

	/**
	 * Set 配送方式
	 */
	public void setShippingMethodId(Integer value) {
		this.shippingMethodId = value;
	}

	/**
	 * Get 店铺
	 */
	public Integer getStoreId() {
		return storeId;
	}

	/**
	 * Set 店铺
	 */
	public void setStoreId(Integer value) {
		this.storeId = value;
	}

	public void reset() {
		id = 0;
		createDate = null;
		modifyDate = null;
		address = null;
		amount = (float) 0;
		amountPaid = (float) 0;
		areaName = null;
		completeDate = null;
		consignee = null;
		couponDiscount = (float) 0;
		exchangePoint = 0;
		expire = null;
		fee = (float) 0;
		freight = (float) 0;
		invoiceContent = null;
		invoiceTitle = null;
		isAllocatedStock = false;
		isExchangePoint = false;
		isUseCouponCode = false;
		memo = null;
		offsetAmount = (float) 0;
		paymentMethodName = null;
		paymentMethodType = 0;
		phone = null;
		price = (float) 0;
		promotionDiscount = (float) 0;
		((Order) promotionNames).reset();
		quantity = 0;
		refundAmount = (float) 0;
		returnedQuantity = 0;
		rewardPoint = 0;
		shippedQuantity = 0;
		shippingMethodName = null;
		sn = null;
		status = 0;
		tax = (float) 0;
		type = 0;
		weight = 0;
		zipCode = null;
		areaId = 0;
		couponCodeId = 0;
		memberId = 0;
		paymentMethodId = 0;
		shippingMethodId = 0;
		storeId = 0;
	}

	public void assignFrom(Order AObj) {
		if (AObj == null) {
			reset();
			return;
		}
		id = AObj.id;
		createDate = AObj.createDate;
		modifyDate = AObj.modifyDate;
		address = AObj.address;
		amount = AObj.amount;
		amountPaid = AObj.amountPaid;
		areaName = AObj.areaName;
		completeDate = AObj.completeDate;
		consignee = AObj.consignee;
		couponDiscount = AObj.couponDiscount;
		exchangePoint = AObj.exchangePoint;
		expire = AObj.expire;
		fee = AObj.fee;
		freight = AObj.freight;
		invoiceContent = AObj.invoiceContent;
		invoiceTitle = AObj.invoiceTitle;
		isAllocatedStock = AObj.isAllocatedStock;
		isExchangePoint = AObj.isExchangePoint;
		isUseCouponCode = AObj.isUseCouponCode;
		memo = AObj.memo;
		offsetAmount = AObj.offsetAmount;
		paymentMethodName = AObj.paymentMethodName;
		paymentMethodType = AObj.paymentMethodType;
		phone = AObj.phone;
		price = AObj.price;
		promotionDiscount = AObj.promotionDiscount;
		((Order) promotionNames).assignFrom((Order) AObj.promotionNames);
		quantity = AObj.quantity;
		refundAmount = AObj.refundAmount;
		returnedQuantity = AObj.returnedQuantity;
		rewardPoint = AObj.rewardPoint;
		shippedQuantity = AObj.shippedQuantity;
		shippingMethodName = AObj.shippingMethodName;
		sn = AObj.sn;
		status = AObj.status;
		tax = AObj.tax;
		type = AObj.type;
		weight = AObj.weight;
		zipCode = AObj.zipCode;
		areaId = AObj.areaId;
		couponCodeId = AObj.couponCodeId;
		memberId = AObj.memberId;
		paymentMethodId = AObj.paymentMethodId;
		shippingMethodId = AObj.shippingMethodId;
		storeId = AObj.storeId;
	}

}