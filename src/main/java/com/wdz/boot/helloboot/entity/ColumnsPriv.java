package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "columns_priv")
public class ColumnsPriv {
    @Column(name = "Host")
    private String host;

    @Column(name = "Db")
    private String db;

    @Column(name = "User")
    private String user;

    @Column(name = "Table_name")
    private String tableName;

    @Column(name = "Column_name")
    private String columnName;

    @Column(name = "Timestamp")
    private Date timestamp;

    @Column(name = "Column_priv")
    private String columnPriv;

    /**
     * @return Host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return Db
     */
    public String getDb() {
        return db;
    }

    /**
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * @return User
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return Table_name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return Column_name
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return Timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return Column_priv
     */
    public String getColumnPriv() {
        return columnPriv;
    }

    /**
     * @param columnPriv
     */
    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv;
    }
}