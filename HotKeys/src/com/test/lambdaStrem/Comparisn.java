package com.test.lambdaStrem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class Comparisn {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Prived", "Medvedko", "kag", "dila?");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        Collections.sort(list, (o1, o2) -> o2.length() - o1.length());
        list.forEach(System.out::println);

        /*   Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(list, comp);

        */
        //System.out.println("========================================");
        Collections.sort(list, Comparator.comparingInt(String::length));
        System.out.println("==================ssylka na metod======================");
        list.forEach(System.out::println);
        System.out.println("==================lambda======================");
        list.forEach(pohersho -> System.out.println(pohersho));
        System.out.println("=============v massiv===============");
        System.out.println(Arrays.toString(list.toArray(String[]::new)));
        System.out.println("list" + list);

        // System.out.println(list);


        print();

        IncapsulatClass inc = new IncapsulatClass();
        inc.printInc();

        Comparisn c = new Comparisn();
        Comparisn.NestedClass cnc = c.new NestedClass();

        cnc.iAmNC();


        AnonimInnerClass ais = new AnonimInnerClass() {

            @Override
            public void whoAmI() {
                System.out.println("whoAmI? -" + this.getClass().toString());
            }

            public void someSpecificMethod() {
                System.out.println("Специфический метод только для первого модуля");
            }
        };

        ais.whoAmI();
        //ais.someSpecificMethod();










    } //psvm------------------------------------------

    static void print() {
        System.out.println("print");
    }


    class NestedClass {
        public void iAmNC() {
            System.out.println("I Am NC");
        }
    }


}

class IncapsulatClass {

    void printInc() {
        System.out.println("print I Am Incapsulat");
    }


}
