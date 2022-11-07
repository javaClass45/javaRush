package com.test.hashmap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Double> hashMap = new HashMap<>() {{
            put("Djon", 3415.44);
            put("Ion", 615.454);
            put("Sloon", 4415.43);
            put("Doonjon", 1415.41);
            put("Djonson", 2415.42);
            put("Baby", 3565.48);
        }};

        for (Map.Entry<String, Double> stringDoubleEntry : hashMap.entrySet()) {
            System.out.print(stringDoubleEntry.getKey() + ":");
            System.out.println(stringDoubleEntry.getValue());
        }

        double balance = hashMap.get("Doonjon");
        hashMap.put("Doonjon", balance + 1000);
        System.out.println(hashMap.get("Doonjon"));


        List<Double> list = new ArrayList<>(Arrays.asList(3.5, 2.3, 5.6, 8.5, 5.98, 7.62, 5.45,
                5.7, 5.56, 0.308, 0.12));

        list.forEach(System.out::println);

        Set<String> strSet = new TreeSet<>(Arrays.asList("qwe", "asd", "zxc", "ert", "dfg", "cvb"));
        strSet.forEach(System.out::println);


        String[] arrStr = new String[6];
        strSet.toArray(arrStr);
        for (int i = 0; i < arrStr.length; i++) {
            hashMap.put(arrStr[i], i * 0.1);
        }

        for (Map.Entry<String, Double> me : hashMap.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        //System.out.println("\n" + "First TreeMap" + "\n");
        Map<String, Double> tm = new TreeMap<>();
        tm.putAll(hashMap);

        System.out.println("\n" + "TreeMap" + "\n");
        for (Map.Entry<String, Double> me : tm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }


        HashMapDemo hmd = new HashMapDemo();
        hmd.sort(hashMap);

        System.out.println("\n" + "LinkedHashMap" + "\n");
        for (Map.Entry<String, Double> me : hmd.sort(hashMap).entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }


        System.out.println("\n" + "Sorted Strem HashMap" + "\n");
        Map<String, Double> hm;// = new HashMap<>();

        hm = tm.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> x, TreeMap::new));
        for (Map.Entry<String, Double> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }


        System.out.println("\n" + "stringList.addAll" + "\n");
        List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<String> stringList = new ArrayList<String>
                (Arrays.asList("qaz", "wsx", "edc", "rfv", "tgb", "yhn", "ujm"));
        Map<Integer, String> map = new HashMap<>();
        for (Integer i :
                integerList) {
            map.put(i, null);
        }
        int i = 0;
        for (Map.Entry<Integer, String> me : map.entrySet()) {
            if (i + 1 > stringList.size()) return;
            map.put(me.getKey(), stringList.get(i++));
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        ConcurrentHashMap<String, String> csm = new ConcurrentHashMap<>();

//        Collections.addAll(csm.keySet("qaz","wsx", "edc", "rfv", "tgb", "yhn"),
//                "asd","asda","sddsfgedrfg","grtfgthytj","tytu","qasadasfa");

    } //psvm

    public Map<String, Double> sort(Map<String, Double> hashMap) {
        Map<String, Double> lhm;// = new LinkedHashMap<>();
        lhm = hashMap.entrySet().stream().sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> x, LinkedHashMap::new));
        return lhm;
    }

}
