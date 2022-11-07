package com.test.stroki;

import org.w3c.dom.Node;

import java.awt.List;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class Str {
    public static void main(String[] args) {

        String s = "работать со строкой, как с массивом символов";
        Integer[] arr = {25, 15, 658, 232, 23, 50};
        System.out.println(Arrays.toString(arr));
        System.out.println("arr.hashCode " + arr.hashCode());
        arr[1] = 0;
        System.out.println("arr.hashCode " + arr.hashCode());
        System.out.println(Arrays.toString(arr));


        char[] arrS = s.toCharArray();


        for (Integer c : arr) {

            System.out.print(Character.isDigit(c) + "_");
        }
        System.out.println();
        for (char c : arrS) {

            System.out.print(c + "_");
        }
        System.out.println();

        LinkedList<String> spisok = new LinkedList<>();


        Collections.addAll(spisok, "qwe", "asd", "zxc", "qsc", "zse", "dsa");

        spisok.stream().map(String::toUpperCase).peek((e) -> System.out.print("," + e)).
                collect(Collectors.toList());
        System.out.println();

        spisok.forEach(System.out::println);
        System.out.println();



        HashSet<String> hss = new HashSet<String>(Arrays.asList("sd","ddfsd","sdfs"));



        Comparator<Integer> comparator = Comparator.comparingInt(o -> o);
        comparator.hashCode();





        AtomicInteger atomicInteger = new AtomicInteger();

    }

    private static void hm() {
        HashMap<String, Integer> mapa = new HashMap<>() {{
            put("str", 1);
            put("str1", 2);

        }};
    }


}
