package com.acat.vo;

import java.io.Serializable;

public class BanhuiVo implements Serializable {
    private Integer id;
    private String zhuti;
    private String shijichuqinrenshu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhuti() {
        return zhuti;
    }

    public void setZhuti(String zhuti) {
        this.zhuti = zhuti;
    }

    public String getShijichuqinrenshu() {
        return shijichuqinrenshu;
    }

    public void setShijichuqinrenshu(String shijichuqinrenshu) {
        this.shijichuqinrenshu = shijichuqinrenshu;
    }

    @Override
    public String toString() {
        return "BanhuiVo{" +
                "id=" + id +
                ", zhuti='" + zhuti + '\'' +
                ", shijichuqinrenshu='" + shijichuqinrenshu + '\'' +
                '}';
    }
}
