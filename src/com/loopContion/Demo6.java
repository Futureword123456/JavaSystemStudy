package com.loopContion;

import java.util.Scanner;

/**
 * @Time : 2021/5/16 16:48
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo6.java
 * @Software: IntelliJ IDEA
 **/
public class Demo6 {
    public static void main(String[] args) {
        String inputInt = "请输入一个分数:";
        /**
         * 输入一个成绩，90-100分之间奖励100块钱，
         * 80-90分奖励50块钱，
         * 70-80分之间奖励20块钱，
         * 60-70分之间奖励5块钱，
         * 0-60分之间奖励0元
         * 其他为分数错误
         */
        System.out.println(inputInt);
        Scanner sc = new Scanner(System.in);
        float score = sc.nextFloat();
        if (score>=0&&score<=100){
            if (score>=90&&score<=100) {
                System.out.println("奖励100元");
            }else if (score>=80&&score<90){
                System.out.println("奖励50元");
            }else if (score>=70&&score<80){
                System.out.println("奖励20元");
            }else if (score>=60&&score<70){
                System.out.println("奖励5元");
            }else if (score<60){
                System.out.println("奖励0元");
            }
        }else {
            System.out.println("分数有误");
        }
    }
}
