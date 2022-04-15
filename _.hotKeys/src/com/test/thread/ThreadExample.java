package com.test.thread;

public class ThreadExample extends Thread {

    public ThreadExample() {
        this.start();
    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " уступает свое место другим");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }

    public static void main(String[] args) throws InterruptedException {
        new ThreadExample().join();
        new ThreadExample().yield();
        new ThreadExample().join();
    }
}