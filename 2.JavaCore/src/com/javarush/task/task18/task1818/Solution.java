package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneFileName = reader.readLine();
        String twoFileName = reader.readLine();
        String threeFileName = reader.readLine();


        BufferedReader readFileTwo = new BufferedReader(new FileReader(twoFileName));

        BufferedWriter writter = new BufferedWriter(new FileWriter(oneFileName, true));
        String line;

        while ((line = readFileTwo.readLine()) != null) {
            writter.write(line);
        }
        line = null;
        BufferedReader readFileThree = new BufferedReader(new FileReader(threeFileName));
         while ((line = readFileThree.readLine()) != null) {
            writter.write(line);
        }

        reader.close();
        readFileTwo.close();
        readFileThree.close();
        writter.close();

    }
}
