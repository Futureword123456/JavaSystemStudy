package com.loopContion;

/**
 * @Time : 2021/5/16 20:23
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo9.java
 * @Software: IntelliJ IDEA
 **/

import java.util.Scanner;

/**
 * 概述 : 如果switch语句中,case省略了break语句, 就会开始case穿透
 * 需求 : 键盘录入星期数，输出工作日、休息日 (1-5)工作日，(6-7)休息日
 */
public class Demo9 {
    public static void main(String[] args) {
        String inputweek = "请输入一个星期:";
        String result = "今天是:";
        System.out.println(inputweek);
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(result + "工作日");
                break;
            case 6:
            case 7:
                System.out.println(result + "休息日");
                break;
            default:
                System.out.println("你输入的数据有误");
                break;
        }
    }
}
