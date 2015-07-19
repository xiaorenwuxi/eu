package com.youxuan.eu.model;

public class Partner_type {
    private Integer partnertypeId;

    private String title;

    private Integer createTime;

    public Integer getPartnertypeId() {
        return partnertypeId;
    }

    public void setPartnertypeId(Integer partnertypeId) {
        this.partnertypeId = partnertypeId;
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