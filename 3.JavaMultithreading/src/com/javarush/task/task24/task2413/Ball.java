package com.javarush.task.task24.task2413;

public class Ball extends BaseObject{

    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;


    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
        this.isFrozen = true;
    }

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }


//     Устанавливаем новое направление движения.
//      Тут же вычисляем и новый вектор.
//      Такой подход удобно использовать при отскоках от стен.

    void setDirection(double direction) {
        this.direction = direction;

        double angel = Math.toRadians(direction);
        dx = Math.cos(angel) * speed;
        dy = -Math.sin(angel) * speed;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');
    }

    @Override
    public void move() {
        if (isFrozen) return;
        x += dx;
        y += dy;

//        checkRebound(1, Arkanoid.game.getWidth(), 1, Arkanoid.game.getHeight() + 5);
    }

//     Запускам шарик.
//     isFrozen = false.
//     Пересчитываем вектор движения (dx,dy).
    void start() {
        this.setDirection(direction);
        this.isFrozen = false;
    }

//    шарик может удариться о стенку.
//    При этом он должен от нее отскочить.
    void checkRebound(int minx, int maxx, int miny, int maxy) {

    }


    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }
}
