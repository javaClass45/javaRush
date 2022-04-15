package com.zoo.animals;

public class Cat extends Animals{
    String name;
    int countClows;
    String clows;

    public Cat(String head,
               String legs,
               int countLegs,
               String name,
               int countClows,
               String clows) {
        super(head, legs, countLegs);
        this.name = name;
        this.countClows = countClows;
        this.clows = clows;
    }



    public void whoIs(Cat cat){
        System.out.println("Kotik imeet " + cat.head +
                ", " + cat.countLegs +
                " " + cat.legs +
                ", " + cat.countClows +
                " " + cat.clows +
                ", zovut " + cat.name);
    }





    }

