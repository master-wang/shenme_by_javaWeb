package com.acat.vo;

import java.io.Serializable;
import java.util.List;

public class NameAndTimeAndScore implements Serializable {
    private String xingming;
    private List<RiqiAndJifenVo> list;

    public List<RiqiAndJifenVo> getList() {
        return list;
    }

    public void setList(List<RiqiAndJifenVo> list) {
        this.list = list;
    }






    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }
}
