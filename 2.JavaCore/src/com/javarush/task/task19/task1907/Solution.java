package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
d:\\1.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufred = new BufferedReader(new InputStreamReader(System.in));
        String file = bufred.readLine();
        bufred.close();

        BufferedReader fileRead = new BufferedReader(new FileReader(file));
        int count = 0;
        String exampl = "world";
        String line;

        while ((line = fileRead.readLine()) != null) {
            String[] strings = line.split("\\W");

            for (String s : strings) {
                if (exampl.equals(s)) count++;
            }
        }
        fileRead.close();
        System.out.println(count);
    }
}
