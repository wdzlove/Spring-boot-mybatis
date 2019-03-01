package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

public class Menu {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 父级编号
     */
    @Column(name = "PARENT_ID")
    private Long parentId;

    /**
     * 0不展示1展示
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 路径
     */
    @Column(name = "PAGE_URL")
    private String pageUrl;

    /**
     * 菜单等级
     */
    @Column(name = "LEVEL")
    private Integer level;

    /**
     * 菜单排序
     */
    @Column(name = "SORT")
    private Integer sort;

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
     * 获取菜单名称
     *
     * @return NAME - 菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名称
     *
     * @param name 菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父级编号
     *
     * @return PARENT_ID - 父级编号
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父级编号
     *
     * @param parentId 父级编号
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取0不展示1展示
     *
     * @return STATUS - 0不展示1展示
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0不展示1展示
     *
     * @param status 0不展示1展示
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取路径
     *
     * @return PAGE_URL - 路径
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**
     * 设置路径
     *
     * @param pageUrl 路径
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    /**
     * 获取菜单等级
     *
     * @return LEVEL - 菜单等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置菜单等级
     *
     * @param level 菜单等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取菜单排序
     *
     * @return SORT - 菜单排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置菜单排序
     *
     * @param sort 菜单排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}