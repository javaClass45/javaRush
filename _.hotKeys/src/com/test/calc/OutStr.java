package com.test.calc;

public class OutStr {
    public static void main(String[] args) {
        Building school = new School();
        Building epicentrK = new Epicentr();
        Epicentr epicentr = new Epicentr();

        System.out.println(school);
        System.out.println(epicentrK);
        Building.print("Epicentr");
        Building.print("EpicentrKK");


    }


    static class School extends Building/*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }

        public static void print(String str) {
            System.out.println(str);
        }
    }

    static class Epicentr extends Building {
        @Override
        public String toString() {
            return "EpicentrK";
        }


    }


}
