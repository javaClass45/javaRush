package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws Exception {
        if (string == null || string.isEmpty()) throw new TooShortStringException();//throw new RuntimeException();

        String[] str = string.split("\t");
        if (str.length < 3) throw new TooShortStringException();

        return str[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
