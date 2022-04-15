package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код


        SpecialThread st1 = new SpecialThread();
        SpecialThread st2 = new SpecialThread();
        SpecialThread st3 = new SpecialThread();
        SpecialThread st4 = new SpecialThread();
        SpecialThread st5 = new SpecialThread();

        Thread tread1 = new Thread(st1);
        Thread tread2 = new Thread(st2);
        Thread tread3 = new Thread(st3);
        Thread tread4 = new Thread(st4);
        Thread tread5 = new Thread(st5);

        list.add(tread1);
        list.add(tread2);
        list.add(tread3);
        list.add(tread4);
        list.add(tread5);


    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
