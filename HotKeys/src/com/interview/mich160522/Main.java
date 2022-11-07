package com.interview.mich160522;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        String str = "Привет, привет, пока, пока, до скорого, пока-пока ";

        String[] arr = str.toLowerCase().replace(",", "").split(" ");

        System.out.println(Arrays.toString(arr));
        Map<String, Integer> mapa = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (String word : arr) {
                if (arr[i].equals(word)) count++;
            }
            mapa.put(arr[i], count);
           // System.out.println("put " + arr[i] + " i=" + i);
            count = 0;
        }
        for (Map.Entry<String, Integer> map : mapa.entrySet()) {
          if(map.getValue() > 1) System.out.println(map.getKey() + " = " + map.getValue());
        }
    }
}
