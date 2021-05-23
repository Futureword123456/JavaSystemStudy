package com.yang;

/**
 * @Time : 2021/5/19 20:43
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo13.java
 * @Software: IntelliJ IDEA
 **/
public class Demo13 {
    public static void main(String[] args) {
        /**
         * 求偶数和1-10
         */
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
