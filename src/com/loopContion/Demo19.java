package com.loopContion;

import java.util.Random;

/**
 * @Time : 2021/5/18 15:47
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo19.java
 * @Software: IntelliJ IDEA
 **/
public class Demo19 {
    public static void main(String[] args) {
        /**
         * Random的使用
         * 需求: 产生随机数1-10之间的
         */
        Random r = new Random();
        for (int i = 0; i <=10 ; i++) {
            int num = r.nextInt(10)+1;
            System.out.print(num);
        }
    }
}
