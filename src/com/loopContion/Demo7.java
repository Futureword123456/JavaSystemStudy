package com.loopContion;

/**
 * @Time : 2021/5/16 19:53
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo7.java
 * @Software: IntelliJ IDEA
 **/

/**
 * switch()
 */

/**
 * switch简单案例
 */
public class Demo7 {
    /**
     * case后面只能是整数，且不能重复
     * @param args
     */
    public static void main(String[] args) {
        int week=30;
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("你的数据有误");
                break;

        }
    }
}
