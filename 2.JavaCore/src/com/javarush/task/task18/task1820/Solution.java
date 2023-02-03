package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.StringJoiner;

/* 
Округление чисел
d:/j1/task1820-1.txt
d:/j1/task1820-2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        FileInputStream fis = new FileInputStream(name1);
        FileOutputStream fos = new FileOutputStream(name2);



        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            sb.append((char) buffer[i]);
        }

        String[] doubles = sb.toString().split(" ");
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < doubles.length; i++) {
            sj.add(String.valueOf(Math.round(Double.parseDouble(doubles[i]))));
        }

        fos.write(sj.toString().getBytes());

        fis.close();
        fos.close();
        reader.close();
    }
}
