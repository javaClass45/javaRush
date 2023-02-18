package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/* 
Нити и байты
*/

//  d:/j1/task1823-1.txt
//  d:/j1/task1823-2.txt
//  d:/j1/task1823-3.txt


public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        List<String> files = new ArrayList<>();
       try(Scanner line = new Scanner(System.in)) {
           while (!line.hasNext("exit")) {
               files.add(line.nextLine());
           }
       }
        files.forEach(x -> {
            new ReadThread(x).start();
        });
    }

    public static class ReadThread extends Thread {
        private String file;

        public ReadThread(String fileName) {
            //implement constructor body
            this.file = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            HashMap<Byte, Integer> map = new HashMap<>();
            byte[] bytes = new byte[0];
            int max = Integer.MIN_VALUE;
            byte res = Byte.MIN_VALUE;
            try (FileInputStream in = new FileInputStream(this.file)) {
                while (in.available() > 0) {
                    bytes = new byte[in.available()];
                    in.read(bytes);
                }
            } catch (IOException e) {
            }
            for (byte b : bytes) {
                if (map.containsKey(b)) {
                    int i = map.get(b) + 1;
                    map.put(b, i);
                } else {
                    map.put(b, 1);
                }
            }
            for (Map.Entry<Byte, Integer> byteEntry : map.entrySet()) {
                if (byteEntry.getValue() > max) {
                    max = byteEntry.getValue();
                    res = byteEntry.getKey();
                }
            }
            synchronized (resultMap) {
                resultMap.put(this.file, (int) res);
            }
        }// run
    }// ReadThread
}
