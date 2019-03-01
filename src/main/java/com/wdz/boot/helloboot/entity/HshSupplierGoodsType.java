package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "hsh_supplier_goods_type")
public class HshSupplierGoodsType {
    /**
     * 主键
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类别名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 父级编号
     */
    @Column(name = "PARENT_ID")
    private Long parentId;

    /**
     * 0隐藏1展示
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 层级深度
     */
    @Column(name = "HIERARCHY")
    private Integer hierarchy;

    /**
     * 优先级
     */
    @Column(name = "PRIORITY")
    private Integer priority;

    /**
     * 备用
     */
    @Column(name = "COLUMN_1")
    private String column1;

    /**
     * 备用
     */
    @Column(name = "COLUMN_2")
    private Integer column2;

    /**
     * 备用
     */
    @Column(name = "COLUMN_3")
    private Long column3;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取类别名称
     *
     * @return NAME - 类别名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类别名称
     *
     * @param name 类别名称
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
     * 获取0隐藏1展示
     *
     * @return STATUS - 0隐藏1展示
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0隐藏1展示
     *
     * @param status 0隐藏1展示
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取层级深度
     *
     * @return HIERARCHY - 层级深度
     */
    public Integer getHierarchy() {
        return hierarchy;
    }

    /**
     * 设置层级深度
     *
     * @param hierarchy 层级深度
     */
    public void setHierarchy(Integer hierarchy) {
        this.hierarchy = hierarchy;
    }

    /**
     * 获取优先级
     *
     * @return PRIORITY - 优先级
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置优先级
     *
     * @param priority 优先级
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取备用
     *
     * @return COLUMN_1 - 备用
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * 设置备用
     *
     * @param column1 备用
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * 获取备用
     *
     * @return COLUMN_2 - 备用
     */
    public Integer getColumn2() {
        return column2;
    }

    /**
     * 设置备用
     *
     * @param column2 备用
     */
    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    /**
     * 获取备用
     *
     * @return COLUMN_3 - 备用
     */
    public Long getColumn3() {
        return column3;
    }

    /**
     * 设置备用
     *
     * @param column3 备用
     */
    public void setColumn3(Long column3) {
        this.column3 = column3;
    }
}