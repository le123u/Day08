package com.neusoft;

/**
 * @author Liu
 * @date 2020/6/7 20:47
 */
public class FinalDemo01 {
    public static void main(String[] args) {
        // 声明一个变量 使用final修饰
        final int al ;
        al = 10;
        System.out.println(al);
        // al = 20; 报错 不可重新赋值
        final int b = 100;
//        b = 111; 报错 不可重新赋值

//        final int c = 0;
//        for(int i = 0; i < 10; i ++){
//            c = i;
//            System.out.println(c);
//        }

        // 可以编译 可以运行 c是局部变量 每次循环都是创建了一个新的变量c
        for(int i = 0; i < 10; i++){
            final int c = i;
            System.out.println(c);
        }
    }
}
