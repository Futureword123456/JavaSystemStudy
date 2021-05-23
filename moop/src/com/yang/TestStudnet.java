package com.yang;

/**
 * @Time : 2021/5/20 20:32
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : TestStudnet.java
 * @Software: IntelliJ IDEA
 **/
public class TestStudnet {
    public static void main(String[] args) {
        Student st = new Student();
        st.sex = "男";
        st.age = 20;
        System.out.println(st.sex);
        System.out.println(st.age);
        st.display();
    }
}
