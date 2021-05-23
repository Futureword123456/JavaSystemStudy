package com.yang;

import java.util.Scanner;

/**
 * @Time : 2021/5/18 20:40
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo6.java
 * @Software: IntelliJ IDEA
 **/
public class Demo6 {
    public static void main(String[] args) {
        /**
         * 键盘录入5个整数，存储到数组中，并对数组求和
         * 数组元素求和
         */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数:");
            int num = sc.nextInt();
            arr[i] = num;
            sum += arr[i];
        }

//        for (int i = 0; i < arr.length ; i++) {
//
//        }
        System.out.println("sum:" + sum);
    }
}
