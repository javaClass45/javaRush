package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] list) throws IOException {
        //напишите тут ваш код

        int min;


        int[] size = new int[10];

        ArrayList<String> listStr = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            //System.out.print("введи " + i + " строку: ");
            listStr.add(reader.readLine());
            size[i] = listStr.get(i).length();
        }

        min = size[0];
        for (int i = 1; i < size.length; i++) {
            if (size[i] < min) {
                System.out.println(i);
                break;
            }
            else {
                min = size[i];
            }
        }


    }

}


