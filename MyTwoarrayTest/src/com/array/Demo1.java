package com.array;

/**
 * @Time : 2021/5/20 16:18
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo1.java
 * @Software: IntelliJ IDEA
 **/
public class Demo1 {
    public static void main(String[] args) {
        /**
         * 二维数组的建立初始化
         */
        int[][] arr = new int[3][2];
        arr[0][0] = 11;
        arr[0][1] = 22;


        arr[1][0] = 33;
        arr[1][1] = 44;


        arr[2][0] = 55;
        arr[2][1] = 66;


        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

    }
}
