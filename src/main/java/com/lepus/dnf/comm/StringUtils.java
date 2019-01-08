package com.lepus.dnf.comm;

public class StringUtils {

    public static boolean isBlank(String str){
        return str == null || "".equals(str);
    }

    public static boolean isNotBlank(String str){
        return !isBlank(str);
    }

}
