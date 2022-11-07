package com.interview.task116;

import com.test.stroki.Str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GivenList {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("John", "Bob", "Anna", "Dmytro",
                "Piter", "David", "Igor");

        System.out.println(processTheList(nameList));

    }

    public static List<String> processTheList(List<String> nameList) {
        return nameList.stream().map(x -> x.substring(1)).sorted()
                .collect(Collectors.toList());

    }



}
