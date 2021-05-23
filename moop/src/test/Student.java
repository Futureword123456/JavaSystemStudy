package test;

/**
 * @Time : 2021/5/22 17:25
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Student.java
 * @Software: IntelliJ IDEA
 **/
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }
    public void show(){
        System.out.println(name+"...."+age);
    }
}
