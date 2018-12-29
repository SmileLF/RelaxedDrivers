package com.drivers.demo.entity;

public class Procity {
    private String pccode;

    private String pcname;

    private String parentcode;

    private String pctype;

    public String getPccode() {
        return pccode;
    }

    public void setPccode(String pccode) {
        this.pccode = pccode == null ? null : pccode.trim();
    }

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname == null ? null : pcname.trim();
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode == null ? null : parentcode.trim();
    }

    public String getPctype() {
        return pctype;
    }

    public void setPctype(String pctype) {
        this.pctype = pctype == null ? null : pctype.trim();
    }
}