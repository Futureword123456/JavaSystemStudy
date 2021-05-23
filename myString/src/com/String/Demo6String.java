package com.String;

import java.util.Scanner;

/**
 * @Time : 2021/5/22 20:42
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo6String.java
 * @Software: IntelliJ IDEA
 **/
public class Demo6String {
    public static void main(String[] args) {
        /**
         * 手机号屏蔽
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个手机号:");
        String s1 = scanner.nextLine();
        //从第0个开始，3-1个结束
        String start = s1.substring(0, 3);
        //从第七个开始一直到结束
        String end = s1.substring(7);
        System.out.println(start+"******"+end);
    }
}
