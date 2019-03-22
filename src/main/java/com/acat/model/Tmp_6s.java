package com.acat.model;

import java.io.Serializable;

public class Tmp_6s implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ID;
    private String bumen;
    private String jianchashijian;
    private String jiancharenzhiwu;
    private String jiancharenxingming;
    private String jianchadidian;
    private String gaikuang;
    private String zerenren;

    public String getJianchadidian() {
        return jianchadidian;
    }

    public void setJianchadidian(String jianchadidian) {
        this.jianchadidian = jianchadidian;
    }

    private String chuliqingkuang;
    private String leixing;
    private String zhenggaishijian;
    private String zhonglei;
    private int fenzu;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public String getJianchashijian() {
        return jianchashijian;
    }

    public void setJianchashijian(String jianchashijian) {
        this.jianchashijian = jianchashijian;
    }

    public String getJiancharenzhiwu() {
        return jiancharenzhiwu;
    }

    public void setJiancharenzhiwu(String jiancharenzhiwu) {
        this.jiancharenzhiwu = jiancharenzhiwu;
    }

    public String getJiancharenxingming() {
        return jiancharenxingming;
    }

    public void setJiancharenxingming(String jiancharenxingming) {
        this.jiancharenxingming = jiancharenxingming;
    }



    public String getGaikuang() {
        return gaikuang;
    }

    public void setGaikuang(String gaikuang) {
        this.gaikuang = gaikuang;
    }

    public String getZerenren() {
        return zerenren;
    }

    public void setZerenren(String zerenren) {
        this.zerenren = zerenren;
    }

    public String getChuliqingkuang() {
        return chuliqingkuang;
    }

    public void setChuliqingkuang(String chuliqingkuang) {
        this.chuliqingkuang = chuliqingkuang;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getZhenggaishijian() {
        return zhenggaishijian;
    }

    public void setZhenggaishijian(String zhenggaishijian) {
        this.zhenggaishijian = zhenggaishijian;
    }

    public String getZhonglei() {
        return zhonglei;
    }

    public void setZhonglei(String zhonglei) {
        this.zhonglei = zhonglei;
    }

    public int getFenzu() {
        return fenzu;
    }

    public void setFenzu(int fenzu) {
        this.fenzu = fenzu;
    }
    public String toString(){
        return "Tmp_6s{" +
                "ID=" + ID +
                ", bumen='" + bumen + '\'' +
                ", jianchashijian='" + jianchashijian + '\'' +
                ", jiancharenzhiwu='" + jiancharenzhiwu + '\'' +
                ", jiancharenxingming='" + jiancharenxingming + '\'' +
                ", jiachadidian=" + jianchadidian +
                ", gaikuang='" + gaikuang + '\'' +
                ", zerenren=" + zerenren +
                ", chuliqingkuang='" + chuliqingkuang + '\'' +
                ", leixing='" + leixing + '\'' +
                ", zhenggaishijian=" + zhenggaishijian +
                ", zhonglei='" + zhonglei + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }

}
