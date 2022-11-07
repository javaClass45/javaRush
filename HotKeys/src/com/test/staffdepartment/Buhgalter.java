package com.test.staffdepartment;

public class Buhgalter implements Employee{

    public Buhgalter() {
        System.out.println("Buhgalter add to state of office!!");
    }

    @Override
    public void work() {
        System.out.println("Buhgalter work and calculate paymants");
    }
}
