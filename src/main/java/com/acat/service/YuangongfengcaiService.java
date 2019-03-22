package com.acat.service;

import com.acat.model.Yuangongfengcai;
import com.acat.vo.YuangongfengcaiVo;

import java.util.List;

public interface YuangongfengcaiService {
    /**
     * 添加
     * @param yuangongfengcai
     */
    void add(Yuangongfengcai yuangongfengcai);

    /**
     * 删除
     * @param fenzu
     * @return
     */
    int delete(Integer fenzu);

    /**
     *
     * @param fenzu
     * @return
     */
    List<Yuangongfengcai> getAll(Integer fenzu);
}
