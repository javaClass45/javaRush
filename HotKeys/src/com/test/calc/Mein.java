package com.test.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// для проверки работы методов калькулатора особенно глянуть как считает проценты
// применимо к package com.javarush.task.task06.task0612;

public class Mein {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("введи переменную А- ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("введи переменную Б- ");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("% - " + Calc.percent(a, b));
        System.out.println("/ - " + Calc.division(a, b));
        System.out.println("+ - " + Calc.plus(a, b));
        Mein me = new Mein();
        System.out.println("sqrt-" + me.calcSqrt(11));

    }

    public double calcSqrt (double input){
        return Math.sqrt(input);

    }

}
