package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;
        int max = 1;
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }


        for (int i = 0; i < 9; i++) {
            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
                n++;
            } else {
                list.add(n);
                n = 1;
            }
            if (i == 8) list.add(n);
        }


        for (int elem : list) {
            System.out.println("list- " + elem);
            if (elem > max) {
                max = elem;
            }

        }

        System.out.println(max);


    }
}
