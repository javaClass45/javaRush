package com.test.lambdaStrem;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String [] a) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.print("Выводит все числа: ");
        evaluate(list, (n)->true);
        System.out.print("Не выводит ни одного числа: ");
        evaluate(list, (n)->false);
        System.out.print("Вывод четных чисел: ");
        evaluate(list, (n)-> n%2 == 0 );
        System.out.print("Вывод нечетных чисел: ");
        evaluate(list, (n)-> n%2 == 1 );
        System.out.print("Вывод чисел больше 5: ");
        evaluate(list, (n)-> n > 5 );




    }
    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer t: list) {
            if(predicate.test(t)) {
                System.out.print(t + " ");
            }
        }
        System.out.println();

    }
}