package com.test.thread;

public class Clock extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Clock chasy = new Clock();
        chasy.start();

        Thread.sleep(11000);
        chasy.interrupt();

    }

    public void run() {
        int i = 10;
        Thread tekuschij = Thread.currentThread();
        while (!tekuschij.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Работа потока была прервана");
                break;
            }
            System.out.println("Tik-" + i--);
        }
    }

}
