package com.array;

/**
 * @Time : 2021/5/19 19:57
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo7.java
 * @Software: IntelliJ IDEA
 **/
public class Demo7 {
    public static void main(String[] args) {
        /**
         *
         * 需求：使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
         * 思路：
         * ①定义比较两个数字的是否相同的方法compare()方法，参数选择两个int型参数
         * ②定义对应的重载方法，变更对应的参数类型，参数变更为两个long型参数
         * ③定义所有的重载方法，两个byte类型与两个short类型参数
         * ④完成方法的调用，测试运行结果
         */
        short a = 10;
        short b = 20;
        System.out.println(compare(a, b));
    }
    public static boolean compare(int a,int b){
        return a == b;
    }
    public static boolean compare(byte a,byte b){
        return a == b;
    }
    public static boolean compare(short a,short b){
        return a == b;
    }
    public static boolean compare(long a,long b){
        return a == b;
    }
}
