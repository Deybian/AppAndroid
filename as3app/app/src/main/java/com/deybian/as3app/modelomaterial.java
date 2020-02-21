package com.deybian.as3app;

public class modelomaterial {

    String nommaterial,desmaterial;
    int  precciomaterial;

    public modelomaterial(String nommaterial, String desmaterial, int precciomaterial) {
        this.nommaterial = nommaterial;
        this.desmaterial = desmaterial;
        this.precciomaterial = precciomaterial;
    }

    public String getNommaterial() {
        return nommaterial;
    }

    public void setNommaterial(String nommaterial) {
        this.nommaterial = nommaterial;
    }

    public String getDesmaterial() {
        return desmaterial;
    }

    public void setDesmaterial(String desmaterial) {
        this.desmaterial = desmaterial;
    }

    public int getPrecciomaterial() {
        return precciomaterial;
    }

    public void setPrecciomaterial(int precciomaterial) {
        this.precciomaterial = precciomaterial;
    }
}
