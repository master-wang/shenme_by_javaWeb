package com.acat.service.impl;

import com.acat.dao.IRenyuanDao;
import com.acat.model.Renyuan;
import com.acat.service.IRenyuanService;
import com.acat.vo.RenyuanVo;
import com.acat.vo.RenyuanVo1;
import com.acat.vo.XingmingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("renyuanService")
public class IRenyuanServiceImpl implements IRenyuanService {
    @Autowired
    private IRenyuanDao iRenyuanDao;
    @Override
    public void addRenyuan(Renyuan renyuan) {
        iRenyuanDao.addRenyuan(renyuan);
    }

    @Override
    public void deleteRenyuanById(int id) {
        iRenyuanDao.deleteRenyuanById(id);
    }

    @Override
    public void updateRenyuanById(Renyuan renyuan) {
        iRenyuanDao.updateRenyuanById(renyuan);
    }

    @Override
    public Renyuan getRenyuanById(int id) {
        return iRenyuanDao.getRenyuanById(id);
    }

    @Override
    public List<RenyuanVo1> findRenyuanInfo(Integer fenzu) {
        return iRenyuanDao.findRenyuanInfo(fenzu);
    }

    @Override
    public List<XingmingVo> getXingmingByFezu(Integer fenzu) {
        return iRenyuanDao.getXingmingByFezu(fenzu);
    }

    @Override
    public List<RenyuanVo> findRenyuanVo(){
        return iRenyuanDao.findRenyuanVo();
    }
}
