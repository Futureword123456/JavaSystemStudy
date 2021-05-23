package com.api;

import java.util.Scanner;

/**
 * @Time : 2021/5/22 18:39
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : DemoScanner.java
 * @Software: IntelliJ IDEA
 **/
public class DemoScanner {
    /*
    next():遇到了空格就不在录入数据
    结束标记：空格 tab键

    nextLine()：将数据完整的接受
    结束标记是回车换行符
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        //输入一串字符串
        String s = sc.nextLine();
        System.out.println(s);
    }
}
