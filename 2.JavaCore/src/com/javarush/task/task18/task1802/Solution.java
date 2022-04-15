package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // читаем стороку с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream(filePath);
        int data = inputStream.read();// прочитать первый байт в переменную data
       // System.out.println("1я-" + data);//проверка
        int min = data;
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            if (data < min) min = data;
            //System.out.println(data + ",");//проверка
            data = inputStream.read();// прочитать очередной байт в переменную data
        }
        inputStream.close(); //закрываем поток.
        System.out.println(min);
    }
}
