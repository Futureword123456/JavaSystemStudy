package com.array;

import java.util.Scanner;

/**
 * @Time : 2021/5/18 20:54
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo7.java
 * @Software: IntelliJ IDEA
 **/
public class Demo7 {
    public static void main(String[] args) {
        /**
         * 需求： 已知一个数组 arr = {19, 28, 37, 46, 50};
         * 键盘录入一个数据，查找该数据在数组中的索引，并在控制
         * 台输出找到的索引值。
         */
        int[] arr = new int[]{19, 28, 37, 46, 50};
        //键盘录入一个数据
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数:");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == num){
                index=i;
                break;
            }
        }
        System.out.println(num+"的索引为:"+index);
    }
}
