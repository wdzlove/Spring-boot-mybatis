package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "sys_role_menu")
public class SysRoleMenu {
    /**
     * 角色编号
     */
    @Column(name = "ROLE_ID")
    private Long roleId;

    /**
     * 菜单编号
     */
    @Column(name = "MENU_ID")
    private Long menuId;

    @Column(name = "CHILDS")
    private String childs;

    /**
     * 获取角色编号
     *
     * @return ROLE_ID - 角色编号
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色编号
     *
     * @param roleId 角色编号
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取菜单编号
     *
     * @return MENU_ID - 菜单编号
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单编号
     *
     * @param menuId 菜单编号
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * @return CHILDS
     */
    public String getChilds() {
        return childs;
    }

    /**
     * @param childs
     */
    public void setChilds(String childs) {
        this.childs = childs;
    }
}