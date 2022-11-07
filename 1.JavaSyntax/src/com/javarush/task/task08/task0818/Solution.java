package com.javarush.task.task08.task0818;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> employers = new HashMap<>();
        employers.put("Лидия Аркадьевна Бубликова", 100);
        employers.put("Иван Михайлович Серебряков", 200);
        employers.put("Дональд Джон Трамп", 300);
        employers.put("Алексей Андреевич Ермаков", 400);
        employers.put("Максим Олегович Архаров", 500);
        employers.put("Виктор Михайлович Стычкин", 600);
        employers.put("Виктор Олегович Ермаков", 700);
        employers.put("Максим Андреевич Трамп", 800);
        employers.put("Дональд Олегович Стычкин", 900);
        employers.put("Алексей Аркадьевич Бубликов", 1000);
        return employers;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        for (Iterator<Map.Entry<String, Integer>> pair = map.entrySet().iterator(); pair.hasNext(); ) {
            Map.Entry<String, Integer> entry = pair.next();

            if (entry.getValue() < 500) {
                pair.remove();
            }
        }


        System.out.println(map);
    }

    public static void main(String[] args) throws IOException {


    }
}