package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[2];
        for (int i = 0; i < 2; i++) {
            String str = reader.readLine();
            num[i] = Integer.parseInt(str);

        }

   //     System.out.println("1e- " + num[0]);
    //    System.out.println("2e- " + num[1]);

        System.out.println(nod(num[0], num[1]));

    }
//Евклид
    public static int nod(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
