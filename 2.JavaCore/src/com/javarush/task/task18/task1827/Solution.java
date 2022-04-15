package com.javarush.task.task18.task1827;

import java.io.*;

/* 
Прайсы
-c productName price quantity
d:\\price.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //получаем с консоли путь к файлу
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        reader.close();
        if (args.length < 4 || !args[0].equals("-c")) return;
        if (args[0].startsWith("-c")) {

            //вычитать lastId из filePath
            BufferedReader readerFile = new BufferedReader(new FileReader(filePath));
            String line;
            String idStr;
            int id;
            int lastId = 0;
            while ((line = readerFile.readLine()) != null) {
                idStr = line.substring(0, 8);
                id = Integer.valueOf(idStr.trim());
                if (id > lastId) lastId = id;
            }
            readerFile.close();

            //используем FileWriter
            BufferedWriter writter = new BufferedWriter(new FileWriter(filePath, true));
            writter.newLine();
            //генерим cтроку
            String goods;

            goods = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", (++lastId), args[1], args[2], args[3]);

            writter.write(goods + "\n");

            writter.close();
        }// if args[-c]

    }//Main
}
