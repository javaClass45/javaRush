package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        System.out.println("args = " + args[0]);
//        System.out.println("args = " + args[1]);
        Charset utf8 = Charset.forName("UTF-8");
        Charset windows1251 = Charset.forName("Windows-1251");

        InputStream inStream = new FileInputStream(args[0]);
        OutputStream outStream = new FileOutputStream(args[1]);


        byte[] buffer = new byte[inStream.available()];
        while (inStream.available() > 0)
        {
            inStream.read(buffer); //читаем один байт из потока для чтения
            String s = new String(buffer,windows1251);
            buffer = s.getBytes(utf8);
            outStream.write(buffer); //записываем прочитанный байт в другой поток.
        }

        inStream.close(); //закрываем потоки
        outStream.close();

    }
}
