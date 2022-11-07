package com.javarush.hotKeys;

import java.util.Objects;

public class Main {
    Cat cat;

    public Main(Cat cat) {
        this.cat = cat;
    }

    public static void main(String[] args) {

        int x = 7;
        int y = incrementNumber(x);
        System.out.println("increment-" + y);

        Cat cate = new Cat(7);
        catLevelUp(cate);
        System.out.println("cat-" + cate.getAge());

        cate.getClass();
        cate.equals(new Cat(3, "Barsik"));




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
    String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}

