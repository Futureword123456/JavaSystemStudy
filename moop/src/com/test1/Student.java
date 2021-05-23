package com.test1;

import java.util.Objects;

/**
 * @Time : 2021/5/20 21:20
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Student.java
 * @Software: IntelliJ IDEA
 **/
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=0&&age<=100){
            this.age = age;
        }else {
            System.out.println("年龄不符合标准");
        }

    }
    public void show(){
        System.out.println(name+"的年龄为"+age+"岁");
    }
}
