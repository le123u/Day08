package com.neusoft;

/**
 * @author Liu
 * @date 2020/6/7 19:04
 */
public class Star implements Universe {
    @Override
    public void doAnything() {
        System.out.println("doAnything");
    }
    public void shine(){
        System.out.println("一闪一闪亮晶晶");
    }
}
