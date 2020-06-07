package com.neusoft;

/**
 * @author Liu
 * @date 2020/6/7 19:06
 */
public class Sun extends Star implements Universe {
    public void exchange(){
        System.out.println("太阳吸引着9大行星旋转");
    }
    public void  sunshine(){
        System.out.println("光照八分钟，到达地球");
    }
}
