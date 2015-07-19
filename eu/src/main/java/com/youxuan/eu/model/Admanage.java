package com.youxuan.eu.model;

public class Admanage {
    private Integer admanageId;

    private Integer adtypeId;

    private String title;

    private String admode;

    private String picurl;

    private String linkurl;

    private Integer createTime;

    private Integer checkinfo;

    private String adtext;

    public Integer getAdmanageId() {
        return admanageId;
    }

    public void setAdmanageId(Integer admanageId) {
        this.admanageId = admanageId;
    }

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

    public String getAdmode() {
        return admode;
    }

    public void setAdmode(String admode) {
        this.admode = admode == null ? null : admode.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl == null ? null : linkurl.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getCheckinfo() {
        return checkinfo;
    }

    public void setCheckinfo(Integer checkinfo) {
        this.checkinfo = checkinfo;
    }

    public String getAdtext() {
        return adtext;
    }

    public void setAdtext(String adtext) {
        this.adtext = adtext == null ? null : adtext.trim();
    }
}