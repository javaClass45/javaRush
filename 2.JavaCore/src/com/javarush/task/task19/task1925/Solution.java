package com.javarush.task.task19.task1925;

import java.io.*;

/* 
Длинные слова
d:\\1.txt
d:\\2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileRead = args[0];
        String fileWrite = args[1];

        BufferedReader readF = new BufferedReader(new FileReader(fileRead));
        BufferedWriter writeF = new BufferedWriter(new FileWriter(fileWrite));
        StringBuffer text = new StringBuffer();
        while (readF.ready()) {
            String[] words = readF.readLine().split("\\s");

            for (String str : words) {
                if (str.length()>6)
                    text.append(str).append(",");
            }
        }
        text.delete(text.length() - 1, text.length());
        writeF.write(text.toString());
        readF.close();
        writeF.close();

    }
}
