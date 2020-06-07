package com.neusoft;

/**
 * @author Liu
 * @date 2020/6/7 14:23
 */
public abstract class Animal implements LiveAble {
    // 无法重写静态方法 只能通过接口名调用

    public abstract void eat();
    public void shouYang(){

    }
    @Override
    public void show(){
        System.out.println("重写");

    }

}
