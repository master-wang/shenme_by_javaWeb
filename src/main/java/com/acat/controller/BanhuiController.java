package com.acat.controller;

import com.acat.model.Banhui;
import com.acat.service.BanhuiService;
import com.acat.vo.BanhuiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/banhui")
public class BanhuiController {
    @Autowired
    private BanhuiService banhuiService;
    @PostMapping("/add")
    public  void add(@RequestBody Banhui banhui){
        banhuiService.addBanhui(banhui);
    }
    @GetMapping("/get/{id}")
    public Banhui getBanzuById(@PathVariable("id") Integer id){
        return banhuiService.getBanhuiById(id);
    }
    @PostMapping("/update")
    public Integer update(@RequestBody Banhui banhui){

        System.out.println("banhui--------------------------------"+banhui);
      return banhuiService.updateBanhui(banhui);
    }
    @GetMapping("/delete/{id}")
    public void updateBanhuiById(@PathVariable("id") Integer id){
        System.out.println("------------"+id);

        banhuiService.deleteBanhui(id);
    }
    @GetMapping("/listAll/{fenzu}")
    public @ResponseBody  List<BanhuiVo> listAll(@PathVariable("fenzu") Integer fenzu){
//        System.out.println(banhuiService.getAll(fenzu));
        return banhuiService.getAll(fenzu);
    }

    @GetMapping("/getList/{fenzu}")
    public List<Banhui> getList(@PathVariable("fenzu") Integer fenzu){
        List<Banhui> list = banhuiService.getListByFenzu(fenzu);
        return list;
    }
}
