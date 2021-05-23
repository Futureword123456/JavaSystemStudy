package com.yang;

/**
 * @Time : 2021/5/19 20:11
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo9.java
 * @Software: IntelliJ IDEA
 **/
public class Demo9 {
    public static void main(String[] args) {
        /**
         * 设计一个方法用于数组遍历，要求遍历的结果是在一行上的。
         * 例如：[11, 22, 33, 44, 55]
         */
        int[] arr = new int[]{11,22,33,44,55};
        scann(arr);
    }
    public static void scann(int[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            //0,1,2,3,4   5
            //System.out.print(arr[i]+",");

            if (i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
