package com.youxuan.eu.model;

public class Incubation_type {
    private Integer incubationTypeId;

    private String title;

    private Integer createTime;

    public Integer getIncubationTypeId() {
        return incubationTypeId;
    }

    public void setIncubationTypeId(Integer incubationTypeId) {
        this.incubationTypeId = incubationTypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}