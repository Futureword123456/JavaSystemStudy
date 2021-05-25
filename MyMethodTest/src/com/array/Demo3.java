package com.array;

/**
 * @Time : 2021/5/19 15:26
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo3.java
 * @Software: IntelliJ IDEA
 **/
public class Demo3 {
    /**
     * 求：判断一个数是奇数还是偶数(带参数的方法)
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 11;
        method(num);

    }

    public static void method(int num) {
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
