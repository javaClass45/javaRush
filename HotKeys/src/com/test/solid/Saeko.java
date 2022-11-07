package com.test.solid;

public class Saeko extends Clock{

    public Saeko(Calendar today) {
        super(today);
    }

    public static void main(String[] args) {

        Saeko saekoClock = new Saeko(new Calendar());

        saekoClock.getToday().data();

        saekoClock.timer(15);

    }

}
