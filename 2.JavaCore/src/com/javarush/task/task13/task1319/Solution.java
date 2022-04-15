package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        BufferedWriter writter = new BufferedWriter(new FileWriter(filePath));
        String line;
        while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
            writter.write(line + "\n");
        }
        writter.write("exit");
        writter.close();
    }
}

