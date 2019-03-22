package com.acat.util;

public class GetFileExt {
//    public static void main(String[] args) {
//        String str = "bbb.aaa.jpg";
//        String last = str.substring(str.lastIndexOf(".") + 1);
//        System.out.println(last);
//    }

    public static String getFileExt(String str){
        String last = str.substring(str.lastIndexOf(".")+1);
        return last;
    }
}
