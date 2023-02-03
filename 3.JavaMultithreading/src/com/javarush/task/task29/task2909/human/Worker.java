package com.javarush.task.task29.task2909.human;

public class Worker extends Human {
//    private Human human;
    private double salary;
    public String company;

    public Worker(String name, int age) {
        super(name, age);
//        human = new Human(false);
    }

    public void live() {
        work();
    }

    private void work() {
        
    }


    public double getSalary() {
        return salary;
    }

    public void setSlr(double salary) {
        this.salary = salary;
    }
}