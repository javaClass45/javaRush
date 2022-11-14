package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] example = new Solution[2];

        example[0] = new Solution();
        example[1] = new Solution();
        example[0].innerClasses[0] = example[0].new InnerClass();
        example[0].innerClasses[1] = example[0].new InnerClass();
        example[1].innerClasses[0] = example[1].new InnerClass();
        example[1].innerClasses[1] = example[1].new InnerClass();

        return example;
    }

    public static void main(String[] args) {

    }
}
