package com.yang;

/**
 * @Time : 2021/5/19 15:23
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo2.java
 * @Software: IntelliJ IDEA
 **/
public class Demo2 {
    /**
     * 求：判断一个数是奇数还是偶数(不带参数的方法)
     *
     * @param args
     */
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int num = 10;
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
