package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int odd = 0;
        int even = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] intArr = new int[15];

        for (int i = 0; i < intArr.length; i++) {
            System.out.print("введи " + i + "-й элемент массива - ");

            intArr[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0)
                even += intArr[i];
            else
                odd += intArr[i];
        }
        if (odd == even) System.exit(0);


        if (odd > even)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}
