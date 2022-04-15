package com.test.herota;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class NewBF extends BufferedReader {
    BufferedReader reader;
    InputStreamReader inputStreamReader;
public static Reader re;
    public static void main(String[] args) {

NewBF nbf = new NewBF(re, 2);

        System.out.println(nbf);
    }


    public NewBF(Reader in, int sz) {
        super(in, sz);
    }

    @Override
    public String toString() {
        return "NewBF{" +
                "reader=" + reader +
                ", inputStreamReader=" + inputStreamReader +
                '}';
    }
}
