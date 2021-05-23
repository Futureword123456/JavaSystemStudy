package com.loopContion;
/*
    运算符
 */
public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        double b=a;
        System.out.println(b);
        byte c=10;
        byte d = 20;
        int e = c+d;
        System.out.println(e);
        //大类型转换为小类型
        int f = 10;//大数据类型
        short g = (short) f;//小数据类型
        System.out.println(g);

        /**
         *
         * 强制类型转换案例
         */
            byte h = 3;//会自动提升为int类型进行运算，计算结果是int类型
            byte t = 4;
            byte m = (byte)(h+t);//计算结果的int类型   需要强制类型转换为byte
            System.out.println(m);
            byte n= 3+4;//java中存在常量优化机制，整数常量的计算会直接计算出结果，并且会自动判断该结果是否在byte取值范围。
            System.out.println(n);


            char nn = 'a';
            System.out.println(nn+1);


    }
}
