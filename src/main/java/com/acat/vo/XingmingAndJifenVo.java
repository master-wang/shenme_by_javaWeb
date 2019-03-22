package com.acat.vo;

import java.io.Serializable;

public class XingmingAndJifenVo implements Serializable {
    private String xingming;
    private Integer jifen;

    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

}
