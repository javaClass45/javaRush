package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
static {
    threads.add(new NitInfinit("NitInfinit"));
    threads.add(new NitException("NitException"));
    threads.add(new NitUra("NitUra"));
    threads.add(new NitMsg("NitMsg"));
    threads.add(new NitNumInput("NitNumInput"));
}

    public static void main(String[] args) {
        for (Thread thr : threads) {
            thr.start();
        }
//threads.get(1).start();


    }


    public static class NitInfinit extends Thread {
        public NitInfinit(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class NitException extends Thread {
        public NitException(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(100000000);

            } catch (InterruptedException e) {
                System.out.println("InterruptedException");

            }

        }
    }

    public static class NitUra extends Thread {
        public NitUra(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }

            }
        }
    }

    public static class NitMsg extends Thread implements Message {
        private boolean stop;


        public NitMsg(String name) {
            super(name);
            this.stop = false;
        }

        @Override
        public void run() {
            while (!stop) {

            }
        }

        @Override
        public void showWarning() {
            stop = true;
        }
    }


    public static class NitNumInput extends Thread {
        public NitNumInput(String name) {
            super(name);
        }

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try {
                String str;
                while (!(str = reader.readLine()).equals("N")){
                    sum += Integer.parseInt(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(sum);
        }
    }

}