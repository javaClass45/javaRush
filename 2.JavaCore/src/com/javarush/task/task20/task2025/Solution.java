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
