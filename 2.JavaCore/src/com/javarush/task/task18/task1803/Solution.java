package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // читаем стороку с консоли
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> max = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream(filePath);
        int data;
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            list.add(inputStream.read());// прочитать очередной байт в переменную data
        }
        Collections.sort(list); //сортировка в порядке возростания
        int n = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == list.get(i)) {
                n++;
            } else {
                max.put(list.get(i - 1), n);
                n = 1;
            }
            if (list.get(i - 1) == list.get(i) && i == list.size() - 1) max.put(list.get(i), n);
        }

        /*
        for (Map.Entry pair : max.entrySet()) {
            System.out.println(pair);

        }*/

        int m = 0;
        for (Map.Entry entry : max.entrySet()) {
            if ((int) entry.getValue() > m) m = (int) entry.getValue();
        }

        for (Map.Entry entry : max.entrySet()) {
            if (entry.getValue().equals(m)) System.out.print(entry.getKey() + " ");
        }


        inputStream.close(); //закрываем
        reader.close();

    }
}

