package com.acat.service.impl;

import com.acat.dao.HelihuajianyiDao;
import com.acat.model.Helihuajianyi;
import com.acat.service.HelihuajianyiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("helihuajianyi")
public class HelihuajianyiServiceIMpl implements HelihuajianyiService {
    @Autowired
    private HelihuajianyiDao helihuajianyiDao;
    @Override
    public void addHelihuajianyi(Helihuajianyi helihuajianyi) {
        helihuajianyiDao.addHelihuajianyi(helihuajianyi);
    }

    @Override
    public Helihuajianyi getHelihuajianyiById(Integer id) {
        return helihuajianyiDao.getHelihuajianyiById(id);
    }

    @Override
    public int updateHelihuajianyi(Helihuajianyi helihuajianyi) {
        return helihuajianyiDao.updateHelihuajianyi(helihuajianyi);
    }

    @Override
    public void deleteHelihuajianyi(Integer id) {
         helihuajianyiDao.deleteHelihuajianyi(id);
    }

    @Override
    public List<Helihuajianyi> getListByFenzu(Integer fenzu) {
        return helihuajianyiDao.getListByFenzu(fenzu);
    }
}
