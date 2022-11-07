package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        getTokens("level22.lesson13.task01", ".");
        /*System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));*/


    }

    public static String[] getTokens(String query, String delimiter) {

        StringTokenizer tokenizer =
                new StringTokenizer(query, delimiter);

        int i = 0;
        String[] token = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens()) {
            token[i] = tokenizer.nextToken();
            i++;
        }


        return token;
    }
}
