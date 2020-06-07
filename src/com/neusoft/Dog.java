package com.neusoft;

/**
 * @author Liu
 * @date 2020/6/7 15:06
 */
public class Dog extends Animal implements LiveAble,Pet {
   // 多实现格式：
    // class 类名 [extends 父类名] implements 接口1，接口2{
   // // 必须重写接口中所有的抽象方法
   //    // 重写接口中的默认方法
   //    }
    @Override
    public void shouYang(){

   }
    @Override
    public void show(){
        System.out.println("重写");

    }

    @Override
    public void method() {
        System.out.println("Dog");
    }
    public void eat(){
        System.out.println("汪汪的吃狗粮");
    }
}
