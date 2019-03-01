package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_activity_banner")
public class HshActivityBanner {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 广告标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 广告简介
     */
    @Column(name = "INFO")
    private String info;

    /**
     * 图片路径
     */
    @Column(name = "IMGS")
    private String imgs;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 状态1展示0不展示
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 链接
     */
    @Column(name = "LINK")
    private String link;

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
     * 获取广告标题
     *
     * @return TITLE - 广告标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置广告标题
     *
     * @param title 广告标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取广告简介
     *
     * @return INFO - 广告简介
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置广告简介
     *
     * @param info 广告简介
     */
    public void setInfo(String info) {
        this.info = info;
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
     * 获取排序
     *
     * @return SORT - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取状态1展示0不展示
     *
     * @return STATUS - 状态1展示0不展示
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态1展示0不展示
     *
     * @param status 状态1展示0不展示
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取链接
     *
     * @return LINK - 链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置链接
     *
     * @param link 链接
     */
    public void setLink(String link) {
        this.link = link;
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
}