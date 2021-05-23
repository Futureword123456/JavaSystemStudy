package com.loopContion;

/**
 * @Time : 2021/5/18 15:26
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo17.java
 * @Software: IntelliJ IDEA
 **/
public class Demo17 {
    public static void main(String[] args) {
        /**
         * 循环电梯1-24层
         */
        for (int i = 0; i <=24 ; i++) {
            if (i==4||i==10){
                continue;//跳过这层循环
            }
            System.out.println(i+"层到了~");
        }
        /**
         * 20岁到80岁上班，60岁退休
         */
        for (int i = 20; i <= 80 ; i++) {
            if (i == 60){
                break;//直接结束当前的所有循环
            }
            System.out.println(i+"岁上班了");
        }
    }
}
