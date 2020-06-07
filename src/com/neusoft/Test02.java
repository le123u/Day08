package com.neusoft;

/**
 * @author Liu
 * @date 2020/6/7 19:14
 */
public class Test02 {
    public static void main(String[] args) {
        Star sun = new Sun();
        sun.doAnything();

        Sun s = (Sun) sun;
        s.shine();

    }
}
