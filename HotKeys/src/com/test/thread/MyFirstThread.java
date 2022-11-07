package com.test.thread;

public class MyFirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());

    }
}
