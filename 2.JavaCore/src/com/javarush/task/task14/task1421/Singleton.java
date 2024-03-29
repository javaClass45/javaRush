package com.javarush.task.task14.task1421;

public final class Singleton {
    private static volatile Singleton instance;


    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
