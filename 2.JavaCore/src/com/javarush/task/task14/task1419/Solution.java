package com.javarush.task.task14.task1419;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
//2-ParseException
        try {
            throw new ArrayIndexOutOfBoundsException();

        } catch (Exception e) {
            exceptions.add(e);
        }

//3- NullPointerException
        try {

            throw new FileNotFoundException();

        } catch (Exception e) {
            exceptions.add(e);
        }


//4- UnsupportedAudioFileException
        try {

            throw new NullPointerException();

        } catch (Exception e) {
            exceptions.add(e);
        }


//5- FileNotFoundException
        try {
            throw new NumberFormatException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //6-NumberFormatException
        try {

            throw new IllegalArgumentException();


        } catch (Exception e) {
            exceptions.add(e);
        }

        //7-ArrayIndexOutOfBoundsException
        try {

            throw new ClassCastException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        //8-ArrayStoreException
        try {
            throw new ArrayStoreException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        //9-ClassCastException
        try {
            throw new ConcurrentModificationException();

        } catch (Exception e) {
            exceptions.add(e);
        }


        //10-NegativeArraySizeException
        try {
            throw new EmptyStackException();

        } catch (Exception e) {
            exceptions.add(e);
        }



    }
}
