package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Wine wi = new Wine();
        return wi;
    }

    public static Wine getWine() {
        Wine win = new Wine();
        return win;

    }

    public static Wine getSparklingWine() {
        SparklingWine sw = new SparklingWine();
        return sw;
    }
}
