package com.loopContion;

import java.util.Scanner;

/**
 * @Time : 2021/5/18 15:38
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo18.java
 * @Software: IntelliJ IDEA
 **/
public class Demo18 {
    public static void main(String[] args) {
        /**
         * 减肥计划改进，可以无限次输入，输入0结束循环
         */
        lo: while (true){
            String inputweek = "请输入一个星期:（输入0结束程序）";
            System.out.println(inputweek);
//        String[] a =inputweek.split(":");
//        for (int i = 0; i < inputweek.length(); i++) {
//            System.out.println(inputweek.indexOf(2));
//        }
            Scanner sc = new Scanner(System.in);

            int week = sc.nextInt();
            switch (week) {
                case 0:
                    System.out.println("感谢你的使用");
                    break lo;
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("好好吃一顿");
                    break;
                default:
                    System.out.println("你输入的数字有错误");
                    break;
            }
        }

    }
}
