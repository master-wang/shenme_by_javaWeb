package com.acat.model;

//import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;


public class Renyuan implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ID;
    private String gonghao;
    private String shenfenzheng;
    private String xingming;
    private String xingbie;
    private int nianling;
    private String dianhua;
    private int zhiwei;
    private String ruzhishijian;
    private String chezu;
    private int jibengongzi;
    private String xueli;
    private String minzu;
    private String zaizhi;
    private String beizhu;
    private int fenzu;

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public int getFenzu() {
        return fenzu;
    }

    public void setFenzu(int fenzu) {
        this.fenzu = fenzu;
    }
//    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public int getNianling() {
        return nianling;
    }

    public void setNianling(int nianling) {
        this.nianling = nianling;
    }

    public String getDianhua() {
        return dianhua;
    }

    public void setDianhua(String dianhua) {
        this.dianhua = dianhua;
    }

    public int getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(int zhiwei) {
        this.zhiwei = zhiwei;
    }

    public String getRuzhishijian() {
        return ruzhishijian;
    }

    public void setRuzhishijian(String ruzhishijian) {
        this.ruzhishijian = ruzhishijian;
    }

    public String getChezu() {
        return chezu;
    }

    public void setChezu(String chezu) {
        this.chezu = chezu;
    }

    public int getJibengongzi() {
        return jibengongzi;
    }

    public void setJibengongzi(int jibengongzi) {
        this.jibengongzi = jibengongzi;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    public String getZaizhi() {
        return zaizhi;
    }

    public void setZaizhi(String zaizhi) {
        this.zaizhi = zaizhi;
    }

    @Override
    public String toString() {
        return "Renyuan{" +
                "ID=" + ID +
                ", gonghao='" + gonghao + '\'' +
                ", shenfenzheng='" + shenfenzheng + '\'' +
                ", xingming='" + xingming + '\'' +
                ", xingbie='" + xingbie + '\'' +
                ", nianling=" + nianling +
                ", dianhua='" + dianhua + '\'' +
                ", zhiwei=" + zhiwei +
                ", ruzhishijian='" + ruzhishijian + '\'' +
                ", chezu='" + chezu + '\'' +
                ", jibengongzi=" + jibengongzi +
                ", xueli='" + xueli + '\'' +
                ", minzu='" + minzu + '\'' +
                ", zaizhi='" + zaizhi + '\'' +
                ", beizhu='" + beizhu + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }
}

