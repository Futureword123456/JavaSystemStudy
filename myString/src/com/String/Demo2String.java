package com.String;

/**
 * @Time : 2021/5/22 19:39
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo2String.java
 * @Software: IntelliJ IDEA
 **/
public class Demo2String {
    public static void main(String[] args) {
        /**
         * public String() : 创建一个空白字符串对象，不含有任何内容
         * public String(char[] chs) : 根据字符数组的内容，来创建字符串对象
         * public String(String original) : 根据传入的字符串内容，来创建字符串对象
         * String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc
         */
        //public String() : 创建一个空白字符串对象，不含有任何内容
        String s = new String();
        System.out.println(s);
        //public String(char[] chs) : 根据字符数组的内容，来创建字符串对象
        char[] chs ={'a','c','d'};
        String s1 = new String(chs);
        System.out.println(s1);
        // public String(String original) : 根据传入的字符串内容，来创建字符串对象
        String s2 = new String("123");
        System.out.println(s2);
        //String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc
        String s3 = "abc";
        System.out.println(s3);

    }
}
