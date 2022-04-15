package com.javarush.task.task07.task0712;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] list) throws IOException {
        //напишите тут ваш код
        int minIndex = 0;
        int maxIndex = 0;
        int min;
        int max;

        int[] size = new int[10];

        ArrayList<String> listStr = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            listStr.add(reader.readLine());
            size[i] = listStr.get(i).length();
        }

        min = size[0];
        for (int i = 1; i < size.length; i++) {
        if (size[i] < min) {
            min = size[i];
            minIndex = i;
        }
        }


        max = size[0];
        for (int i = 1; i < size.length; i++) {
            if (size[i] > max) {
                max = size[i];
                maxIndex = i;
            }
        }

        if (minIndex < maxIndex)
            System.out.println(listStr.get(minIndex));
        else
            System.out.println(listStr.get(maxIndex));

    }

    }

