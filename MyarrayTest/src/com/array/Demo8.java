package com.array;

import java.util.Scanner;

/**
 * @Time : 2021/5/18 21:09
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo8.java
 * @Software: IntelliJ IDEA
 **/
public class Demo8 {
    public static void main(String[] args) {
        /**
         * 求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
         * 选手的最后得分为：去掉一个
         * 最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
         */
        Scanner sc = new Scanner(System.in);
        //用数组存储6个分数
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入第"+(i+1)+"个数:");
            int num = sc.nextInt();
            if (num>=0&&num<=100){
                arr[i] = num;
            }
            else {
                System.out.println("你输入的分数有问题，请输入0-100之间的数值");
                i--;
            }
        }
        //求最大值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max){
                max =arr[i];
            }
        }
        //求最小值
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<min){
                min =arr[i];
            }
        }
        //求和
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        //结果
        System.out.println("最后平均分"+(sum-max-min)/4);
    }
}
