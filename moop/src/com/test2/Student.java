package com.test2;

/**
 * @Time : 2021/5/20 21:48
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Student.java
 * @Software: IntelliJ IDEA
 **/
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(this);
        this.name = name;
    }
}
