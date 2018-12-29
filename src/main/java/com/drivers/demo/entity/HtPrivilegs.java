package com.drivers.demo.entity;

public class HtPrivilegs {
    private Integer pno;

    private String pname;

    private String purl;

    private Integer parentno;

    public Integer getPno() {
        return pno;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl == null ? null : purl.trim();
    }

    public Integer getParentno() {
        return parentno;
    }

    public void setParentno(Integer parentno) {
        this.parentno = parentno;
    }
}