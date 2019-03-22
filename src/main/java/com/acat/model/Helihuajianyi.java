package com.acat.model;

import java.io.Serializable;

public class Helihuajianyi implements Serializable {
    private Integer id;
    private String leixing;
    private String neirong;
    private String gaishanfangan;
    private String beizhu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeixing() {
        return leixing;
    }

    @Override
    public String toString() {
        return "Helihuajianyi{" +
                "id=" + id +
                ", leixing='" + leixing + '\'' +
                ", neirong='" + neirong + '\'' +
                ", gaishanfangan='" + gaishanfangan + '\'' +
                ", beizhu='" + beizhu + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public String getGaishanfangan() {
        return gaishanfangan;
    }

    public void setGaishanfangan(String gaishanfangan) {
        this.gaishanfangan = gaishanfangan;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    private Integer fenzu;


}
