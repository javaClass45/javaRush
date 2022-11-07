package com.test.generic;

import java.util.Arrays;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {

        GenClass<Integer, String> gci = new GenClass<>
                (new Integer[]{0, 1, 2, 3, 4, 5, null, 6, 7, 8, 9},"strokaInteger" );
        GenClass<Double, String> gcd = new GenClass<>(new Double[]{1.2, 1.3, 1.4, 1.5});
        GenClass<String, String> gcs = new GenClass<>(new String[1]);

        gcs.setArr(new String[]{"safd", "sdfvdf ", "sdfsdf", "sdfgsdfgs"});

        System.out.println(Arrays.toString(gci.getArr()));
        System.out.println(Arrays.toString(gcd.getArr()));
        System.out.println(Arrays.toString(gcs.getArr()));

        gcd.type = "strokaDouble";
        gcs.type = "strokaString";

        gcs.arr[0] = "asfsafsafd";
        gcs.arr[1] = "asfdsdfgdfd";

        System.out.println(gcs.arr[1]);

        List<GenClass> list = Arrays.asList(gci, gcd, gcs);
        list.forEach(System.out::println);

        MainClass mainClass = new MainClass();


    }

    // Объявление обобщённого класса


    public static class GenClass<G,T> {
        private G[] arr;
        private T type;

        public GenClass(G[] arr) {
            this.arr = arr;
        }

        public GenClass(G[] arr, T type) {
            this.arr = arr;
            this.type = type;
        }

        public G[] getArr() {
            return arr;
        }

        public void setArr(G[] arr) {
            this.arr = arr;
        }

        @Override
        public String toString() {
            return "GenClass{" +
                    "arr=" + Arrays.toString(arr) +
                    ", type=" + type +
                    '}';
        }
    }

}


