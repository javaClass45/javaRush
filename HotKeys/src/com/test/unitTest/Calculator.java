package com.test.unitTest;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculator {
    int a, b, c;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        System.out.println(div(20,3));
        System.out.println((double) 1/3);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int diff(int a, int b){
        return a - b;
    }

   public static int multiply(int a, int b){
        return a * b;
    }


public static double div(double a, double b){

        return a/b;
    }






}
