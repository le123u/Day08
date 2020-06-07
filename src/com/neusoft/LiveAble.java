package com.neusoft;

public interface LiveAble {
    //静态方法
    public static void run (){
        System.out.println("跑起来");
    }


    // 将func1和func2两个方法封装到默认方法func
    default void func(){
        func1();
        func2();
    }
    // 私有方法 1.9以后有的
    private void func1(){

        System.out.println("func1跑起来");

    }
    private void func2(){

        System.out.println("func2跑起来");

    }

    //多实现抽象方法重名
    public void show();

    // 多实现默认方法重名
    public  default void method(){
        System.out.println("Liveable!");
    }
}
