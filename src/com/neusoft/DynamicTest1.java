package com.neusoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu
 * @date 2020/6/7 16:36
 */
public class DynamicTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(122);
        list.add(13422);
        list.add(1252);
        list.add(175622);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int a = 100;
        // 变成double类型 100.00  精度高 这就是向上转型
        // 格式：父类类型 对象名 = new 子类对象
        // 向下转型 格式：子类类型 对象名 = （子类类型）new 父类对象
    }
}
