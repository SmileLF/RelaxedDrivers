package com.drivers.demo.entity;

public class Subjects {
    private Integer subno;

    private String subname;

    public Integer getSubno() {
        return subno;
    }

    public void setSubno(Integer subno) {
        this.subno = subno;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname == null ? null : subname.trim();
    }
}