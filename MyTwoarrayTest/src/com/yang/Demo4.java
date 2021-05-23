package com.yang;

/**
 * @Time : 2021/5/20 17:01
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo4.java
 * @Software: IntelliJ IDEA
 **/
public class Demo4 {
    public static void main(String[] args) {
        /**
         * 二维数组的求和
         */
        int[][] arr = new int[][]{
                {1,226644},
                {2,773388},
                {3,254565},
                {4,116699}
        };
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
