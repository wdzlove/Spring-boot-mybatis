package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_supplier")
public class HshSupplier {
    /**
     * 主键
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 供货商名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 店铺剩余金额
     */
    @Column(name = "TOTAL_MONEY")
    private Double totalMoney;

    /**
     * 地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 联系人
     */
    @Column(name = "LINK_MAN")
    private String linkMan;

    /**
     * 电话
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 图片路径
     */
    @Column(name = "IMGS")
    private String imgs;

    /**
     * 供货商状态：1：展示 0：不展示
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 浏览次数
     */
    @Column(name = "BROWS_NUM")
    private Long browsNum;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "COLUMN_1")
    private String column1;

    @Column(name = "COLUMN_2")
    private Integer column2;

    @Column(name = "COLUMN_3")
    private Long column3;

    /**
     * 管理人编号
     */
    @Column(name = "USER_ID")
    private Long userId;

    /**
     * 类别编号
     */
    @Column(name = "TYPE_ID")
    private Long typeId;

    /**
     * 排序
     */
    @Column(name = "PRIORITY")
    private Integer priority;

    /**
     * 供应商审核1通过0未通过2未审核
     */
    @Column(name = "AUDIT")
    private Integer audit;

    /**
     * 返点
     */
    @Column(name = "REBATES")
    private Double rebates;

    /**
     * 临时供货商名称
     */
    @Column(name = "PATCH_NAME")
    private String patchName;

    /**
     * 临时地址
     */
    @Column(name = "PATCH_ADDRESS")
    private String patchAddress;

    /**
     * 临时图片路径
     */
    @Column(name = "PATCH_IMGS")
    private String patchImgs;

    /**
     * 简介
     */
    @Column(name = "INFO")
    private String info;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取供货商名称
     *
     * @return NAME - 供货商名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置供货商名称
     *
     * @param name 供货商名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取店铺剩余金额
     *
     * @return TOTAL_MONEY - 店铺剩余金额
     */
    public Double getTotalMoney() {
        return totalMoney;
    }

    /**
     * 设置店铺剩余金额
     *
     * @param totalMoney 店铺剩余金额
     */
    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * 获取地址
     *
     * @return ADDRESS - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取联系人
     *
     * @return LINK_MAN - 联系人
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * 设置联系人
     *
     * @param linkMan 联系人
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    /**
     * 获取电话
     *
     * @return MOBILE - 电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置电话
     *
     * @param mobile 电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取图片路径
     *
     * @return IMGS - 图片路径
     */
    public String getImgs() {
        return imgs;
    }

    /**
     * 设置图片路径
     *
     * @param imgs 图片路径
     */
    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    /**
     * 获取供货商状态：1：展示 0：不展示
     *
     * @return STATUS - 供货商状态：1：展示 0：不展示
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置供货商状态：1：展示 0：不展示
     *
     * @param status 供货商状态：1：展示 0：不展示
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取浏览次数
     *
     * @return BROWS_NUM - 浏览次数
     */
    public Long getBrowsNum() {
        return browsNum;
    }

    /**
     * 设置浏览次数
     *
     * @param browsNum 浏览次数
     */
    public void setBrowsNum(Long browsNum) {
        this.browsNum = browsNum;
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
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return COLUMN_1
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * @param column1
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * @return COLUMN_2
     */
    public Integer getColumn2() {
        return column2;
    }

    /**
     * @param column2
     */
    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    /**
     * @return COLUMN_3
     */
    public Long getColumn3() {
        return column3;
    }

    /**
     * @param column3
     */
    public void setColumn3(Long column3) {
        this.column3 = column3;
    }

    /**
     * 获取管理人编号
     *
     * @return USER_ID - 管理人编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置管理人编号
     *
     * @param userId 管理人编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取类别编号
     *
     * @return TYPE_ID - 类别编号
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置类别编号
     *
     * @param typeId 类别编号
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
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
     * 获取供应商审核1通过0未通过2未审核
     *
     * @return AUDIT - 供应商审核1通过0未通过2未审核
     */
    public Integer getAudit() {
        return audit;
    }

    /**
     * 设置供应商审核1通过0未通过2未审核
     *
     * @param audit 供应商审核1通过0未通过2未审核
     */
    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    /**
     * 获取返点
     *
     * @return REBATES - 返点
     */
    public Double getRebates() {
        return rebates;
    }

    /**
     * 设置返点
     *
     * @param rebates 返点
     */
    public void setRebates(Double rebates) {
        this.rebates = rebates;
    }

    /**
     * 获取临时供货商名称
     *
     * @return PATCH_NAME - 临时供货商名称
     */
    public String getPatchName() {
        return patchName;
    }

    /**
     * 设置临时供货商名称
     *
     * @param patchName 临时供货商名称
     */
    public void setPatchName(String patchName) {
        this.patchName = patchName;
    }

    /**
     * 获取临时地址
     *
     * @return PATCH_ADDRESS - 临时地址
     */
    public String getPatchAddress() {
        return patchAddress;
    }

    /**
     * 设置临时地址
     *
     * @param patchAddress 临时地址
     */
    public void setPatchAddress(String patchAddress) {
        this.patchAddress = patchAddress;
    }

    /**
     * 获取临时图片路径
     *
     * @return PATCH_IMGS - 临时图片路径
     */
    public String getPatchImgs() {
        return patchImgs;
    }

    /**
     * 设置临时图片路径
     *
     * @param patchImgs 临时图片路径
     */
    public void setPatchImgs(String patchImgs) {
        this.patchImgs = patchImgs;
    }

    /**
     * 获取简介
     *
     * @return INFO - 简介
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置简介
     *
     * @param info 简介
     */
    public void setInfo(String info) {
        this.info = info;
    }
}