package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countPas = 0;
        while (true) {
            String s = reader.readLine();
            if (s.equals("helicopter")) {
                result = new Helicopter();
                reader.close();
                break;
            }
            else {
                if (s.equals("plane")) {
                    countPas = Integer.parseInt(reader.readLine());
                    result = new Plane(countPas);
                    reader.close();
                    break;
                }
            }

        }


    }
}
