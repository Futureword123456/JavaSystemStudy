package com.yang;

/**
 * @Time : 2021/5/19 16:53
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo5.java
 * @Software: IntelliJ IDEA
 **/
public class Demo5 {
    public static void main(String[] args) {
        /**
         * 设计一个方法可以获取两个数的和，数据来自于参数
         */
        int num = add(10, 20);
        System.out.println(num);

    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}
