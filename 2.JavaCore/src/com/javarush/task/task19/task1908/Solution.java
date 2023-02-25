package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
d:/j1/task1908-1.txt
d:/j1/task1908-2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(fileName1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedWriter fileWriter = null;
        try {
            fileWriter = new BufferedWriter(new FileWriter(fileName2));
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            String[] digital = s.split("\\s"); //("\\D+") ;

            for (String str : digital)
                try {
                    System.out.println(Integer.parseInt(str));
                    fileWriter.write(str + " ");
                } catch (NumberFormatException e) {
                    continue;
                }
        }
        fileWriter.close();
        fileReader.close();
    }
}
