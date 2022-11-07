package com.test.stroki;

import java.util.stream.Stream;

public class Skobki {

    public static void main(String[] args) {

        String str = "ввязаться (работать) в этой объектно ориентированной " +
                "среде и были придуманы обертки (wrappers) для примитивных типов" +
                " (Integer, Character, Double, Boolean...)";

        char[] chArr = str.toCharArray();
        int i = 0, j = 0;
        char c = '(';
        char c1 = ')';
        for (int k = 0; k < chArr.length; k++) {
            if (chArr[k] == c) i++;
            if (chArr[k] == c1) j++;
        }
        System.out.println("B строке: " + str);
        System.out.println("прямых скобок -" + i);
        System.out.println("обратных скобок -" + j);

        String str1 = " Узнать ее можно обратившись к объекту String с помощью метода" +
                " доступа (accessor method) length(), который возвращает";
        System.out.println("А в строке: " + str1);
        skbk(str1);

        String str2 = "два отдельных метода mySuperSortAsc() и mySuperSortDesc() для сортировки" +
                " по возрастанию и убыванию. Или передавать какой-то параметр внутрь метода" +
                " (допустим boolean";
        System.out.println("А в строке: " + str2);

 System.out.println("(Stream) открывающих скобок - " +
         Stream.of(str2.split("")).filter("("::equals).count());

 System.out.println("(Stream) закрывающих скобок - " +
         Stream.of(str2.split("")).filter(")"::equals).count());





    }


    public static void skbk(String str){
        int i = 0, j = 0;
        char c = '(';
        char c1 = ')';
        for (int k = 0; k < str.length() ; k++) {
            if(str.charAt(k) == c) i++;
            if(str.charAt(k) == c1) j++;
        }
        System.out.println("прямых скобок -" + i);
        System.out.println("обратных скобок -" + j);

    }


}
