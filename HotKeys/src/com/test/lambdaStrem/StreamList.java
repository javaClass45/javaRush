package com.test.lambdaStrem;

import com.test.stroki.Link;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "travka", "zeleneet", "solnishko", "bleastit");
        Stream<String> stream = list.stream();
        Stream<String> sort = stream.sorted(Comparator.comparing(String::length));
        sort.forEach(System.out::println);



        System.out.println("\n" + "==========================================");


        Integer[] arrInt = {1, 33, 5, 7, 8, 9, 0, 12, 34, 56, 67, 78, 8990};
        Stream<Integer> tsrInt = Arrays.stream(arrInt);
        //Collections.sort(tsrInt,Comparator.comparingInt(Integer::compare.) );
        //tsrInt.forEach(System.out::print);
        Stream<Integer> si = tsrInt.sorted();
        si.forEach(x -> System.out.print(x + " "));


        System.out.println("\n" + "==========================================");

        Stream<Integer> streamArr1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> streamArr2 = Stream.of(10, 11, 12, 13, 14);
        Stream<Integer> result = Stream.concat(streamArr1, streamArr2);


        Stream<String> stroka = result.map((x) -> String.valueOf(x));

        stroka.forEach(x -> System.out.print(x + " "));
        //String str1 = stroka.stream().collect( Collectors.joining(", ") );


        Stream<Double> sRnd = Stream.generate(Math::random);
        Stream<Double> strPr = sRnd.filter(x -> (x > 0.9));
        // strPr.forEach(System.out::println); //infinite output!!!!!

        System.out.println("\n" + "==========================================");
        ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list2, "Привет", "как", "дела?");
        String min = list2.stream().min((s1, s2) -> s1.length() - s2.length()).get();
        System.out.println(min);


        System.out.println("\n" + "==========================================");
        ArrayList<String> list3 = new ArrayList<String>();
        Collections.addAll(list3, "Привет", "как", "дела?");
        String max = list3.stream().max((s1, s2) -> s1.length() - s2.length()).get();
        System.out.println(max);

        System.out.println("\n" + "==========================================");


        ArrayList<String> list4 = new ArrayList<String>();
        Collections.addAll(list4, "Привет", "как", "дела?");
        List<String> result2 = list4.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(result2);
        System.out.println("\n" + "==========================================");


        ArrayList<String> list5 = new ArrayList<String>();
        Collections.addAll(list5, "a=2", "b=3", "c=4", "d==3");
        Map<String, String> result3 = list5.stream()
                .map(e -> e.split("="))
                .filter(e -> e.length == 2)
                .collect(Collectors.toMap(e -> e[0], e -> e[1]));
        System.out.println(result3);
        System.out.println("\n" + "==========================================");

        ArrayList<String> spisok = new ArrayList<String>();
        Collections.addAll(spisok, "a=2", "b=3", "c=4", "d==3");
        String string = spisok.stream().collect(Collectors.joining(", "));
        System.out.println(string);
        System.out.println("\n" + "==========================================");

        AtomicInteger ai = new AtomicInteger(0);
        for (int i = 0; i < 10; i++) {
            System.out.println("AtomicInteger " + ai.incrementAndGet() + " ");
        }
        System.out.println("\n" + "==========================================");


        List<String> strings = new LinkedList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        strings.forEach(x -> System.out.print(x + " "));
        System.out.println("\n" + "==========================================");

        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        listA.stream().map((x) -> x * x).forEach(System.out::print);


        System.out.println("\n" + "==========================================");
        ArrayList<String> items = new ArrayList<>();
        items.add("coins");
        items.add("pens");
        items.add("keys");
        items.add("sheets");
        items.forEach(s -> System.out.println(s + " length-" +s.length()));

        System.out.println("\n" + "==========================================");
        Map<String,String> mapss = new HashMap<>(){{
            put("qwe", "asd");
            put("asd", "zxc");
            put("zxc", "vbn");
            put("vbn", "hgf");
            put("fgh", "ytr");
            put("rty", "uyt");
            put("jjk", "poi");
        }};


        for (Map.Entry<String, String> mmm:
             mapss.entrySet()) {
            System.out.println(mmm.getKey() + " : " + mmm.getValue());
        }

    }


}
