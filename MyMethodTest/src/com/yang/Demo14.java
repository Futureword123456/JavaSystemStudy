package com.yang;

/**
 * @Time : 2021/5/19 21:29
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo14.java
 * @Software: IntelliJ IDEA
 **/
public class Demo14 {
    public static void main(String[] args) {
        /**
         * 数据交换
         */
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);

        /**
         * 数据交换(不使用变量)
         */
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
