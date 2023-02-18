package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        List<String> files = new ArrayList<>();
        FileInputStream fileInputStream = null;
//        String nextFileName = null;
        //Читаем файлы пока не "end"
        try(Scanner line = new Scanner(System.in)) {
            while (!line.hasNext("end")) {
                files.add(line.nextLine());
            }
        }

//        while (true) {
//            if ("end".equals(nextFileName = scanner.nextLine())) break;
//            else files.add(nextFileName);
//        }

//        scanner.close();
        //Сортируем коллекцию
                files.sort(String::compareToIgnoreCase);

//        Collections.sort(files, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.toString().compareTo(o2.toString());
//            }
//        });

        files.forEach(System.out::println);
        //Выходной файловый поток
        String outputFileName = files.get(0).split(".part")[0];
        FileOutputStream fileOutputStream = new FileOutputStream(outputFileName);
        //Сливаем файлы
        for (String partsFileNames : files) {
            fileInputStream = new FileInputStream(partsFileNames);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileOutputStream.write(buffer);
            fileInputStream.close();
        }
        fileOutputStream.close();
        System.out.println("Объединение файлов выполнено!");
    }
}


/*
* Задача успешно прошла тестирование!
*   Вы решили задачу лучше, чем 57% учеников.
*  Вам удалось ее решить с 1 попытки.
*  Среднее количество попыток для этой задачи 3.47.
*  Всего эту задачу решили 19335 учеников.*/

