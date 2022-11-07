package com.test.generic;


import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.stream.Stream;

class Main {


    public static void main(String[] args) {
        Dummy d1 = new Dummy(1);
        Dummy d2 = new Dummy(true);
        Dummy d3 = new Dummy("false");


        Dummy[] dumm = new Dummy[3];
        dumm[0] = d1;
        dumm[1] = d2;
        dumm[2] = d3;

        for (Dummy dp : dumm) {
            System.out.println(dp);
        }

        String stroka = "hint: (e.g., 'git pull ...') before (p)ushing (again.";
        System.out.println(Stream.of(stroka.split("")).filter("("::equals).count());
        System.out.println(Stream.of(stroka.split("")).filter(")"::equals).count());





    }

    public static class Dummy {

        Integer a;
        Boolean b;
        String c;

        public Dummy(Integer a) {
            this.a = a;
        }

        public Dummy(Boolean b) {
            this.b = b;
        }

        public Dummy(String c) {
            this.c = c;
        }

        @Override
        public String toString() {
            return "Dummy{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c='" + c + '\'' +
                    '}';
        }
    }

}
