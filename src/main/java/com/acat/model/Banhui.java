package com.acat.model;

import java.io.Serializable;

public class Banhui implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer shijichuqinrenshu;
    private Integer qingjia;
    private Integer tiaoxiu;
    private String beizhu;
    private String banqian;
    private String banzhong;
    private String banhou;
    private String zhuti;
    private String yingchuqinrenshu;
    private Integer fenzu;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShijichuqinrenshu() {
        return shijichuqinrenshu;
    }

    public void setShijichuqinrenshu(Integer shijichuqinrenshu) {
        this.shijichuqinrenshu = shijichuqinrenshu;
    }

    public Integer getQingjia() {
        return qingjia;
    }

    public void setQingjia(Integer qingjia) {
        this.qingjia = qingjia;
    }

    public Integer getTiaoxiu() {
        return tiaoxiu;
    }

    public void setTiaoxiu(Integer tiaoxiu) {
        this.tiaoxiu = tiaoxiu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getBanqian() {
        return banqian;
    }

    public void setBanqian(String banqian) {
        this.banqian = banqian;
    }

    public String getBanzhong() {
        return banzhong;
    }

    public void setBanzhong(String banzhong) {
        this.banzhong = banzhong;
    }

    public String getBanhou() {
        return banhou;
    }

    public void setBanhou(String banhou) {
        this.banhou = banhou;
    }

    public String getZhuti() {
        return zhuti;
    }

    public void setZhuti(String zhuti) {
        this.zhuti = zhuti;
    }

    public String getYingchuqinrenshu() {
        return yingchuqinrenshu;
    }

    public void setYingchuqinrenshu(String yingchuqinrenshu) {
        this.yingchuqinrenshu = yingchuqinrenshu;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    @Override
    public String toString() {
        return "Banhui{" +
                "id=" + id +
                ", shijichuqinrenshu=" + shijichuqinrenshu +
                ", qingjia=" + qingjia +
                ", tiaoxiu=" + tiaoxiu +
                ", beizhu='" + beizhu + '\'' +
                ", banqian='" + banqian + '\'' +
                ", banzhong='" + banzhong + '\'' +
                ", banhou='" + banhou + '\'' +
                ", zhuti='" + zhuti + '\'' +
                ", yingchuqinrenshu='" + yingchuqinrenshu + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }
}
