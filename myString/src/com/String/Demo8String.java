package com.String;

/**
 * @Time : 2021/5/22 20:53
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo8String.java
 * @Software: IntelliJ IDEA
 **/
public class Demo8String {
    private String name;
    private String age;

    public Demo8String() {
    }

    public Demo8String(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void show(){
        System.out.println(name+"*********"+age);
    }
}
