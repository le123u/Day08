package com.neusoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu
 * @date 2020/6/7 16:36
 */
public class DynamicTest2 {
    public static void main(String[] args) {
      // 向上转型
       Animal cat = new Cat();
//       cat.eat();

       // 向下转型
        //格式：子类类型 对象名 = （子类类型）new 父类对象
//        Cat c = (Cat) cat;
//        c.eat();


//        Cat cat1 = new Cat();
//        cat1.eat();

        // 转型的异常，ClassCastException
        Cat jiaFei = new JiaFei();
        if(jiaFei instanceof Cat){
            JiaFei fei = (JiaFei)  jiaFei;
            fei.eat();
        }else{
            System.out.println("不是父类类型不能强制转换");
        }

        // instance of 判断对象属于那种类型c.eat();
//        if (cat instanceof Animal){
//            Cat c = (Cat) cat;
//            c.eat();
//
//        }else{
//            System.out.println("不是父类类型不能强制转换");
//        }


    }
}
