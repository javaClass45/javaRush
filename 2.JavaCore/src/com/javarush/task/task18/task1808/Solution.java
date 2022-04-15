package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneFileName = reader.readLine();
        String twoFileName = reader.readLine();
        String threeFileName = reader.readLine();

        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream(oneFileName);
        //Создаем потоки-записи-байт-в-файлы
        FileOutputStream firstHalf = new FileOutputStream(twoFileName);
        FileOutputStream secondHalf = new FileOutputStream(threeFileName);

        int razmer = inputStream.available();
        int half = razmer % 2 == 0 ? razmer / 2 : razmer / 2 + 1;


        while (inputStream.available() > 0) {
            byte[] bufferFirst = new byte[half];
            byte[] bufferSecond = new byte[razmer - half];
            inputStream.read(bufferFirst);
            inputStream.read(bufferSecond);
            firstHalf.write(bufferFirst);
            secondHalf.write(bufferSecond);

        }

        reader.close();
        inputStream.close();
        firstHalf.close();
        secondHalf.close();


    }
}
