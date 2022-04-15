package com.javarush.task.task14.task1417;

public class Hryvnia extends Money {

     Hryvnia(double s) {
        super(s);
    }


@Override
    public String getCurrencyName() {
        return "UAH";
    }
}
