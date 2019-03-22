package com.acat.vo;

import java.io.Serializable;
import java.util.List;

public class RiqiAndJifenVo implements Serializable {
    private String riqi;
    private List<Integer> list;

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "RiqiAndJifenVo{" +
                "riqi='" + riqi + '\'' +
                ", list=" + list +
                '}';
    }
}
