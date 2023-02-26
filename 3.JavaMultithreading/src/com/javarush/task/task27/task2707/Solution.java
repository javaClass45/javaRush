package com.javarush.task.task27.task2707;

/* 
Определяем порядок захвата монитора
*/

//not solved
//Метод isLockOrderNormal должен возвращать true в случае, если синхронизация в методе
// someMethodWithSynchronizedBlocks происходит сначала по объекту o1, а потом по o2.

public class Solution {
    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {

        synchronized (obj1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }

            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }

    public static boolean isLockOrderNormal(final Solution solution,
                                            final Object o1,
                                            final Object o2) throws Exception {
        //do something here

        solution.someMethodWithSynchronizedBlocks(o1, o2);
        Thread t1 = new Thread() {
            public void run() {
                synchronized (o1) {
                    synchronized (o2) {
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                }
            }
        };
        t1.start();

        if (Thread.State.BLOCKED.equals(t1.getState())) {
            return true;
        } else return false;
    }

    public static void main(String[] args) throws Exception {
        final Solution solution = new Solution();
        final Object o1 = new Object();
        final Object o2 = new Object();

        System.out.println(isLockOrderNormal(solution, o1, o2));
    }
}
