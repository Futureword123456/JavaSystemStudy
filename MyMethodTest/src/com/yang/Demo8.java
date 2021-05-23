package com.yang;

/**
 * @Time : 2021/5/19 20:01
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo8.java
 * @Software: IntelliJ IDEA
 **/
public class Demo8 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);
        change(number);
        System.out.println("调用change方法后:" + number);

    }

    private static void change(int number) {
        number = 200;
    }
}
