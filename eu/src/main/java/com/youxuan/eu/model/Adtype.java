package com.youxuan.eu.model;

public class Adtype {
    private Integer adtypeId;

    private String title;

    private Integer width;

    private Integer height;

    private Integer checkinfo;

    public Integer getAdtypeId() {
        return adtypeId;
    }

    public void setAdtypeId(Integer adtypeId) {
        this.adtypeId = adtypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getCheckinfo() {
        return checkinfo;
    }

    public void setCheckinfo(Integer checkinfo) {
        this.checkinfo = checkinfo;
    }
}