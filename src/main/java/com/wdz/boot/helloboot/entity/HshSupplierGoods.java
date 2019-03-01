package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_supplier_goods")
public class HshSupplierGoods {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 店铺编号
     */
    @Column(name = "SUPPLIER_ID")
    private Long supplierId;

    /**
     * 商品名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 商品简介
     */
    @Column(name = "INFO")
    private String info;

    /**
     * 商品状态1上架0下架
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 商品图片
     */
    @Column(name = "IMGS")
    private String imgs;

    /**
     * 计划价格
     */
    @Column(name = "PLAN_PRICE")
    private Double planPrice;

    /**
     * 实际价格
     */
    @Column(name = "ACT_PRICE")
    private Double actPrice;

    /**
     * 库存
     */
    @Column(name = "LIBRARY_NUM")
    private Integer libraryNum;

    /**
     * 产地
     */
    @Column(name = "PRODUCT_AREA")
    private String productArea;

    /**
     * 生产日期
     */
    @Column(name = "PRODUCT_TIME")
    private Date productTime;

    /**
     * 排序
     */
    @Column(name = "PRIORITY")
    private Integer priority;

    /**
     * 保质期
     */
    @Column(name = "SHELF_LIFE")
    private String shelfLife;

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
     * 商品规格
     */
    @Column(name = "SPECIFICATIONS")
    private String specifications;

    /**
     * 商品类别
     */
    @Column(name = "TYPE_ID")
    private Long typeId;

    /**
     * 商品审核1通过0未通过2未审核
     */
    @Column(name = "AUDIT")
    private Integer audit;

    /**
     * 商品删除1保留0删除
     */
    @Column(name = "OCCULT")
    private Integer occult;

    /**
     * 商品推荐1推荐0不推荐
     */
    @Column(name = "RECOMMEND")
    private Integer recommend;

    /**
     * 单位
     */
    @Column(name = "UNIT")
    private String unit;

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
     * 获取商品名称
     *
     * @return NAME - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品简介
     *
     * @return INFO - 商品简介
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置商品简介
     *
     * @param info 商品简介
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取商品状态1上架0下架
     *
     * @return STATUS - 商品状态1上架0下架
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置商品状态1上架0下架
     *
     * @param status 商品状态1上架0下架
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取商品图片
     *
     * @return IMGS - 商品图片
     */
    public String getImgs() {
        return imgs;
    }

    /**
     * 设置商品图片
     *
     * @param imgs 商品图片
     */
    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    /**
     * 获取计划价格
     *
     * @return PLAN_PRICE - 计划价格
     */
    public Double getPlanPrice() {
        return planPrice;
    }

    /**
     * 设置计划价格
     *
     * @param planPrice 计划价格
     */
    public void setPlanPrice(Double planPrice) {
        this.planPrice = planPrice;
    }

    /**
     * 获取实际价格
     *
     * @return ACT_PRICE - 实际价格
     */
    public Double getActPrice() {
        return actPrice;
    }

    /**
     * 设置实际价格
     *
     * @param actPrice 实际价格
     */
    public void setActPrice(Double actPrice) {
        this.actPrice = actPrice;
    }

    /**
     * 获取库存
     *
     * @return LIBRARY_NUM - 库存
     */
    public Integer getLibraryNum() {
        return libraryNum;
    }

    /**
     * 设置库存
     *
     * @param libraryNum 库存
     */
    public void setLibraryNum(Integer libraryNum) {
        this.libraryNum = libraryNum;
    }

    /**
     * 获取产地
     *
     * @return PRODUCT_AREA - 产地
     */
    public String getProductArea() {
        return productArea;
    }

    /**
     * 设置产地
     *
     * @param productArea 产地
     */
    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    /**
     * 获取生产日期
     *
     * @return PRODUCT_TIME - 生产日期
     */
    public Date getProductTime() {
        return productTime;
    }

    /**
     * 设置生产日期
     *
     * @param productTime 生产日期
     */
    public void setProductTime(Date productTime) {
        this.productTime = productTime;
    }

    /**
     * 获取排序
     *
     * @return PRIORITY - 排序
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置排序
     *
     * @param priority 排序
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取保质期
     *
     * @return SHELF_LIFE - 保质期
     */
    public String getShelfLife() {
        return shelfLife;
    }

    /**
     * 设置保质期
     *
     * @param shelfLife 保质期
     */
    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
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
     * 获取商品规格
     *
     * @return SPECIFICATIONS - 商品规格
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * 设置商品规格
     *
     * @param specifications 商品规格
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    /**
     * 获取商品类别
     *
     * @return TYPE_ID - 商品类别
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置商品类别
     *
     * @param typeId 商品类别
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取商品审核1通过0未通过2未审核
     *
     * @return AUDIT - 商品审核1通过0未通过2未审核
     */
    public Integer getAudit() {
        return audit;
    }

    /**
     * 设置商品审核1通过0未通过2未审核
     *
     * @param audit 商品审核1通过0未通过2未审核
     */
    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    /**
     * 获取商品删除1保留0删除
     *
     * @return OCCULT - 商品删除1保留0删除
     */
    public Integer getOccult() {
        return occult;
    }

    /**
     * 设置商品删除1保留0删除
     *
     * @param occult 商品删除1保留0删除
     */
    public void setOccult(Integer occult) {
        this.occult = occult;
    }

    /**
     * 获取商品推荐1推荐0不推荐
     *
     * @return RECOMMEND - 商品推荐1推荐0不推荐
     */
    public Integer getRecommend() {
        return recommend;
    }

    /**
     * 设置商品推荐1推荐0不推荐
     *
     * @param recommend 商品推荐1推荐0不推荐
     */
    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    /**
     * 获取单位
     *
     * @return UNIT - 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位
     *
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
}