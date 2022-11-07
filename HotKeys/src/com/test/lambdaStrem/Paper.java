package com.test.lambdaStrem;

public interface Paper {
    default void show() {
        System.out.println("default show()");
    }

}
