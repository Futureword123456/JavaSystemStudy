package com.loopContion;

/**
 * @Time : 2021/5/16 21:24
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo12.java
 * @Software: IntelliJ IDEA
 **/
public class Demo12 {
    public static void main(String[] args) {
        /**
         * 需求：求1-100之间的偶数和，并把求和结果在控制台输出
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
