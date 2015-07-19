package com.youxuan.eu.model;

public class HouseWithBLOBs extends House {
    private String picarr;

    private String content;

    public String getPicarr() {
        return picarr;
    }

    public void setPicarr(String picarr) {
        this.picarr = picarr == null ? null : picarr.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}