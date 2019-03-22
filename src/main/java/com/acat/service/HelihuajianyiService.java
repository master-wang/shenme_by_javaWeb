package com.acat.service;

import com.acat.model.Helihuajianyi;

import java.util.List;

public interface HelihuajianyiService {

    /**
     *
     * @param helihuajianyi
     */
    void addHelihuajianyi(Helihuajianyi helihuajianyi);

    /**
     *
     * @param id
     * @return
     */

    Helihuajianyi getHelihuajianyiById(Integer id);

    /**
     *
     * @param helihuajianyi
     * @return
     */
    int updateHelihuajianyi(Helihuajianyi helihuajianyi);

    /**
     * 通过ID
     * @param id
     */
    void deleteHelihuajianyi(Integer id);



    /**
     *
     * @param fenzu
     * @return
     */
    List<Helihuajianyi> getListByFenzu(Integer fenzu);
}
