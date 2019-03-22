package com.acat.util;

public class StringUtil {
    public static String qiege(String str){
        String newStr = str.substring(str.lastIndexOf("/")+1);
        return newStr;
    }

    public static String qiegeqianmian(String str){
        int i = str.lastIndexOf(".");
        return str.substring(0,i);
    }
}
