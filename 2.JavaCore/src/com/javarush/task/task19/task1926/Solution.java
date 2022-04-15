package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
d:\\1.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        bf.close();
        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        while (fr.ready()) {
            String frLine = fr.readLine();
            //разворачиваем строку
            StringBuilder stringBuilder = new StringBuilder(frLine);
            stringBuilder.reverse();
            System.out.println(stringBuilder.toString());
        }
        fr.close();
    }
}
