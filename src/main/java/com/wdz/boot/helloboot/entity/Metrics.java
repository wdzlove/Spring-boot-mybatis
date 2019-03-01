package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

public class Metrics {
    @Column(name = "Variable_name")
    private String variableName;

    @Column(name = "Type")
    private String type;

    @Column(name = "Enabled")
    private String enabled;

    @Column(name = "Variable_value")
    private String variableValue;

    /**
     * @return Variable_name
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * @param variableName
     */
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    /**
     * @return Type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return Enabled
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * @return Variable_value
     */
    public String getVariableValue() {
        return variableValue;
    }

    /**
     * @param variableValue
     */
    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }
}