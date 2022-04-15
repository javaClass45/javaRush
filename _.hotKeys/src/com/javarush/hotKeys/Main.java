package com.javarush.hotKeys;

public class Main {

    public static void main(String[] args) {

         int x = 7;
        int y = incrementNumber(x);
        System.out.println("increment-" + y);

        Cat cat = new Cat(7);
        catLevelUp(cat);
        System.out.println("cat-" + cat.getAge());

    }

    public static void catLevelUp(Cat cat) {

        cat.setAge(cat.getAge() + 1);
    }

    public static int incrementNumber(int x) {
        return x++;
    }
}

class Cat {
    int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

