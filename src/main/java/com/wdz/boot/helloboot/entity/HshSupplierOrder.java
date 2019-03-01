package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_supplier_order")
public class HshSupplierOrder {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单号
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 购买人
     */
    @Column(name = "USER_ID")
    private Long userId;

    /**
     * 店铺编号
     */
    @Column(name = "SUPPLIER_ID")
    private Long supplierId;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 支付状态1未支付,2已支付
     */
    @Column(name = "PAY_STATUS")
    private Integer payStatus;

    /**
     * 订单状态：1：未接单2：已接单 3 已发货 4 已完成 5：取消订单，6：已取消 7：商家驳回
     */
    @Column(name = "ORDER_STATUS")
    private Integer orderStatus;

    /**
     * 支付类型1:微信 2：余额3：积分4：余额+积分5：支付宝
     */
    @Column(name = "PAY_TYPE")
    private Integer payType;

    /**
     * 支付时间
     */
    @Column(name = "PAY_TIME")
    private Date payTime;

    /**
     * 订单金额
     */
    @Column(name = "ORDER_MONEY")
    private Double orderMoney;

    /**
     * 积分
     */
    @Column(name = "INTEGRAL")
    private Double integral;

    /**
     * 完成时间
     */
    @Column(name = "FINISH_TIME")
    private Date finishTime;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 备用1
     */
    @Column(name = "COLUMN_1")
    private String column1;

    /**
     * 备用2
     */
    @Column(name = "COLUMN_2")
    private Integer column2;

    /**
     * 备用3
     */
    @Column(name = "COLUMN_3")
    private Long column3;

    /**
     * 议价金额
     */
    @Column(name = "HAGGLE_PRICE")
    private Double hagglePrice;

    /**
     * 确认接订单时间
     */
    @Column(name = "CONFIRM_TIME")
    private Date confirmTime;

    /**
     * 第三方交易流水号
     */
    @Column(name = "TRADE_NO")
    private String tradeNo;

    /**
     * 地址编号
     */
    @Column(name = "ADDRESS_ID")
    private Long addressId;

    @Column(name = "PARENT_ID")
    private Long parentId;

    /**
     * 实际支付
     */
    @Column(name = "ACT_PAYMENT")
    private Double actPayment;

    /**
     * 平台收费
     */
    @Column(name = "PLATFORM_REVENUE")
    private Double platformRevenue;

    /**
     * 购买人姓名
     */
    @Column(name = "BUY_USER_NAME")
    private String buyUserName;

    /**
     * 购买地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 购买电话
     */
    @Column(name = "BUY_USER_PHONE")
    private String buyUserPhone;

    /**
     * 购物券信息
     */
    @Column(name = "COUPONID")
    private String couponid;

    /**
     * 配送方式0为自提，1为商家配送
     */
    @Column(name = "DELIVERY")
    private Integer delivery;

    /**
     * 自提时间
     */
    @Column(name = "DELIVERY_TIME")
    private Date deliveryTime;

    /**
     * 余额
     */
    private Double balance;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单号
     *
     * @return ORDER_NO - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取购买人
     *
     * @return USER_ID - 购买人
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置购买人
     *
     * @param userId 购买人
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取店铺编号
     *
     * @return SUPPLIER_ID - 店铺编号
     */
    public Long getSupplierId() {
        return supplierId;
    }

    /**
     * 设置店铺编号
     *
     * @param supplierId 店铺编号
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付状态1未支付,2已支付
     *
     * @return PAY_STATUS - 支付状态1未支付,2已支付
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 设置支付状态1未支付,2已支付
     *
     * @param payStatus 支付状态1未支付,2已支付
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取订单状态：1：未接单2：已接单 3 已发货 4 已完成 5：取消订单，6：已取消 7：商家驳回
     *
     * @return ORDER_STATUS - 订单状态：1：未接单2：已接单 3 已发货 4 已完成 5：取消订单，6：已取消 7：商家驳回
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态：1：未接单2：已接单 3 已发货 4 已完成 5：取消订单，6：已取消 7：商家驳回
     *
     * @param orderStatus 订单状态：1：未接单2：已接单 3 已发货 4 已完成 5：取消订单，6：已取消 7：商家驳回
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取支付类型1:微信 2：余额3：积分4：余额+积分5：支付宝
     *
     * @return PAY_TYPE - 支付类型1:微信 2：余额3：积分4：余额+积分5：支付宝
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付类型1:微信 2：余额3：积分4：余额+积分5：支付宝
     *
     * @param payType 支付类型1:微信 2：余额3：积分4：余额+积分5：支付宝
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取支付时间
     *
     * @return PAY_TIME - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取订单金额
     *
     * @return ORDER_MONEY - 订单金额
     */
    public Double getOrderMoney() {
        return orderMoney;
    }

