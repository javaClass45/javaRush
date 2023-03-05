package com.javarush.task.task31.task3110;

import java.util.Scanner;

public class ConsoleHelper {
    private static Scanner console = new Scanner(System.in);

    public static void writeMessage(String message) {
        System.out.println(message);
    }



    public static String readString() {
        return console.nextLine();
    }


    public static int readInt() {
        return console.nextInt();
    }

}
