package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_station")
public class HshStation {
    /**
     * 店铺ID
     */
    @Column(name = "station_id")
    private Long stationId;

    /**
     * 店铺名称
     */
    private String name;

    /**
     * 主打特色
     */
    private String featurs;

    /**
     * 人气
     */
    private Integer popularity;

    /**
     * 人均
     */
    @Column(name = "pre_avg")
    private Integer preAvg;

    /**
     * 地址
     */
    private String address;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 0 下线，1 上线
     */
    @Column(name = "is_del")
    private Byte isDel;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 下架时间
     */
    @Column(name = "offline_time")
    private Date offlineTime;

    /**
     * 上架时间
     */
    @Column(name = "online_time")
    private Date onlineTime;

    /**
     * 店铺头像
     */
    @Column(name = "station_img")
    private String stationImg;

    /**
     * 店铺营业执照
     */
    @Column(name = "station_license")
    private String stationLicense;

    /**
     * 食品资质证书
     */
    @Column(name = "station_quality")
    private String stationQuality;

    /**
     * 保留字段 联系方式
     */
    @Column(name = "cus_num_one")
    private String cusNumOne;

    /**
     * 保留字段
     */
    @Column(name = "cus_num_two")
    private String cusNumTwo;

    /**
     * 获取店铺ID
     *
     * @return station_id - 店铺ID
     */
    public Long getStationId() {
        return stationId;
    }

    /**
     * 设置店铺ID
     *
     * @param stationId 店铺ID
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    /**
     * 获取店铺名称
     *
     * @return name - 店铺名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置店铺名称
     *
     * @param name 店铺名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取主打特色
     *
     * @return featurs - 主打特色
     */
    public String getFeaturs() {
        return featurs;
    }

    /**
     * 设置主打特色
     *
     * @param featurs 主打特色
     */
    public void setFeaturs(String featurs) {
        this.featurs = featurs;
    }

    /**
     * 获取人气
     *
     * @return popularity - 人气
     */
    public Integer getPopularity() {
        return popularity;
    }

    /**
     * 设置人气
     *
     * @param popularity 人气
     */
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    /**
     * 获取人均
     *
     * @return pre_avg - 人均
     */
    public Integer getPreAvg() {
        return preAvg;
    }

    /**
     * 设置人均
     *
     * @param preAvg 人均
     */
    public void setPreAvg(Integer preAvg) {
        this.preAvg = preAvg;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
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
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取0 下线，1 上线
     *
     * @return is_del - 0 下线，1 上线
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置0 下线，1 上线
     *
     * @param isDel 0 下线，1 上线
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取下架时间
     *
     * @return offline_time - 下架时间
     */
    public Date getOfflineTime() {
        return offlineTime;
    }

    /**
     * 设置下架时间
     *
     * @param offlineTime 下架时间
     */
    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    /**
     * 获取上架时间
     *
     * @return online_time - 上架时间
     */
    public Date getOnlineTime() {
        return onlineTime;
    }

    /**
     * 设置上架时间
     *
     * @param onlineTime 上架时间
     */
    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    /**
     * 获取店铺头像
     *
     * @return station_img - 店铺头像
     */
    public String getStationImg() {
        return stationImg;
    }

    /**
     * 设置店铺头像
     *
     * @param stationImg 店铺头像
     */
    public void setStationImg(String stationImg) {
        this.stationImg = stationImg;
    }

    /**
     * 获取店铺营业执照
     *
     * @return station_license - 店铺营业执照
     */
    public String getStationLicense() {
        return stationLicense;
    }

    /**
     * 设置店铺营业执照
     *
     * @param stationLicense 店铺营业执照
     */
    public void setStationLicense(String stationLicense) {
        this.stationLicense = stationLicense;
    }

    /**
     * 获取食品资质证书
     *
     * @return station_quality - 食品资质证书
     */
    public String getStationQuality() {
        return stationQuality;
    }

    /**
     * 设置食品资质证书
     *
     * @param stationQuality 食品资质证书
     */
    public void setStationQuality(String stationQuality) {
        this.stationQuality = stationQuality;
    }

    /**
     * 获取保留字段 联系方式
     *
     * @return cus_num_one - 保留字段 联系方式
     */
    public String getCusNumOne() {
        return cusNumOne;
    }

    /**
     * 设置保留字段 联系方式
     *
     * @param cusNumOne 保留字段 联系方式
     */
    public void setCusNumOne(String cusNumOne) {
        this.cusNumOne = cusNumOne;
    }

    /**
     * 获取保留字段
     *
     * @return cus_num_two - 保留字段
     */
    public String getCusNumTwo() {
        return cusNumTwo;
    }

    /**
     * 设置保留字段
     *
     * @param cusNumTwo 保留字段
     */
    public void setCusNumTwo(String cusNumTwo) {
        this.cusNumTwo = cusNumTwo;
    }
}