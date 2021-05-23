package com.yang;

/**
 * @Time : 2021/5/19 20:25
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo10.java
 * @Software: IntelliJ IDEA
 **/
public class Demo10 {
    public static void main(String[] args) {
        /**
         * 需求：设计一个方法用于获取数组中元素的最大值
         */
        int[] arr = new int[]{11, 22, 33, 44, 55};
        max(arr);
    }

    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
