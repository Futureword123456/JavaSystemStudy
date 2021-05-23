package com.yang;

/**
 * @Time : 2021/5/18 16:19
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo1.java
 * @Software: IntelliJ IDEA
 **/
public class Demo1 {
    public static void main(String[] args) {
        /*
        数组的定义
         */
        int[] arr1= new int[2];
        arr1[0] = 11;
        arr1[1] = 22;

        /**
         * 数组类型的值记录的是地址
         */

        int [] arr2 = arr1;
        arr2[0] = 33;
        //arr2[1] = 44;
//        arr2[2] = 55;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println("------------------");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);

    }
}
