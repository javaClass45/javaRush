package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String idS = reader.readLine();
            if (idS.isEmpty()) break;
            String name = reader.readLine();


            int id = Integer.parseInt(idS);
            map.put(name, id);
            if (name.isEmpty()) break;
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}

