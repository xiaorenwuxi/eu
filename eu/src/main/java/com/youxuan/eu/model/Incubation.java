package com.youxuan.eu.model;

public class Incubation {
    private Integer incubationId;

    private Integer userId;

    private Integer areaId;

    private Integer cityId;

    private Integer incubationTypeId;

    private Integer incubationGroupId;

    private Integer provinceId;

    private String title;

    private String shiyong;

    private String acreage;

    private String price;

    private String telphone;

    private String contact;

    private Integer createTime;

    public Integer getIncubationId() {
        return incubationId;
    }

    public void setIncubationId(Integer incubationId) {
        this.incubationId = incubationId;
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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getIncubationTypeId() {
        return incubationTypeId;
    }

    public void setIncubationTypeId(Integer incubationTypeId) {
        this.incubationTypeId = incubationTypeId;
    }

    public Integer getIncubationGroupId() {
        return incubationGroupId;
    }

    public void setIncubationGroupId(Integer incubationGroupId) {
        this.incubationGroupId = incubationGroupId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getShiyong() {
        return shiyong;
    }

    public void setShiyong(String shiyong) {
        this.shiyong = shiyong == null ? null : shiyong.trim();
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage == null ? null : acreage.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}