package com.youxuan.eu.model;

public class Message {
    private Integer messageId;

    private String nickname;

    private String contact;

    private Short htop;

    private Short rtop;

    private String ip;

    private Integer retime;

    private Integer checkinfo;

    private Integer createTime;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Short getHtop() {
        return htop;
    }

    public void setHtop(Short htop) {
        this.htop = htop;
    }

    public Short getRtop() {
        return rtop;
    }

    public void setRtop(Short rtop) {
        this.rtop = rtop;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getRetime() {
        return retime;
    }

    public void setRetime(Integer retime) {
        this.retime = retime;
    }

    public Integer getCheckinfo() {
        return checkinfo;
    }

    public void setCheckinfo(Integer checkinfo) {
        this.checkinfo = checkinfo;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}