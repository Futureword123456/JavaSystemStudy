package constructor;

/**
 * @Time : 2021/5/22 16:49
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Student.java
 * @Software: IntelliJ IDEA
 **/
public class Student {
    private int age;
    private String name;
   public void show(){
       System.out.println("age"+age+"name:"+name);
   }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
