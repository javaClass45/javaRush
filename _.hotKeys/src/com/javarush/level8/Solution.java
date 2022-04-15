package com.javarush.test.level08.lesson11.home04;

import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // List<Integer> integerList = getIntegerList();
      //  System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум

        int min = array.get(0);
        for (Integer elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;


/*
    public static List<Integer> getIntegerList() {
        //Тут создать и заполнить список
        List<Integer> list=new ArrayList<Integer>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        int k;
        for (int i = 0; i < n; i++) {
            k=Integer.parseInt(reader.readLine());
            list.add(k);
        }
        return list;



    }
*/
    }
}
