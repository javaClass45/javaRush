package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

// d:/j1/task1822.txt

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        while (file.ready()) {
            String line = file.readLine();
            if (line.startsWith(args[0] + " ")){
                System.out.println(line);
            break;}
        }

        file.close();
    }
}
