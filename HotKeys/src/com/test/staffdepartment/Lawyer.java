package com.test.staffdepartment;

public class Lawyer implements Employee{


    public Lawyer() {
        System.out.println("priniali na rabotu Urista");
    }

    @Override
    public void work() {
        System.out.println("Lawyer work as urist");
    }
}
