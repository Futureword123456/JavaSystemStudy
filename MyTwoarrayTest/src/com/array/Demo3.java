package com.array;

/**
 * @Time : 2021/5/20 16:51
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo3.java
 * @Software: IntelliJ IDEA
 **/
public class Demo3 {
    public static void main(String[] args) {
        /**
         * 二维数组的遍历
         */
        int[][] arr = new int[][]{{1,2,3},{4,5,6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
