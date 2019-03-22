package com.acat.controller;


import com.acat.model.Jifen;
import com.acat.service.IJifenService;
import com.acat.util.DateUtils;
import com.acat.util.OperatorTian;
import com.acat.util.RiqiUtil;
import com.acat.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
@RestController
@RequestMapping("/jifen")
public class JifenController {

    @Autowired
    private IJifenService jifenService;

    @PostMapping("/add")
    public void addJifen(@RequestBody AddJifenVo addJifenVo) {
//        System.out.println("------------------------------------");
//        System.out.println(addJifenVo.getJifenleixing());
//        System.out.println(addJifenVo.getRiqi());
//        System.out.println(addJifenVo.getList());
//        System.out.println(addJifenVo.getList().get(0));
//        System.out.println(addJifenVo.getList().get(1));

        Jifen jifen = new Jifen();
        jifen.setJifenleixing(addJifenVo.getJifenleixing());
        jifen.setRiqi(addJifenVo.getRiqi());

        int size = addJifenVo.getList().size();

        System.out.println("size=" + size);

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                jifen.setXingming(addJifenVo.getList().get(i));
                jifen.setJifen(Integer.parseInt(addJifenVo.getList().get(i + 1)));
                jifenService.addJifen(jifen);
            }
        }
    }

    @PostMapping("/huizong")
    public List<HuizongJifen> huizongjifen(@RequestBody JifenleixingAndFenzuVo fenzu) {
        return jifenService.huizongJifen(fenzu);
    }

    @PostMapping("/get")
    public Map<String,List<Jifen>> jifenVoList(@RequestBody JifenleixingAndFenzuVo type) {

        System.out.println("------------------------------------");
        System.out.println(type);
        System.out.println(type.getFenzu());
        Integer fenzu=type.getFenzu();
        System.out.println("-----------------------------------------");
        Map<String,List<Jifen>> map = new LinkedHashMap<>();
        List<Jifen> list = null;
        String riqi02 = null;

        String xingming = jifenService.getXingming(type.getFenzu());



        XingmingAndLeixingVo vo = new XingmingAndLeixingVo();
        vo.setJifenleixing(type.getJifenleixing());
        vo.setXingming(xingming);
        String riqi = jifenService.getRiqi(vo);

//        System.out.println("--------");
//        System.out.println(riqi);
//        System.out.println("--------");

        String[] str = RiqiUtil.fenge(riqi);
        int tianshu = DateUtils.getMonthLastDay(Integer.parseInt(str[0]), Integer.parseInt(str[1]));

//        System.out.println("************");
//        System.out.println(tianshu);
//        System.out.println("************");

        int dangqiantianshu = OperatorTian.getTianshu(str[2]);
//
//        System.out.println("%%%%%%%%%%");
//        System.out.println(dangqiantianshu);
//        System.out.println("%%%%%%%%%%");

        String tempStr = str[0] + "-" + str[1];
        JifenleixingAndStrVo vo2 = new JifenleixingAndStrVo();
        vo2.setJifenleixing(type.getJifenleixing());
        vo2.setStr(tempStr);
        List<String> stringList = jifenService.getRiqiMohuchaxun(vo2);

//        System.out.println("#######");
//        System.out.println(stringList);
//        System.out.println("#######");

        JIfenleixingAndRiqiVo vo1 = new JIfenleixingAndRiqiVo();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(fenzu);
        vo1.setFenzu(fenzu);
        if(dangqiantianshu <= tianshu){
            for(int i=1;i<=dangqiantianshu;i++){
                if(i<=9) {
                    String tian = "0" + String.valueOf(i);
//                    System.out.println(tian);
                    riqi02 = str[0] + "-" + str[1] + "-" + tian;
//                    System.out.println(riqi02);
                    if (stringList.contains(riqi02)) {
                        System.out.println("包含该日期");
                        System.out.println(riqi02);
                        vo1.setJifenleixing(type.getJifenleixing());
                        vo1.setRiqi(riqi02);
//                        vo1.setFenzu(type.getFenzu());
                        System.out.println(type.getFenzu());
                        System.out.println("------------------------------------");
                        System.out.println(type);
                        System.out.println(type.getJifenleixing());
                        System.out.println(fenzu);
                        System.out.println("-----------------------------------------");
                        list = jifenService.getXinxiByLeixingAndRiqi(vo1);
                        System.out.println("list-----------------------------------"+list);
                        System.out.println(list);
                        System.out.println("1@@@@@@");
                        map.put(riqi02,list);
                        System.out.println(map.size());
                        System.out.println("2@@@@@@");

//                        bigList.add(list);
//                        System.out.println(bigList.size());
                    }
                }else {
                    riqi02 = str[0] + "-" + str[1] + "-" + String.valueOf(i);
                    if(stringList.contains(riqi02)){
//                        System.out.println(riqi02);
                        vo1.setJifenleixing(type.getJifenleixing());
                        vo1.setRiqi(riqi02);
                        list = jifenService.getXinxiByLeixingAndRiqi(vo1);
                        map.put(riqi02,list);
                    }
                }
            }
        }

        //System.out.println(map);
        return map;

//        if (dangqiantianshu <= tianshu) {
//
//            System.out.println("1。。。。。。。");
//            for (int i = 1; i <= dangqiantianshu; i++) {
//                System.out.println("2。。。。。。。");
//                if (i <= 9) {
//                    System.out.println("3。。。。。。。");
//                    System.out.println(i);
//                    String tian = "0" + String.valueOf(i);
//                    System.out.println(tian);
//                    riqi02 = str[0] + "-" + str[1] + "-" + tian;
//                    System.out.println(riqi02);
//                    if (stringList.contains(riqi02)) {
//                        System.out.println("1^^^^");
//                        System.out.println(riqi02);
//                        System.out.println("^^^^");
//
//                        JIfenleixingAndRiqiVo vo1 = new JIfenleixingAndRiqiVo();
//                        vo1.setJifenleixing(type.getJifenleixing());
//                        vo1.setRiqi(riqi02);
//                        list = jifenService.getXinxiByLeixingAndRiqi(vo1);
//                        System.out.println(list);
//                    } else {
//                        i++;
//                    }
//
//                } else {
//                    riqi02 = str[0] + "-" + str[1] + "-" + String.valueOf(i);
//                    if (stringList.contains(riqi02)) {
//                        System.out.println("2^^^^");
//                        System.out.println(riqi02);
//                        System.out.println("^^^^");
//
//                        JIfenleixingAndRiqiVo vo1 = new JIfenleixingAndRiqiVo();
//                        vo1.setJifenleixing(type.getJifenleixing());
//                        vo1.setRiqi(riqi02);
//                        list = jifenService.getXinxiByLeixingAndRiqi(vo1);
//                        System.out.println(list);
//                    }
//                }
//                bigList.add(list);
//            }
//        }

    }
}
