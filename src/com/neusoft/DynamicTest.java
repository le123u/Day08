package com.neusoft;

/**
 * @author Liu
 * @date 2020/6/7 16:36
 */
public class DynamicTest {
    public static void main(String[] args) {
        // 多态形式
        // 格式：父类类型 对象名 = new 子类对象
       // Animal dog = new Dog();
        //dog.eat();
        //Animal cat = new Cat();
        //cat.eat();

        // 限定类型 string int double  对象 泛型

        //多态的好处
        Cat cat = new Cat();
        Dog dog = new Dog();

        // 调用
        showCatEat( cat);

        showDogEat(dog);

        showAnimalEat(cat);
        showAnimalEat(dog);
    }


    public static void showCatEat(Cat cat){
        cat.eat();
    }
    public static void showDogEat(Dog dog){
        dog.eat();
    }
    public static void showAnimalEat(Animal animal){
        animal.eat();
    }
}
