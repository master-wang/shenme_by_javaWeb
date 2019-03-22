package com.acat.controller;

import com.acat.model.Helihuajianyi;
import com.acat.service.HelihuajianyiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heli")
public class HelihuajianyiController {
    @Autowired
    private HelihuajianyiService helihuajianyiService;

    @PostMapping("/add")
    public void add(@RequestBody Helihuajianyi helihuajianyi) {
        helihuajianyiService.addHelihuajianyi(helihuajianyi);
    }
    @GetMapping("/get/{id}")
    public Helihuajianyi getBanzuById(@PathVariable("id") Integer id){
        return helihuajianyiService.getHelihuajianyiById(id);
    }
    @PostMapping("/update")
    public Integer update(@RequestBody Helihuajianyi helihuajianyi){

        System.out.println("heli--------------------------------"+helihuajianyi);
        return helihuajianyiService.updateHelihuajianyi(helihuajianyi);
    }
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        System.out.println("------------"+id);

        helihuajianyiService.deleteHelihuajianyi(id);
    }

    @GetMapping("/getList/{fenzu}")
    public List<Helihuajianyi> getList(@PathVariable("fenzu") Integer fenzu){
        System.out.println(fenzu);
        List<Helihuajianyi> list = helihuajianyiService.getListByFenzu(fenzu);
        System.out.println(list);
        return list;
    }

}
