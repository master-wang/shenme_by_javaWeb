package com.acat.util;

import java.util.ArrayList;
import java.util.List;

public class OperatorTian {
//    public static void main(String[] args){
//        String str = "10";
//        if(str.charAt(0)=='0'){
//            str = str.substring(1);
//        }
//        System.out.println(str);
//    }

    public static Integer getTianshu(String str){
        if(str.charAt(0)==0){
            str = str.substring(1);
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2018-12-09");
        list.add("2018-12-09");
        list.add("2018-12-09");
        System.out.println(list);
    }
}
