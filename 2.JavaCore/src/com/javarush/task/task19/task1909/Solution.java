package com.javarush.task.task19.task1909;

import java.io.*;

/* 
Замена знаков
d:\\1.txt
d:\\2.txt

*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufred = new BufferedReader(new InputStreamReader(System.in));
        String f1 = bufred.readLine();
        String f2 = bufred.readLine();
        bufred.close();

        BufferedReader  fileReaderOne = new BufferedReader(new FileReader(f1));

        BufferedWriter  fileWriterTwo = new BufferedWriter (new FileWriter(f2));

        while (fileReaderOne.ready()){
            String line = fileReaderOne.readLine();

            fileWriterTwo.write(line.replace('.','!'));
        }

        fileReaderOne.close();
        fileWriterTwo.close();

    }
}
