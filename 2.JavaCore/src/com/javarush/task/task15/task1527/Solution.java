package com.javarush.task.task15.task1527;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String url = reader.readLine();
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //str = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        //str = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";

        //получаем массив токенов key=value (obj=3.14 name=Amigo)
        String params = str.substring(str.indexOf("?") + 1);
        String[] splitParts;
        splitParts = params.split("&");

        //Разделяем каждый элемент в массиве splitParts на "=" и помещаем на Мар как ключ и значение
        LinkedHashMap<String, String> paramters = new LinkedHashMap<String, String>();
        for (int i = 0; i < splitParts.length; i++) {
            int posEqualChar = splitParts[i].indexOf("=");
            if (posEqualChar < 0) { //нет параметра, есть только ключ
                paramters.put(splitParts[i], null);
                continue;
            }
            String key = splitParts[i].substring(0, posEqualChar);
            String value = splitParts[i].substring(posEqualChar + 1);
            paramters.put(key, value);
        }

        //key печатаем
        for (String key : paramters.keySet()) {
            System.out.print(key + " ");
        }

        //печатаем alert
        System.out.println();
        String objParameter = paramters.get("obj");
        if (objParameter == null) {
            return;
        }

        try {
            alert(Double.parseDouble(objParameter));
        } catch (NumberFormatException e) {
            alert(objParameter);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
