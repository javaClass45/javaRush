package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы

        private String name;
        private int rost;
        private int ves;
        private int age;
        private String profession;
        private int inn;

        public Human(String name) {
            this.name = name;
        }

        public Human(int rost) {
            this.rost = rost;
        }

        public Human(int rost, int ves, int age) {
            this.rost = rost;
            this.ves = ves;
            this.age = age;
        }

        public Human(int age, int inn) {
            this.age = age;
            this.inn = inn;
        }

        public Human(String name, String profession) {
            this.name = name;
            this.profession = profession;
        }

        public Human(String profession, int inn) {
            this.profession = profession;
            this.inn = inn;
        }

        public Human(String name, int rost, int ves, int age) {
            this.name = name;
            this.rost = rost;
            this.ves = ves;
            this.age = age;
        }

        public Human(int age, String profession, int inn) {
            this.age = age;
            this.profession = profession;
            this.inn = inn;
        }

        public Human(String name, int rost, int ves, int age, String profession, int inn) {
            this.name = name;
            this.rost = rost;
            this.ves = ves;
            this.age = age;
            this.profession = profession;
            this.inn = inn;
        }

        public Human(String name, String profession, int inn) {
            this.name = name;
            this.profession = profession;
            this.inn = inn;
        }
    }
}
