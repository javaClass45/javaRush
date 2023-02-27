package com.javarush.task.task28.task2803;

import java.util.concurrent.ThreadLocalRandom;

/* 
ThreadLocalRandom
*/

public class Solution {
    public static int getRandomIntegerBetweenNumbers(int from, int to) {
        int in = ThreadLocalRandom.current().nextInt(from, to);
        return in;
    }

    public static double getRandomDouble() {
        double dabl = ThreadLocalRandom.current().nextDouble();
        return dabl;
    }

    public static long getRandomLongBetween0AndN(long n) {
        long ln = ThreadLocalRandom.current().nextLong(n);
        return ln;
    }

    public static void main(String[] args) {
    }
}
