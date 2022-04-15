package com.test.herota;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class NewHerota extends InputStream {
    InputStream bayt;

    public NewHerota(InputStream bayt) {
        this.bayt = bayt;
    }

    @Override
    public int read() throws IOException {
        return bayt.read();
    }

    public static void main(String[] args) throws IOException {
        NewHerota nh = new NewHerota(new FileInputStream("d:\\test.txt"));
        nh.read();
        Integer d = new Integer(23);
        System.out.println(d);
d.print();
        d.setI(4);
        System.out.println(d);
        d.print();
    }


    public static class Integer {
        int i;

        public Integer(int i) {
            this.i = i;
        }

//        @Override
//        public String toString() {
//            return "Integer{" +
//                    "i=" + i +
//                    '}';
//        }

        public int getI() {
            return i;
        }
        public void print() {
            System.out.println("print: "+ this.i);
        }

        public void setI(int i) {
            this.i = i;
        }

    }

}
