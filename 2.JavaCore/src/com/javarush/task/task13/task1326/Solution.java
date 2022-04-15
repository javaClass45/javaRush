package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        Scanner scan = new Scanner(new FileInputStream(filePath));
        List<Integer> array = new ArrayList<>();

        while (scan.hasNext()) {
           int i = scan.nextInt();
            if ((i % 2) == 0)  array.add(i);
        }
        scan.close();

        array.sort(Comparator.naturalOrder());
        array.forEach(System.out::println);


    }
}
