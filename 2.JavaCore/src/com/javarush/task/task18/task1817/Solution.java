package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Пробелы
d:\\f2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int amount = fileInputStream.available();
        int space = 0;

        while (fileInputStream.available() > 0){
            if (fileInputStream.read() == 32) space++;
        }

        fileInputStream.close();

        double result = (double) space/amount * 100;

        System.out.println(String.format("%.2f",result));
    }
}
