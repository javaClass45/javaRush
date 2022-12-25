package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread thread:threads) {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;

                case WAITING:
                    thread.interrupt();
                    break;

                case TIMED_WAITING:
                    thread.interrupt();
                    break;

                case BLOCKED:
                    thread.interrupt();
                    break;

                case RUNNABLE:
                    thread.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(thread.getPriority());
                    break;

            }
        }


    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {

            threads[i] = new Thread();

        }

        Solution.processThreads(threads);
        try {
            threads[0].interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Solution.processThreads(threads);
    }
}
