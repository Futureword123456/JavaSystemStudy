package com.test;

/**
 * @Time : 2021/5/20 20:44
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Phone.java
 * @Software: IntelliJ IDEA
 **/
public class Phone {
    /**
     * 需求 ：首先定义一个手机类，然后定义一个手机测试类，
     * 在手机测试类中通过对象完成成员变量和成员方法的使
     */
//    成员变量：品牌, 价格
//    成员方法：打电话, 发短信
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0 && price < 50000) {
            this.price = price;
        } else {
            System.out.println("价格不合理");
        }

    }
    public void show(){
        System.out.println(brand+"价格是"+price+"元");
    }

    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("打电话");
    }
}
