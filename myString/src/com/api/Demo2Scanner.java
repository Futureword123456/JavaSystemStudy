package com.api;

import java.util.Scanner;

/**
 * @Time : 2021/5/22 18:50
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo2Scanner.java
 * @Software: IntelliJ IDEA
 **/
public class Demo2Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        System.out.println("请输入一个字符串");
        String s = sc.next();

        System.out.println(num);
        System.out.println(s);
    }
}
