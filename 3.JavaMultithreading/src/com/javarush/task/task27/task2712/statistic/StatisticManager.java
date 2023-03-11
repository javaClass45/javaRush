package com.javarush.task.task27.task2712.statistic;

public class StatisticManager {

    private static StatisticManager ourInstance = new StatisticManager();

    private StatisticManager() {}

    public static StatisticManager getInstance()
    {
        return ourInstance;
    }

}
