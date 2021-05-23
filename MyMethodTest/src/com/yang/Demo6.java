package com.yang;

/**
 * @Time : 2021/5/19 16:54
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo6.java
 * @Software: IntelliJ IDEA
 **/
public class Demo6 {
    public static void main(String[] args) {
        /**
         *
         *          * 设计一个方法可以获取两个数的较大值，数据来自于参数
         *
         */
        int maxValue = max(-100, 70);
        System.out.println(maxValue);
    }

    public static int max(int a, int b) {
        int c = 0;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }
}
