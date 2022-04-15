package com.javarush.task.task18.task1809;

import java.io.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneFileName = reader.readLine();
        String twoFileName = reader.readLine();

        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream(oneFileName);
        //Создаем потоки-записи-байт-в-файлы
        FileOutputStream writeToFile = new FileOutputStream(twoFileName);

        int size = inputStream.available();
        byte[] bufferFirst = new byte[size];
        while (inputStream.available() > 0) {
                    inputStream.read(bufferFirst);
        }

        for (int i = size-1; i >= 0; i--) {
            writeToFile.write(bufferFirst[i]);
        }

        reader.close();
        inputStream.close();
        writeToFile.close();

    }
}
