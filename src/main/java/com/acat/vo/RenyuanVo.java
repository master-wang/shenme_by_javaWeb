package com.acat.vo;


import java.io.Serializable;

public class RenyuanVo implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer ID ;
    private String gonghao;
    private String xingming;
    private String xingbie;
    private String beizhu;

    @Override
    public String toString() {
        return "RenyuanVo{" +
                "ID=" + ID +
                ", gonghao='" + gonghao + '\'' +
                ", xingming='" + xingming + '\'' +
                ", xingbie='" + xingbie + '\'' +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }

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

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
