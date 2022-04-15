package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/

import java.util.Objects;

public class Solution {
    public static class A implements Cloneable {
        private final int i;
        private final int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            int i = this.i;
            int j = this.j;
            A a = new A(i, j);
            return a;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof A)) return false;
            A a = (A) obj;
            return getI() == a.getI() && getJ() == a.getJ();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getI(), getJ());
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private final String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), getName());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof B)) return false;
            B b = (B) obj;
            if (getI() != b.getI()) return false;
            if (getJ() != b.getJ()) return false;
            return getName().equals(b.getName());
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B implements Cloneable {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            int i = this.getI();
            int j = this.getJ();
            String name = this.getName();
            C c = new C(i, j, name);
            return c;
        }
    }

    public static void main(String[] args) {


    }
}
