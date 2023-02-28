package com.javarush.task.task31.task3110;

import java.nio.file.Paths;
import java.util.Scanner;

//d:/j1/arc.zip
//d:/j1/test.txt

public class Archiver {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.println("ввести полный путь архива:");
        String line = console.nextLine();
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(line));

         console = new Scanner(System.in);
        System.out.println("вввести путь к файлу, который будем архивировать:");
        String newArc = console.nextLine();
        zipFileManager.createZip(Paths.get(newArc));

    }


}
