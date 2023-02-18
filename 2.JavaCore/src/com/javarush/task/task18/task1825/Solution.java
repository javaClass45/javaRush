package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/* 
Собираем файл
*/
/*практика показала - сортировка в этой задаче не главное*/

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

//        files.forEach(System.out::println);
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
/*

        Lion.avi.part37
        Lion.avi.part7
        Lion.avi.part27
        Lion.avi.part17
        Lion.avi.part1
        Lion.avi.part3
        Lion.avi.part2
        Lion.avi.part11
        end

        Lion.avi.part1
        Lion.avi.part11
        Lion.avi.part17
        Lion.avi.part2
        Lion.avi.part27
        Lion.avi.part3
        Lion.avi.part37
        Lion.avi.part7

*/

