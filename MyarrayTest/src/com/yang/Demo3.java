package com.yang;

/**
 * @Time : 2021/5/18 20:20
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo3.java
 * @Software: IntelliJ IDEA
 **/
public class Demo3 {
    public static void main(String[] args) {
        /**
         * 1.10.1 索引越界异常
         * 1.10.2 空指针异常
         */
        int[] arr = new int[]{1,2};
        //java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(arr[5]);
        arr = null;
        //java.lang.NullPointerException
        System.out.println(arr[1]);

    }
}
