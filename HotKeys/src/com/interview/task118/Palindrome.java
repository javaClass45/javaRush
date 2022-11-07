package com.interview.task118;


public class Palindrome {

    public static void main(String[] args) {

        boolean isPalindrome = isPalindrome("Tenet");
        System.out.println("isPalindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        return builder.toString().equals(string);
    }



}
