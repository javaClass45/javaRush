package com.javarush.task.task20.task2025;

import java.util.*;

/* 
Алгоритмы-числа
*/
// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834
// Not solved
//Метод getNumbers должен возвращать массив чисел удовлетворяющих условию задачи
//В массиве возвращаемом методом getNumbers не хватает элементов или есть лишние.

public class Solution {

    public static long[] getNumbers(long N) {
        long[] result = null;
        TreeSet<Long> numbers = new TreeSet<>();
        numbers.add(0L);
        //Array of degrees
        final int SIZE = 12;
        long[][] powLst = new long[SIZE][SIZE];

        //Here lies the slicing of numbers
        int[] lst = new int[20];


        label:
        for (long i = 1; i < N; i++) {
            // 1. Reject numbers whose sum of digits is the same (reduce to 200,000  variants or less)
            // 2. Get the slicing of numbers in the form of an array
            long x = i;
            int lenCount = 0;
            int current;
            int last = Integer.MAX_VALUE;
            while (x != 0) {
                current = (int) (x % 10);
                if ((current != 0 && last != 0) && last < current)
                    continue label;
                last = current;
                lst[lenCount] = current;
                x = x / 10;
                lenCount++;
            }

            //3. We consider the degree, and fill in the table of degrees
            //Find the sum of the powers of the digits of the number, for example, 037 from point 2 was received here
            long summa1 = 0;
            for (int j = 0; j < lenCount; j++) {
                if (powLst[lst[j]][lenCount] == 0) {        //If there is no value in the degrees array yet
                    long a1 = lst[j];
                    if (a1 != 0 && a1 != 1) {          //If the number is 0 or 1, then there is no point in counting the degree
                        long a2 = lst[j];
                        for (int jj = 1; jj < lenCount; jj++) // Calculate degree
                            a1 *= a2;
                    }
                        powLst[lst[j]][lenCount] = a1;         //Add a new value to the degrees array
                }
                summa1 += powLst[lst[j]][lenCount];
            }


            //4. Get an array of numbers
            long xx = summa1;
            lenCount = 0;
            while (xx != 0) {
                lst[lenCount] = (int) (xx % 10);
                lenCount++;
                xx = xx / 10;
            }

            //5. From the resulting amount we take the sum of degrees, to check for the armstrong number
            long summa2 = 0;
            for (int j = 0; j < lenCount; j++) {
                if (powLst[lst[j]][lenCount] == 0) {    //If there is no value in the degrees array yet
                    long a1 = lst[j];
                    if (a1 != 0 && a1 != 1) {          //If the number is 0 or 1, then there is no point in counting the degree
                        long a2 = lst[j];
                        for (int jj = 1; jj < lenCount; jj++) // Calculate degree
                            a1 *= a2;
                    }
                    powLst[lst[j]][lenCount] = a1;      //Add a new value to the degrees array
                }
                summa2 += powLst[lst[j]][lenCount];
            }

            //6. Add a result
            if (summa1 == summa2 && summa1 < N)
                numbers.add(summa1);
        }//   label:
        result = new long[numbers.size()];

        int count = 0;
        for (Long l : numbers) {
            result[count++] = l;
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000L)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory()
                - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1_000_000L)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory()
                - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
