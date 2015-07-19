package com.youxuan.eu.model;

public class Admin_group {
    private Integer adminGroupId;

    private String groupname;

    private Integer checkinfo;

    private String description;

    public Integer getAdminGroupId() {
        return adminGroupId;
    }

    public void setAdminGroupId(Integer adminGroupId) {
        this.adminGroupId = adminGroupId;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Integer getCheckinfo() {
        return checkinfo;
    }

    public void setCheckinfo(Integer checkinfo) {
        this.checkinfo = checkinfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}