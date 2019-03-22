package com.acat.service.impl;

import com.acat.dao.IBanzuDao;
import com.acat.model.Banzu;
import com.acat.service.IBanzuService;
import com.acat.vo.BanZuVo;
import com.acat.vo.LogoAndJigou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("banzuService")
public class IBanzuServiceImpl implements IBanzuService {

    @Autowired
    private IBanzuDao iBanzuDao;

    public void addBanzu(Banzu banzu){
        iBanzuDao.addBanzu(banzu);
    }

    public Integer getFenzuById(Integer id){
        return iBanzuDao.getFenzuById(id);
    }

    @Override
    public int delete(Integer banzu) {
        return iBanzuDao.delete(banzu);
    }

    @Override
    public Banzu getAllByFezu(Integer fenzu) {
        return iBanzuDao.getAllByFezu(fenzu);
    }

    @Override
    public BanZuVo getByFenzu(Integer fenzu) {
        return iBanzuDao.getByFenzu(fenzu);
    }

    public Banzu getBanzuByFenzu(Integer fenzu){
        return iBanzuDao.getBanzuByFenzu(fenzu);
    }

    @Override
    public LogoAndJigou get(Integer fenzu) {
        return iBanzuDao.get(fenzu);
    }
}
