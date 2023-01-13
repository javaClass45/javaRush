package com.javarush.task.task25.task2512;

import java.util.LinkedList;
import java.util.List;

/* 
Живем своим умом
*/

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
 if (t != null) t.interrupt();
        Throwable myCause = e.getCause();
        if (myCause != null) uncaughtException(t, myCause);
        System.out.println(e.getClass().getName() + ": " + e.getMessage());
    }



    public static void main(String[] args) {
        Thread myThread = new Thread( ){
            public void run() {
                try {
                    throw new Exception("ABC",
                            new RuntimeException("DEF",
                                    new IllegalAccessException("GHI")));
                } catch (Exception e) {

                    getUncaughtExceptionHandler().uncaughtException(currentThread(), e);
                }
            }
        };
        myThread.setUncaughtExceptionHandler(new Solution());

        myThread.start();


    }
}
