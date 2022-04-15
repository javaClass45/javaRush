package com.test.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            MyFirstThread potok = new MyFirstThread();
            potok.start();
            //  Thread.sleep(5);
            potok.join();

            double start = System.currentTimeMillis();
            Thread.sleep(1500);
            System.out.println(" - Сколько я проспал? \n - " +
                    ((System.currentTimeMillis()-start)) / 1000 + " секунды");

        }
    }

}
