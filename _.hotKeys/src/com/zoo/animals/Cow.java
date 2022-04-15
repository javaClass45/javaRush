package com.zoo.animals;

public class Cow extends Animals{
    String horns;
    int countHorns;
    String hooves;

    public Cow(String head,
               String legs,
               int countLegs,
               String horns,
               int countHorns,
               String hooves) {
        super(head, legs, countLegs);
        this.horns = horns;
        this.countHorns = countHorns;
        this.hooves = hooves;
    }



    public void whoIs(Cow cow){
        System.out.println(" " + cow.head +
                " " + cow.countLegs +
                " " + cow.legs +
                " " + cow.countHorns + cow.horns +
                " " + cow.hooves);
    }





    }

