package com.acat.service.impl;

import com.acat.dao.BanhuiDao;
import com.acat.model.Banhui;
import com.acat.service.BanhuiService;
import com.acat.vo.BanhuiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("banhuiService")
public class BanhuiServiceImpl  implements BanhuiService {
    @Autowired
    private BanhuiDao banhuiDao;

    @Override
    public Banhui getBanhuiById(Integer id) {
        return banhuiDao.getBanhuiById(id);
    }

    @Override
    public int updateBanhui(Banhui banhui) {
        return banhuiDao.updateBanhui(banhui);
    }

    @Override
    public void deleteBanhui(Integer id) {
        banhuiDao.deleteBanhui(id);

    }

    @Override
    public List<BanhuiVo> getAll(Integer fenzu) {
        return banhuiDao.getAll(fenzu);
    }

    @Override
    public void addBanhui(Banhui banhui) {
         banhuiDao.addBanhui(banhui);
    }

    /**
     *
     * @param fenzu
     * @return
     */
    public List<Banhui> getListByFenzu(int fenzu){
        return banhuiDao.getListByFenzu(fenzu);
    }
}
