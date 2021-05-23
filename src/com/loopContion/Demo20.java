package com.loopContion;

import java.util.Random;
import java.util.Scanner;

/**
 * @Time : 2021/5/18 15:58
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo20.java
 * @Software: IntelliJ IDEA
 **/
public class Demo20 {
    public static void main(String[] args) {
        /**
         * 需求：
         * 程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
         * 当猜错的时候根据不同情况给出相应的提示
         * A. 如果猜的数字比真实数字大，提示你猜的数据大了
         * B. 如果猜的数字比真实数字小，提示你猜的数据小了
         * C. 如果猜的数字与真实数字相等，提示恭喜你猜中了
         */
        Random randomNum = new Random();
        //用户输入一个数
        Scanner sc = new Scanner(System.in);

        //得到一个随机数
        int r = randomNum.nextInt(100)+1;
        //得到一个用户输入的数字
        while (true){
            System.out.println("输入一个数:");
            int num = sc.nextInt();
            if (num <r) {
                System.out.println("猜小了");
            }else if(num>r){
                System.out.println("猜大了");
            }else {
                System.out.println("刚好");
                break;
            }
        }
    }
}
