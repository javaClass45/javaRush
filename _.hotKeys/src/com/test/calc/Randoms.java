package com.test.calc;

import java.util.Arrays;

public class Randoms {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < 30; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(i + "-й элемент " + arr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < 30; i++) {
            System.out.println(i + "-й элемент " + arr[i]);
        }
    }
}
