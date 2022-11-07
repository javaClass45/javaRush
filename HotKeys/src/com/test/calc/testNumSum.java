package com.test.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testNumSum {
    public static void main(String[] args) {
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
