package com.loopContion;

/**
 * @Time : 2021/5/16 21:26
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo13.java
 * @Software: IntelliJ IDEA
 **/
public class Demo13 {
    /**
     * 需求：在控制台输出所有的“水仙花数”
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <=999 ; i++) {
            int ge=0;
            int shi = 0;
            int bai = 0;
            ge = i%10;//三位数取个位
            shi = i/10%10;//三位数取十位
            bai = i/100;//三位数取百位
            if(ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
                System.out.print(i+" ");
                count++;
                if (count%2==0) {
                    System.out.println();
                }
            }
        }
        System.out.println("1000以内有"+count+"水仙花数数");
    }
}
