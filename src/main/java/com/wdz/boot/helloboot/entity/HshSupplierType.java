package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "hsh_supplier_type")
public class HshSupplierType {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 状态0不展示1展示
     */
    @Column(name = "STATUS")
    private Integer status;

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
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取状态0不展示1展示
     *
     * @return STATUS - 状态0不展示1展示
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态0不展示1展示
     *
     * @param status 状态0不展示1展示
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}