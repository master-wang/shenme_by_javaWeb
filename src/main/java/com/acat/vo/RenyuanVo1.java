package com.acat.vo;

import java.io.Serializable;

public class RenyuanVo1 implements Serializable {


    private Integer ID ;
    private String gonghao;
    private String xingming;
    private String xingbie;
    private String dianhua;
    private String ruzhishijian;
    private String beizhu;
    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "RenyuanVo1{" +
                "ID=" + ID +
                ", gonghao='" + gonghao + '\'' +
                ", xingming='" + xingming + '\'' +
                ", xingbie='" + xingbie + '\'' +
                ", dianhua='" + dianhua + '\'' +
                ", ruzhishijian='" + ruzhishijian + '\'' +
                ", beizhu='" + beizhu + '\'' +
                '}';
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

    public String getDianhua() {
        return dianhua;
    }

    public void setDianhua(String dianhua) {
        this.dianhua = dianhua;
    }

    public String getRuzhishijian() {
        return ruzhishijian;
    }

    public void setRuzhishijian(String ruzhishijian) {
        this.ruzhishijian = ruzhishijian;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
