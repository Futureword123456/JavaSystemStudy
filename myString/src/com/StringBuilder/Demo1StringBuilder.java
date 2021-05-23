package com.StringBuilder;

/**
 * @Time : 2021/5/23 10:05
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo1StringBuilder.java
 * @Software: IntelliJ IDEA
 **/
public class Demo1StringBuilder {
    //5592
    public static void main(String[] args) {
        long start = System.currentTimeMillis();//获取的毫秒值，1秒=1000毫秒

        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 50000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start1 = System.currentTimeMillis();//获取的毫秒值，1秒=1000毫秒
        method();
        long end1 = System.currentTimeMillis();
        System.out.println(end1- start1);
    }

    private static void method() {
        long start = System.currentTimeMillis();//获取的毫秒值，1秒=1000毫秒
        String s = "";
        for (int i = 1; i <= 50000; i++) {
            s += i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
