package com.javarush.task.task38.task3802;

import java.io.FileNotFoundException;
import java.io.FileReader;
/*
Проверяемые исключения (checked exception)
*/

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        //напишите тут ваш код
        FileReader fileReader = new FileReader("unknown.file.txt");

    }

    public static void main(String[] args) {

    }
}