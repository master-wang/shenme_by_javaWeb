package com.acat.controller;

import com.acat.model.Anquanzuoye;
import com.acat.model.Xuexiziliao;
import com.acat.service.IXuexiziliaoService;
import com.acat.util.StringUtil;
import com.acat.util.WordToHtml;
import com.acat.vo.FenzuAndLeibieVo;
import com.acat.vo.XuexiziliaoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.ws.rs.POST;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/xuexiziliao")
@SuppressWarnings("all")
public class XuexiziliaoController {

    @Autowired
    private IXuexiziliaoService xuexiziliaoService;

    Xuexiziliao xuexiziliao = new Xuexiziliao();

    @PostMapping("/addPutongziduan")
    public void addPutongziduan(@RequestBody XuexiziliaoVo xuexiziliaoVo){
        xuexiziliao.setFabushijian(xuexiziliaoVo.getFabushijian());
        xuexiziliao.setFaburen(xuexiziliaoVo.getFaburen());
        xuexiziliao.setFenzu(xuexiziliaoVo.getFenzu());
        xuexiziliao.setLeibie(xuexiziliaoVo.getLeibie());
    }

    @PostMapping("/updatePutongziduan")
    public void updatePutongziduan(@RequestBody XuexiziliaoVo xuexiziliaoVo){
        xuexiziliao.setFabushijian(xuexiziliaoVo.getFabushijian());
        xuexiziliao.setFaburen(xuexiziliaoVo.getFaburen());
        xuexiziliao.setFenzu(xuexiziliaoVo.getFenzu());
        xuexiziliao.setLeibie(xuexiziliaoVo.getLeibie());
        xuexiziliao.setId(xuexiziliaoVo.getId());
    }

    @PostMapping("/addWenjian")
    public void addWenjian(MultipartFile file, HttpSession session){
        String path = session.getServletContext().getRealPath("/xuexiziliao");
        System.out.println(path);

        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        try{
            file.transferTo(targetFile);
        }catch (IOException e){
            e.printStackTrace();
        }

        xuexiziliao.setWenjianmingcheng(fileName);
        System.out.println("------------");
        xuexiziliaoService.addXuexiziliao(xuexiziliao);
    }

    @PostMapping("/updateWenjian")
    public void updateWenjian(MultipartFile file, HttpSession session){
        String path = session.getServletContext().getRealPath("/xuexiziliao");
        System.out.println(path);

        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        try{
            file.transferTo(targetFile);
        }catch (IOException e){
            e.printStackTrace();
        }

        xuexiziliao.setWenjianmingcheng(fileName);
        System.out.println("------------");
        xuexiziliaoService.updateXuexiziliao(xuexiziliao);
    }

    @GetMapping("/deleteXuexiziliao/{id}")
    public void deleteXuexiziliao(@PathVariable("id") Integer id){
        xuexiziliaoService.deleteXuexiziliao(id);
    }

    @GetMapping("/getXuexiziliao/{id}")
    public Xuexiziliao getXuexiziliao(@PathVariable("id") Integer id){
        Xuexiziliao xuexiziliao = xuexiziliaoService.getXuexiziliaoById(id);
        return xuexiziliao;
    }

    @PostMapping("/listAll")
    public List<Xuexiziliao> listAll(){
        List<Xuexiziliao> list = xuexiziliaoService.listAll();
        return list;
    }

    @GetMapping("/getXuexziliaoByLeibie/{leibie}")
    public List<Xuexiziliao> getXuexziliaoByLeibie(@PathVariable("leibie") String leibie){
        List<Xuexiziliao> list = xuexiziliaoService.getXuexizuiliaoByLeibie(leibie);
        return list;
    }

    @GetMapping("/getXuexziliaoByFenzu/{fenzu}")
    public List<Xuexiziliao> getXuexziliaoByFenzu(@PathVariable("fenzu") Integer fenzu){
        List<Xuexiziliao> list = xuexiziliaoService.getXuexizuiliaoByFenzu(fenzu);
        return list;
    }

    @GetMapping(value="/getWenjianToHtmlById/{id}")
    public List<String> getWenjianToHtmlById(@PathVariable("id") Integer id,HttpSession session) throws Exception{



        String path = session.getServletContext().getRealPath("/xuexiziliao/");

        List<String> list = new ArrayList<>();


        Xuexiziliao xuexiziliao = xuexiziliaoService.getXuexiziliaoById(id);

        String wenjianName = StringUtil.qiegeqianmian(xuexiziliao.getWenjianmingcheng());

        WordToHtml.Word2003ToHtml(path,path,xuexiziliao.getWenjianmingcheng(),wenjianName+".html");

        list.add(xuexiziliao.getFabushijian());
        list.add(xuexiziliao.getLeibie());
        list.add("xuexiziliao/"+xuexiziliao.getWenjianmingcheng());
        list.add("xuexiziliao/"+wenjianName+".html");
        return list;
    }

    @PostMapping(value="/getXuexiziliaoByVo")
    public List<Xuexiziliao> getXuexiziliaoByVo(@RequestBody FenzuAndLeibieVo fenzuAndLeibieVo){
        List<Xuexiziliao> list = xuexiziliaoService.getXuexiziliaoByVo(fenzuAndLeibieVo);
        return list;
    }
}
