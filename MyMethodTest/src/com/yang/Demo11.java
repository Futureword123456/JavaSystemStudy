package com.yang;

/**
 * @Time : 2021/5/19 20:30
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo11.java
 * @Software: IntelliJ IDEA
 **/
public class Demo11 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55};
        int[] max_min = value(arr);
        System.out.println(max_min[0]);
        System.out.println(max_min[1]);


    }

    public static int[] value(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int[] res = new int[]{max,min};
        return res;
    }

}
