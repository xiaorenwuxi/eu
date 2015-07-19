package com.youxuan.eu.model;

public class Sysevent {
    private Integer sysevent_id;

    private String uname;

    private String action;

    private Integer create_time;

    private String ip;

   

    public Integer getSysevent_id() {
		return sysevent_id;
	}

	public void setSysevent_id(Integer sysevent_id) {
		this.sysevent_id = sysevent_id;
	}

	public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

   
    public Integer getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Integer create_time) {
		this.create_time = create_time;
	}

	public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}