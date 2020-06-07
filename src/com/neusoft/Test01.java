package com.neusoft;


/**
 * @author Liu
 * @date 2020/6/7 19:12
 */
public class Test01 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("====================");
        // 多态格式
        Universe sun = new Sun();
        sun.doAnything();

        // 向下转型
        Sun s = (Sun) sun;
        s.shine();
    }
}
