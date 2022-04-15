package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
-e d:\\1.txt d:\\2.txt
-d d:\\2.txt d:\\1.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        if (args[0].startsWith("-e")) {
            FileInputStream reader = new FileInputStream(args[1]);
            FileOutputStream writer = new FileOutputStream(args[2]);
            int i;
            while((i=reader.read())!= -1){
                writer.write(i+1);
            }
            reader.close();
            writer.close();
        }


        if (args[0].startsWith("-d")) {
            FileInputStream reader = new FileInputStream(args[1]);
            FileOutputStream writer = new FileOutputStream(args[2]);
            int i;
            while((i=reader.read())!= -1){
                writer.write(i-1);
            }
            reader.close();
            writer.close();
        }
    }
}