    /**
     * 设置订单金额
     *
     * @param orderMoney 订单金额
     */
    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    /**
     * 获取积分
     *
     * @return INTEGRAL - 积分
     */
    public Double getIntegral() {
        return integral;
    }

    /**
     * 设置积分
     *
     * @param integral 积分
     */
    public void setIntegral(Double integral) {
        this.integral = integral;
    }

    /**
     * 获取完成时间
     *
     * @return FINISH_TIME - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取备用1
     *
     * @return COLUMN_1 - 备用1
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * 设置备用1
     *
     * @param column1 备用1
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * 获取备用2
     *
     * @return COLUMN_2 - 备用2
     */
    public Integer getColumn2() {
        return column2;
    }

    /**
     * 设置备用2
     *
     * @param column2 备用2
     */
    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    /**
     * 获取备用3
     *
     * @return COLUMN_3 - 备用3
     */
    public Long getColumn3() {
        return column3;
    }

    /**
     * 设置备用3
     *
     * @param column3 备用3
     */
    public void setColumn3(Long column3) {
        this.column3 = column3;
    }

    /**
     * 获取议价金额
     *
     * @return HAGGLE_PRICE - 议价金额
     */
    public Double getHagglePrice() {
        return hagglePrice;
    }

    /**
     * 设置议价金额
     *
     * @param hagglePrice 议价金额
     */
    public void setHagglePrice(Double hagglePrice) {
        this.hagglePrice = hagglePrice;
    }

    /**
     * 获取确认接订单时间
     *
     * @return CONFIRM_TIME - 确认接订单时间
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * 设置确认接订单时间
     *
     * @param confirmTime 确认接订单时间
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * 获取第三方交易流水号
     *
     * @return TRADE_NO - 第三方交易流水号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置第三方交易流水号
     *
     * @param tradeNo 第三方交易流水号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取地址编号
     *
     * @return ADDRESS_ID - 地址编号
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * 设置地址编号
     *
     * @param addressId 地址编号
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * @return PARENT_ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取实际支付
     *
     * @return ACT_PAYMENT - 实际支付
     */
    public Double getActPayment() {
        return actPayment;
    }

    /**
     * 设置实际支付
     *
     * @param actPayment 实际支付
     */
    public void setActPayment(Double actPayment) {
        this.actPayment = actPayment;
    }

    /**
     * 获取平台收费
     *
     * @return PLATFORM_REVENUE - 平台收费
     */
    public Double getPlatformRevenue() {
        return platformRevenue;
    }

    /**
     * 设置平台收费
     *
     * @param platformRevenue 平台收费
     */
    public void setPlatformRevenue(Double platformRevenue) {
        this.platformRevenue = platformRevenue;
    }

    /**
     * 获取购买人姓名
     *
     * @return BUY_USER_NAME - 购买人姓名
     */
    public String getBuyUserName() {
        return buyUserName;
    }

    /**
     * 设置购买人姓名
     *
     * @param buyUserName 购买人姓名
     */
    public void setBuyUserName(String buyUserName) {
        this.buyUserName = buyUserName;
    }

    /**
     * 获取购买地址
     *
     * @return ADDRESS - 购买地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置购买地址
     *
     * @param address 购买地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取购买电话
     *
     * @return BUY_USER_PHONE - 购买电话
     */
    public String getBuyUserPhone() {
        return buyUserPhone;
    }

    /**
     * 设置购买电话
     *
     * @param buyUserPhone 购买电话
     */
    public void setBuyUserPhone(String buyUserPhone) {
        this.buyUserPhone = buyUserPhone;
    }

    /**
     * 获取购物券信息
     *
     * @return COUPONID - 购物券信息
     */
    public String getCouponid() {
        return couponid;
    }

    /**
     * 设置购物券信息
     *
     * @param couponid 购物券信息
     */
    public void setCouponid(String couponid) {
        this.couponid = couponid;
    }

    /**
     * 获取配送方式0为自提，1为商家配送
     *
     * @return DELIVERY - 配送方式0为自提，1为商家配送
     */
    public Integer getDelivery() {
        return delivery;
    }

    /**
     * 设置配送方式0为自提，1为商家配送
     *
     * @param delivery 配送方式0为自提，1为商家配送
     */
    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    /**
     * 获取自提时间
     *
     * @return DELIVERY_TIME - 自提时间
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置自提时间
     *
     * @param deliveryTime 自提时间
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }
}