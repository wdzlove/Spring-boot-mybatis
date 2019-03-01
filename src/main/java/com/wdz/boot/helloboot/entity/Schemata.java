package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

public class Schemata {
    @Column(name = "CATALOG_NAME")
    private String catalogName;

    @Column(name = "SCHEMA_NAME")
    private String schemaName;

    @Column(name = "DEFAULT_CHARACTER_SET_NAME")
    private String defaultCharacterSetName;

    @Column(name = "DEFAULT_COLLATION_NAME")
    private String defaultCollationName;

    @Column(name = "SQL_PATH")
    private String sqlPath;

    /**
     * @return CATALOG_NAME
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * @param catalogName
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * @return SCHEMA_NAME
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * @param schemaName
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * @return DEFAULT_CHARACTER_SET_NAME
     */
    public String getDefaultCharacterSetName() {
        return defaultCharacterSetName;
    }

    /**
     * @param defaultCharacterSetName
     */
    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    /**
     * @return DEFAULT_COLLATION_NAME
     */
    public String getDefaultCollationName() {
        return defaultCollationName;
    }

    /**
     * @param defaultCollationName
     */
    public void setDefaultCollationName(String defaultCollationName) {
        this.defaultCollationName = defaultCollationName;
    }

    /**
     * @return SQL_PATH
     */
    public String getSqlPath() {
        return sqlPath;
    }

    /**
     * @param sqlPath
     */
    public void setSqlPath(String sqlPath) {
        this.sqlPath = sqlPath;
    }
}