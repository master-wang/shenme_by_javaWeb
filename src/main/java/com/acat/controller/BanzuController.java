package com.acat.controller;

import com.acat.model.Banzu;
import com.acat.model.Yuangongfengcai;
import com.acat.service.IBanzuService;

import com.acat.service.YuangongfengcaiService;
import com.acat.vo.BanZuVo;

import com.acat.vo.LogoAndJigou;
import com.acat.vo.YuangongfengcaiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/banzu")
public class BanzuController {

    @Autowired
    private IBanzuService iBanzuService;
    private Banzu banzu = new Banzu();
    @Autowired
     private YuangongfengcaiService yuangongfengcaiService;
      @PostMapping("/addBanzu")
    public void addBanzu(@RequestBody BanZuVo banZuVo) {
        System.out.println(banZuVo);
        banzu.setBiaoti(banZuVo.getBiaoti());
        banzu.setFenzu(banZuVo.getFenzu());
        banzu.setBanzujianjie(banZuVo.getBanzujianjie());
        banzu.setLogoshiyi(banZuVo.getLogoshiyi());
//        return banZuVo;
    }

    @GetMapping("/get/{fenzu}")
    public BanZuVo get(@PathVariable("fenzu") Integer fenzu) {
        return iBanzuService.getByFenzu(fenzu);
    }

    @PostMapping("/add")
    public void add(MultipartFile[] file, HttpSession session) {
//        int count = 1;
        System.out.println("file length===="+file.length);

        int delete = iBanzuService.delete(banzu.getFenzu());
         yuangongfengcaiService.delete(banzu.getFenzu());
        System.out.println(delete);
        String path = session.getServletContext().getRealPath("/picture");
        System.out.println("path======" + path);
        String[] filename = new String[file.length];
        for (int i = 0; i < filename.length; i++) {
            filename[i] = file[i].getOriginalFilename();
        }
        System.out.println("filename==========" + filename);

        File[] files=new File[filename.length];
        for (int i=0;i<files.length;i++){
              files[i]=new File(path,filename[i]);
            if (!files[i].exists()){
                files[i].mkdirs();
            }
        }
//        File targetFile0 = new File(path, filename[0]);
//        if (!targetFile0.exists()) {
//            targetFile0.mkdirs();
//        }
//        File targetFile1 = new File(path, filename[1]);
//        if (!targetFile1.exists()) {
//            targetFile1.mkdirs();
//        }
//        File targetFile2 = new File(path, filename[2]);
//        if (!targetFile2.exists()) {
//            targetFile2.mkdirs();
//        }


        try {
            for (int i=0;i<file.length;i++) {
                file[i].transferTo(files[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------------------------");
        System.out.println("" + "/" + filename[0]);
        banzu.setBanzulogo("picture" + "/" + filename[0]);
        banzu.setZuzhijigou("picture" + "/" + filename[1]);
        iBanzuService.addBanzu(banzu);
      for (int i=2;i<filename.length;i++){
          Yuangongfengcai yuangongfengcai=new Yuangongfengcai();
          yuangongfengcai.setBanzujianjie("picture" + "/" +filename[i]);
          yuangongfengcai.setFenzu(banzu.getFenzu());
          yuangongfengcaiService.add(yuangongfengcai);
      }

        System.out.println(banzu);


//        try{
//            DiskFileItemFactory factory = new DiskFileItemFactory();
//            ServletFileUpload upload = new ServletFileUpload(factory);
//
//            //解析请求
//            List<FileItem> items = upload.parseRequest(request);
//            System.out.println("items======================="+items);
//            for(FileItem item:items){
//                if(item.isFormField()){
//                    //封装数据到JavaBean中
//                    System.out.println("file name==="+item.getFieldName());
//                    String fieldName = item.getFieldName();//字段名，即javabean的属性名，除了图片
//                    String fieldValue = item.getString(request.getCharacterEncoding());
//                    BeanUtils.setProperty(banzu, fieldName, fieldValue);//除了图片路径，其他数据都有了
//                }else {
//                    for (MultipartFile mf : file) {
//                        if (!mf.isEmpty()) {
//                            String name = UUID.randomUUID().toString().replaceAll("-", "");
//                            String ext = GetFileExt.getFileExt(mf.getOriginalFilename());
//                            mf.transferTo(new File(url + "/" + name + "." + ext));
//                            String path = "upload/" + name + "." + ext;
//                            if (count == 1) {
//                                System.out.println("path======================"+path);
//                                banzu.setBanzulogo(path);
//                            } else if (count == 2) {
//                                banzu.setZuzhijigou(path);
//                            } else if (count == 3) {
//                                banzu.setYuangognfengcai(path);
//                            }
//                        }
//                        count++;
//                    }
//                }
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("------------------------------------------------");
//        System.out.println(banzu);
//        iBanzuService.addBanzu(banzu);
    }


    @GetMapping("/getall/{fenzu}")
    public Banzu getAllByBanzu(@PathVariable("fenzu") Integer fenzu) {
        return iBanzuService.getAllByFezu(fenzu);
    }

    @GetMapping("/getfengcai/{fenzu}")
    public List<Yuangongfengcai> list(@PathVariable("fenzu") Integer fenzu){
     return yuangongfengcaiService.getAll(fenzu);
    }

    @GetMapping("/getlogo/{fenzu}")
    public LogoAndJigou logo(@PathVariable("fenzu") Integer fenzu){
        return iBanzuService.get(fenzu);
    }



}
