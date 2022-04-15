package com.zoo.animals;

public class Animals {
    String head;
    String legs;
    int countLegs;

    public Animals(String head, String legs, int countLegs) {
        this.head = head;
        this.legs = legs;
        this.countLegs = countLegs;
    }

    public void  walk (int step){
        System.out.println(step + "-шагов ");
    }

    public void golos(String golos) {
        System.out.println("Govorit - " + golos);
    }


}
