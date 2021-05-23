package com.loopContion;

/**
 * @Time : 2021/5/16 20:04
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo8.java
 * @Software: IntelliJ IDEA
 **/

import java.util.Scanner;

/**
 * switch减肥计划
 * 周一：跑步
 * 周二：游泳
 * 周三：慢走
 * 周四：动感单车
 * 周五：拳击
 * 周六：爬山
 * 周日：好好吃一顿
 */
public class Demo8 {
    public static void main(String[] args) {
        String inputweek = "请输入一个星期:";
        System.out.println(inputweek);
//        String[] a =inputweek.split(":");
//        for (int i = 0; i < inputweek.length(); i++) {
//            System.out.println(inputweek.indexOf(2));
//        }
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
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
