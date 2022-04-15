package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream(filePath);
        int counter = 0;
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            if (inputStream.read() == ',') counter++;
        }
        System.out.println(counter);
        inputStream.close();
        reader.close();
    }
}
