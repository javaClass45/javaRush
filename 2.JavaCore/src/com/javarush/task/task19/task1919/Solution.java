package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
d:\\1.txt
*/

public class Solution {


    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> myMap = new TreeMap<>();
        String file = args[0];
        BufferedReader fReder = new BufferedReader(new FileReader(file));

        while (fReder.ready()) {
            String line = fReder.readLine();
            String[] words = line.split(" ");
            if (!(myMap.containsKey(words[0]))) {
                myMap.put(words[0], Double.parseDouble(words[1]));
            } else {
                myMap.put(words[0], myMap.get(words[0]) + Double.parseDouble(words[1]));
            }
        }
        fReder.close();

        for (Map.Entry<String, Double> mPrint : myMap.entrySet()) {
            System.out.println(mPrint.getKey() + " " + mPrint.getValue());
        }
    }
}
