package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/
//  d:/j1/task1821.txt

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Byte, Integer> frequencyMap = new TreeMap<Byte, Integer>();
        FileInputStream f = new FileInputStream(args[0]);

        while (f.available() > 0) {
            byte[] buf = new byte[f.available()];
            f.read(buf);

            for (int i = 0; i < buf.length; i++) {
                if (frequencyMap.containsKey(buf[i]))
                    frequencyMap.put(buf[i], frequencyMap.get(buf[i]) + 1);
                else
                    frequencyMap.put(buf[i], 1);
            }
        }
        f.close();

        for (Map.Entry pair : frequencyMap.entrySet()) {
            System.out.println((char)((byte) pair.getKey()) + " " + pair.getValue());
        }
    }
}
