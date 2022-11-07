package com.interview.task117;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Revers {

    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(reversCol(array)));

        reversStream(array).forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println(Arrays.toString(reversStreamI(array)));

    }

    public static Integer[] reversCol(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list.toArray(arr);
    }

    public static Stream reversStream(Integer[] arr) {
        Stream<Integer> strem = Arrays.stream(arr).sorted((i1,i2) -> i2 - i1);
        return  strem;
    }


    public static Integer[] reversStreamI(Integer[] arr) {
        Stream<Integer> strem = Arrays.stream(arr).sorted((i1,i2) -> i2 - i1);
        return  strem.toArray(Integer[]::new);
    }



}
