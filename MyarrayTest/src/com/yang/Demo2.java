package com.yang;

/**
 * @Time : 2021/5/18 20:06
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo2.java
 * @Software: IntelliJ IDEA
 **/
public class Demo2 {
    /**
     * 数组的静态初始化
     * 数组静态初始化 : 初始化时指定每个数组元素的初始值，由系统决定数组长度
     * 完整格式:
     * 数据类型[] 数组名 = new 数据类型[]{数据1,数据2,数据3...};
     * 简化格式:
     * 数据类型[] 数组名 = {数据1,数据2,数据3...};
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------");
        int[] arr1 = {4,5,6};
        System.out.println(arr1);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }


    }
}
