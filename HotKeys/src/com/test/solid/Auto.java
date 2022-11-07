package com.test.solid;

public interface Auto {

    default void driver() {
        System.out.println("raketa");
    }

    void tupometod();

}
