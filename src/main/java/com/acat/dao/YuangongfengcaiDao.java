package com.acat.dao;

import com.acat.model.Yuangongfengcai;

import java.util.List;

public interface YuangongfengcaiDao {
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
    List<Yuangongfengcai>  getAll(Integer fenzu);
}
