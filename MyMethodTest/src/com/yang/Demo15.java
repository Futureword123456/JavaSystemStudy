package com.yang;

import java.util.Scanner;

/**
 * @Time : 2021/5/20 15:28
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo15.java
 * @Software: IntelliJ IDEA
 **/
public class Demo15 {
    public static void main(String[] args) {
        /**
         * 数值反转函数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要建立的数组的长度");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("输入一个长度为"+len+"的数组");
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        int start = 0;
        int end = arr.length - 1;
        for (; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }
    }
}
