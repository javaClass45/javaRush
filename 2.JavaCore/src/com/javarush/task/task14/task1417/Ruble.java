package com.javarush.task.task14.task1417;

public class Ruble extends Money {
     Ruble(double s) {
        super(s);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
