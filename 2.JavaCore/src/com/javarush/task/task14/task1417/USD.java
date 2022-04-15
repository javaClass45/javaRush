package com.javarush.task.task14.task1417;

public class USD extends Money {
     USD(double s) {
        super(s);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
