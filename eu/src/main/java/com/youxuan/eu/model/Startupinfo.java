package com.youxuan.eu.model;

public class Startupinfo {
    private Integer startupinfoId;

    private Integer partnertypeId;

    private Integer userId;

    private Integer areaId;

    private Integer provinceId;

    private Integer cityId;

    private String title;

    private String picurl;

    private Integer tdnumber;

    private String prodirection;

    private Integer prophase;

    private Integer valuationTime;

    private Float valuationValue;

    private Integer investment;

    private Float investmentValue;

    private Integer createTime;

    private String attribute76;
    private String tdconcept;

    private String proinfo;

    public String getTdconcept() {
        return tdconcept;
    }

    public void setTdconcept(String tdconcept) {
        this.tdconcept = tdconcept == null ? null : tdconcept.trim();
    }

    public String getProinfo() {
        return proinfo;
    }

    public void setProinfo(String proinfo) {
        this.proinfo = proinfo == null ? null : proinfo.trim();
    }

    public Integer getStartupinfoId() {
        return startupinfoId;
    }

    public void setStartupinfoId(Integer startupinfoId) {
        this.startupinfoId = startupinfoId;
    }

    public Integer getPartnertypeId() {
        return partnertypeId;
    }

    public void setPartnertypeId(Integer partnertypeId) {
        this.partnertypeId = partnertypeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public Integer getTdnumber() {
        return tdnumber;
    }

    public void setTdnumber(Integer tdnumber) {
        this.tdnumber = tdnumber;
    }

    public String getProdirection() {
        return prodirection;
    }

    public void setProdirection(String prodirection) {
        this.prodirection = prodirection == null ? null : prodirection.trim();
    }

    public Integer getProphase() {
        return prophase;
    }

    public void setProphase(Integer prophase) {
        this.prophase = prophase;
    }

    public Integer getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(Integer valuationTime) {
        this.valuationTime = valuationTime;
    }

    public Float getValuationValue() {
        return valuationValue;
    }

    public void setValuationValue(Float valuationValue) {
        this.valuationValue = valuationValue;
    }

    public Integer getInvestment() {
        return investment;
    }

    public void setInvestment(Integer investment) {
        this.investment = investment;
    }

    public Float getInvestmentValue() {
        return investmentValue;
    }

    public void setInvestmentValue(Float investmentValue) {
        this.investmentValue = investmentValue;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getAttribute76() {
        return attribute76;
    }

    public void setAttribute76(String attribute76) {
        this.attribute76 = attribute76 == null ? null : attribute76.trim();
    }
}