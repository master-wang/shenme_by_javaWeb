package com.acat.service;

import com.acat.model.Banhui;
import com.acat.vo.BanhuiVo;

import java.util.List;

public interface BanhuiService {

    /**
     * 添加班会
     * @param banhui
     */
    void addBanhui(Banhui banhui);

    /**
     *
     * @param id
     * @return
     */
    /**
     * 通过ID 拿到本次会议信息
     * @param id
     * @return
     */
    Banhui getBanhuiById(Integer id);

    /**
     * 更新班会信息
     * @param banhui
     * @return
     */
    int updateBanhui(Banhui banhui);

    /**
     * 通过ID 删除班会
     * @param id
     */
    void deleteBanhui(Integer id);
    /**
     *
     * @return
     */
    List<BanhuiVo> getAll(Integer fenzu);
    /**
     *
     * @param fenzu
     * @return
     */
    List<Banhui> getListByFenzu(int fenzu);

}
