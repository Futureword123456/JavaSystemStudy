package test;

/**
 * @Time : 2021/5/22 17:26
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : TestStudent.java
 * @Software: IntelliJ IDEA
 **/
public class TestStudent {
    public static void main(String[] args) {
        /**
         * 无参构造方法
         */
        Student student = new Student();
        student.setAge(20);
        student.setName("杨华钟");
        student.show();
        /**
         * 有参构造方法
         */
        Student student1 = new Student("杨华钟", 23);
        student1.show();
    }
}
