package com.deybian.as3app;

public class modelopuerta {
    private String titu, des;
    private int imgpuerta;

    public modelopuerta() {
    }

    public modelopuerta(String titu, String des, int imgpuerta) {
        this.titu = titu;
        this.des = des;
        this.imgpuerta = imgpuerta;
    }

    public String getTitu() {
        return titu;
    }

    public void setTitu(String titu) {
        this.titu = titu;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getImgpuerta() {
        return imgpuerta;
    }

    public void setImgpuerta(int imgpuerta) {
        this.imgpuerta = imgpuerta;
    }
}
