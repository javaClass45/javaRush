package com.javarush.task.task22.task2213;


/*
Тетрис(9)
Если ты обратил внимание, мы пишем программу "сверху вниз".
Сначала решили, какие классы нам нужны. Затем - какие методы.
А потом уже начнем писать код этих методов.
Таким образом мы разбиваем большую задачу на множество маленьких.
Когда код всех методов будет готов, останется только проверить - так ли все работает, как должно быть.
И если надо - внести некоторые изменения.


Requirements:
1. Пересмотри созданную структуру классов и обрати внимание на порядок написания программы.
*/


public class Tetris {
    private Field field;
    private Figure figure;
    public static Tetris game;

    public static void main(String[] args) {
        game = new Tetris();
        game.run();

    }


    public void run() {

    }

    public void step() {

    }







    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }
}
