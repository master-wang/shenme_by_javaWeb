package com.acat.service.impl;

import com.acat.dao.YuangongfengcaiDao;
import com.acat.model.Yuangongfengcai;
import com.acat.service.YuangongfengcaiService;
import com.acat.vo.YuangongfengcaiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("yuangongfengcaiService")
public class YuangongfengcaiServiceImpl implements YuangongfengcaiService {
    @Autowired
    private YuangongfengcaiDao yuangongfengcaiDao;
    @Override
    public void add(Yuangongfengcai yuangongfengcai) {
      yuangongfengcaiDao.add(yuangongfengcai);
    }

    @Override
    public int delete(Integer fenzu) {
        return yuangongfengcaiDao.delete(fenzu);
    }

    @Override
    public List<Yuangongfengcai> getAll(Integer fenzu) {
        return yuangongfengcaiDao.getAll(fenzu);
    }
}
