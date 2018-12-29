package com.drivers.demo.entity;

public class Documenttype {
    private Integer documentnoint;

    private String documentname;

    public Integer getDocumentnoint() {
        return documentnoint;
    }

    public void setDocumentnoint(Integer documentnoint) {
        this.documentnoint = documentnoint;
    }

    public String getDocumentname() {
        return documentname;
    }

    public void setDocumentname(String documentname) {
        this.documentname = documentname == null ? null : documentname.trim();
    }
}