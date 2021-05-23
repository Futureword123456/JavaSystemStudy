package com.String;

import java.util.Scanner;

/**
 * @Time : 2021/5/22 20:18
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo3String.java
 * @Software: IntelliJ IDEA
 **/
public class Demo3String {
    public static void main(String[] args) {
        /*
         * 用户登录案例
         */
        String scUsername = "admin";
        String scPassword = "admin";

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.println("请输入用户名");
            String username = scanner.nextLine();
            System.out.println("请输入密码");
            String password = scanner.nextLine();
            if (username.equals(scUsername)&&password.equals(scPassword)){
                System.out.println("登录成功");
                break;
            }else {
                if (i==3){
                    System.out.println("你的登录次数已经达到今日上限，请明天再来");
                }else {
                    System.out.println("登录失败，你还有"+(3-i)+"次机会");
                }

            }
        }
    }
}
