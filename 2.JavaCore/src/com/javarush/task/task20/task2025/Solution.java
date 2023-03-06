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


    private static long S;
    private static int N;
    private static int[] digitsMultiSet;
    private static int[] testMultiSet;

    private static List<Long> results;
    private static long maxPow;
    private static long minPow;

    private static long[][] pows;



    public static long[] getNumbers(long upperLimit) {
        if (upperLimit <= 1) return new long[0];

        S = upperLimit;
        List<Long> armstrongList = generate(String.valueOf(S).length() + 1);
        long[] result = new long[armstrongList.size()];

        for (int i = 0; i < armstrongList.size(); i++) {
            result[i] = armstrongList.get(i);
        }
        return result;
    }

    private static void genPows(int N) {
        if (N > 20) throw new IllegalArgumentException();
        pows = new long[10][N + 1];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                pows[i][j] = p;
                p *= i;
            }
        }
    }

    private static boolean check(long pow) {
        if (pow >= maxPow) return false;
        if (pow < minPow) return false;

        for (int i = 0; i < 10; i++) {
            testMultiSet[i] = 0;
        }

        while (pow > 0) {
            int i = (int) (pow % 10);
            testMultiSet[i]++;
            if (testMultiSet[i] > digitsMultiSet[i]) return false;
            pow = pow / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (testMultiSet[i] != digitsMultiSet[i]) return false;
        }

        return true;
    }

    private static void search(int digit, int unused, long pow) {
        if (pow >= maxPow) return;

        if (digit == -1) {
            if (check(pow) && pow < S) results.add(pow);
            return;
        }

        if (digit == 0) {
            digitsMultiSet[digit] = unused;
            search(digit - 1, 0, pow + unused * pows[digit][N]);
        } else {
            // Check if we can generate more than minimum
            if (pow + unused * pows[digit][N] < minPow) return;

            long p = pow;
            for (int i = 0; i <= unused; i++) {
                digitsMultiSet[digit] = i;
                search(digit - 1, unused - i, p);
                if (i != unused) {
                    p += pows[digit][N];
                    // Check maximum and break the loop - doesn't help
                    // if (p >= maxPow) break;
                }
            }
        }
    }

    private static List<Long> generate(int maxN) {
        if (maxN >= 21) throw new IllegalArgumentException();

        genPows(maxN);
        results = new ArrayList<>();
        digitsMultiSet = new int[10];
        testMultiSet = new int[10];

        for (N = 1; N < maxN; N++) {
            minPow = (long) Math.pow(10, N - 1);
            maxPow = (long) Math.pow(10, N);

            search(9, N, 0);
        }

        Collections.sort(results);

        return results;
    }


    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
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


/*ЧИСЛА АРМСТРОНГА
Задача
Натуральное десятичное N - значное число называется числом Армстронга, если сумма его цифр, возведенных в степень N, равна самому числу.

Примеры: 153 = 13 + 53 + 33 ; 1634 = 14 + 64 + 34 + 44.

Найти все числа Армстронга для 1<=N<=9.

Решение
Конечно, данную задачу можно было решить "в лоб", т.е. сделать простой перебор всех 109 чисел и каждое число проверить. При этом на весьма солидной машине программа могла бы работать достаточно долго. Если бы цель задания заключалась только в нахождении чисел Армстронга, а не в составлении универсальной программы, разработка которой могла бы занимать большое время, то конечно, лучше было бы за 10 минут написать и 3 часа подождать.

Идея уменьшения класса исследуемых чисел заключается в следующем : можно делать перебор не самих чисел, а значений, которые могут получаться в результате степенной суммы ( т.е. суммы цифр числа, возведенных в степень числа цифр этого числа ). Здесь используется следующее свойство : от перемены цифр местами в числе степенная сумма не меняется. Т.е. например, незачем рассматривать все числа из класса : 135, 153, 315, 351, 531 и 513; достаточно рассмотреть одно из них, например, число 135; вычислить его степенную сумму : (135)ст = 153, а потом лишь убедиться в том что число 153 - это число Армстронга. Этот метод снижает число перебираемых чисел почти в N! раз. Сам же перебор осуществляется довольно просто : рассматриваются все числа, у которых любая цифра не меньше предыдущей и не больше последующей. Например: 12, 1557, 333 и т.д.

Итак, вышеописанный метод снизил число перебираемых чисел с 109 до приблизительно 200000. Но это не все на чем стоит остановливаться. Можно применить еще одну хитрость, которая заключается в следующем : можно значительно ускорить вычисление степенной суммы. Можно заметить, что при вычислениях часто приходится многократно возводить некоторое число в некоторую степень. Чтобы это оптимизировать вводится двухмерный массив, в i-ой строке и j-ом столбце которого находится значение степенной суммы i с основанием j (например, Degree[123,j] = 1j + 2j + 3j ). Таким образом , используется значение массива Degree[i,j]. Это существенно ускоряет процесс вычисления, если это сравнивать с некоторым процессом, в котором используется функция Degree(i,j), каждый раз вычисляющая значение ij. Для вычисления выражения 10j аналогичнo используется массив Degree10. Нужно заметить, что такая операция возведения в степень в программе вы полняется более 10000 раз; матрица Degree заполняется в начале программы, где операция возведения i в степень j выполняется около 8000 раз.

В промежутке 1<=N<=9 программа находит следующие 32 числа Армстронга:

0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153.*/
