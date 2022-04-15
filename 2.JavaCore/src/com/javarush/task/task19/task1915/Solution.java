package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
d:\\1.txt
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String f1 = bufer.readLine();
        bufer.close();
        FileOutputStream fileWrite = new FileOutputStream(f1);

        PrintStream printStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(printStream);

        System.out.println(result);
        outputStream.writeTo(fileWrite);


        fileWrite.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

