package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileRead = args[0];
        String fileWrite = args[1];

        BufferedReader readF = new BufferedReader(new FileReader(fileRead));
        BufferedWriter writeF = new BufferedWriter(new FileWriter(fileWrite));

        while (readF.ready()) {
            String[] words = readF.readLine().split(" ");
            String regex = "^\\D*$";
            for (String str : words) {
                if (!str.matches(regex))
                    writeF.write(str + " ");
            }
        }
        readF.close();
        writeF.close();


    }
}
