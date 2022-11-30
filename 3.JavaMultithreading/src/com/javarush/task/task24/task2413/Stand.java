package com.javarush.task.task24.task2413;

public class Stand extends BaseObject {
    private double speed;
    private double direction;


    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }



    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {
        double dx = speed * direction;
        x = x + dx;

//        checkBorders(radius, Arkanoid.game.getWidth() - radius + 1, 1, Arkanoid.game.getHeight() + 1);
    }


    void moveLeft() {
        direction = -1;
    }


    void moveRight() {
        direction = 1;
    }


    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }
}
