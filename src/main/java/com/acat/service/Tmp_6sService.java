package com.acat.service;
import com.acat.model.Tmp_6s;
import com.acat.vo.FenzuAndZhonglei;
import com.acat.vo.Tmp_6sVo;
import java.util.List;

public interface Tmp_6sService {
    //添加Tmp—6s
    void addTmp_6s(Tmp_6s tmp_6s);
    //删除Tmp—6s
    void deleteTmp_6sById(int ID);
    //修改Tmp-6s
    void updateTmp_6sById(Tmp_6s tmp_6s);
    //查询Tmp—6s所有信息
    //因为查询所有属性所以我没有建立一个VO类
    List<Tmp_6s> findTmp_6s(Integer fenzu);
    //根据ID查询
    Tmp_6s findTmp_6sById(Integer id);
    List<Tmp_6s> getAllByFenzuAndZhonglei(FenzuAndZhonglei fenzuAndZhonglei);

}
