package com.youxuan.eu.model;

public class Agency_type {
    private Integer agencyTypeId;

    private String name;

    private Integer createTime;

    public Integer getAgencyTypeId() {
        return agencyTypeId;
    }

    public void setAgencyTypeId(Integer agencyTypeId) {
        this.agencyTypeId = agencyTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}