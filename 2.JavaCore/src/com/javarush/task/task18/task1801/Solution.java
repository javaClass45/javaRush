package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // читаем стороку с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream(filePath);
        int data;
        int max = 0;
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            data = inputStream.read(); // прочитать очередной байт в переменную data
            // System.out.println(data + ",");//проверка
            if (data > max) max = data;
        }
        inputStream.close(); //закрываем поток.
        System.out.println(max);
    }
}
