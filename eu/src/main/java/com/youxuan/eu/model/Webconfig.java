package com.youxuan.eu.model;

public class Webconfig {
    private Integer webconfigId;

    private String varname;

    private String varvalue;

    public Integer getWebconfigId() {
        return webconfigId;
    }

    public void setWebconfigId(Integer webconfigId) {
        this.webconfigId = webconfigId;
    }

    public String getVarname() {
        return varname;
    }

    public void setVarname(String varname) {
        this.varname = varname == null ? null : varname.trim();
    }

    public String getVarvalue() {
        return varvalue;
    }

    public void setVarvalue(String varvalue) {
        this.varvalue = varvalue == null ? null : varvalue.trim();
    }
}