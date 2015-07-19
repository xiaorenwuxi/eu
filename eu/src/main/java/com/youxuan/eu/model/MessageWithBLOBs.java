package com.youxuan.eu.model;

public class MessageWithBLOBs extends Message {
    private String content;

    private String recont;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRecont() {
        return recont;
    }

    public void setRecont(String recont) {
        this.recont = recont == null ? null : recont.trim();
    }
}