package com.youxuan.eu.model;

public class Failedlogin {
    private Integer failedloginId;

    private String uname;

    private String ip;

    private Integer time;

    private Short count;

    private Short isadmin;

    public Integer getFailedloginId() {
        return failedloginId;
    }

    public void setFailedloginId(Integer failedloginId) {
        this.failedloginId = failedloginId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Short getCount() {
        return count;
    }

    public void setCount(Short count) {
        this.count = count;
    }

    public Short getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Short isadmin) {
        this.isadmin = isadmin;
    }
}