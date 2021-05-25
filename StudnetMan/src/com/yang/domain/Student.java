package com.yang.domain;

/**
 * @Time : 2021/5/25 15:24
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Student.java
 * @Software: IntelliJ IDEA
 **/
public class Student {
    private String name;
    private  int sid;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String name, int sid, int age, String birthday) {
        this.name = name;
        this.sid = sid;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
