package com.String;

/**
 * @Time : 2021/5/22 20:09
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : stringmethod.java
 * @Software: IntelliJ IDEA
 **/
public class stringmethod {
    public static void main(String[] args) {
        String a = "abc";
        String b = "ABC";
        String c = "abc";
        System.out.println(a.equals(b));//false
        System.out.println(a.equals(c));//true

        System.out.println(a.equalsIgnoreCase(b));//true
    }
}
