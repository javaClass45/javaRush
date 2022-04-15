package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код

        ArrayList<String>[] strArr = new ArrayList[2];
        strArr[0] = new ArrayList<>();
        strArr[1] = new ArrayList<>();
        strArr[0].add("qw");
        strArr[0].add("as");
        strArr[0].add("zx");
        strArr[1].add("er");
        strArr[1].add("df");
        strArr[1].add("cv");

        return strArr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}