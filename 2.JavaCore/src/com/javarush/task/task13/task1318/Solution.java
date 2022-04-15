package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
      //  System.out.println(path);

        InputStream inStream = new FileInputStream(path);

        while (inStream.available() > 0)
        {
             char file =  (char)inStream.read(); //читаем один байт из потока для чтения
            System.out.print(file);

        }

        inStream.close(); //закрываем потоки
        reader.close();


    }
}