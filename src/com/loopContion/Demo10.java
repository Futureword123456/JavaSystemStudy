package com.loopContion;

/**
 * @Time : 2021/5/16 20:57
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo10.java
 * @Software: IntelliJ IDEA
 **/

/**
 * for循环的使用
 */
public class Demo10 {
    /**
     * 需求：在控制台输出1-5和5-1的数据
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            System.out.print(i);
        }


    }
}
