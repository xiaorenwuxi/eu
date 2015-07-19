package com.youxuan.eu.model;

public class House_group {
    private Integer houseGroupId;

    private String groupName;

    private Integer createTime;

    public Integer getHouseGroupId() {
        return houseGroupId;
    }

    public void setHouseGroupId(Integer houseGroupId) {
        this.houseGroupId = houseGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}