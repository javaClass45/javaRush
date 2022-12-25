package com.javarush.task.task25.task2505;

/* 
Без дураков
*/

public class Solution {

    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");

        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public class MyThread extends Thread {
        private String secretKey;


        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
//            setDaemon(true);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {
            /**
             * Method invoked when the given thread terminates due to the
             * given uncaught exception.
             * <p>Any exception thrown by this method will be ignored by the
             * Java Virtual Machine.
             *
             * @param t the thread
             * @param e the exception
             */
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                System.out.println(String.format
                        ("%s, %s, %s",secretKey, t.getName(), e.getMessage()));

            }

            public MyUncaughtExceptionHandler() {
            }
        }
    }

}

