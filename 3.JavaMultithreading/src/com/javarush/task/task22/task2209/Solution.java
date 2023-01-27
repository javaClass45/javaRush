package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.Scanner;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) {
        //...  "d:/j1/task2209.txt"
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFile = null;
        try {
            pathFile = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String str = null;
        try {
            str = inputSting(pathFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] arr = str.trim()
                .split(" ");
        StringBuilder result = getLine(arr);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        ;
        if (words == null || words.length == 0) return result;
        if (words.length == 1 || words[0].equals("")) return result.append(words[0]);




        for (int i = 0; i < words.length - 1; i++) {
            for (int j = (i + 1); j < words.length; j++) {
                if (words[i].substring(words[i].length() - 1)
                        .equalsIgnoreCase(words[j].substring(0,0))) {
                    result.append(words[i]).append(" ").append(words[j]);
                }
                ;

            }

        }


        return result;
    }

    public static String inputSting(String s) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(s));
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }
        scanner.close();
        return String.valueOf(sb);
    }


}
