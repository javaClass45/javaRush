package com.test.herota;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalssStaticsy {
    public static String[] name;
    public static int i = 0;


    public CalssStaticsy(String... name) {
        CalssStaticsy.name = name;
    }

    public CalssStaticsy() {
    }

    static {


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter Name...");
            String name = br.readLine();
            CalssStaticsy ima = new CalssStaticsy(name);

            System.out.println("name.length=" + name);
            i++;
        }


    }


}
