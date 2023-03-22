package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;

/* 
Построй дерево(1)

Амиго, похоже ты уже достаточно окреп. Самое время проверить свои навыки в большой задаче!
Сегодня реализуем свое дерево немного нестандартным способом(на базе AbstractList).
Вводную информацию можешь получить используя свой любимый поисковик и текст ниже.
Элементы дерева должны следовать так как показано на картинке:

Для начала сделаем наше дерево потомком класса AbstractList с параметром типа String,
 а также реализуем интерфейсы Cloneable и Serializable.

Реализацию методов get(int index) и size() пока оставь стандартной.


Requirements:
1. Класс CustomTree должен поддерживать интерфейс Cloneable.
2. Класс CustomTree должен поддерживать интерфейс Serializable.
3. Класс CustomTree должен быть потомком класса AbstractList<String>.

*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
