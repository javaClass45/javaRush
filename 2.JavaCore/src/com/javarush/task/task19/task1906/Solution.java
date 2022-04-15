package com.javarush.task.task19.task1906;

import java.io.*;

/* 
Четные символы
d:\\f1.txt
d:\\f2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufred = new BufferedReader(new InputStreamReader(System.in));
        String f1 = bufred.readLine();
        String f2 = bufred.readLine();
        bufred.close();

        FileReader fileReaderOne = new FileReader(f1);

        FileWriter fileWriterTwo = new FileWriter(f2);
        int i = 1;
        while (fileReaderOne.ready()){
            int val = fileReaderOne.read();
            if (i % 2 == 0) fileWriterTwo.write(val);
            i++;
        }



        fileReaderOne.close();
        fileWriterTwo.close();
    }
}
