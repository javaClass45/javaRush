package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Английские буквы
d:\\3.txt

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int i;
        FileInputStream reader = new FileInputStream(args[0]);
        while((i=reader.read())!= -1){
            if (((char)i >= 'A' &&  (char)i <= 'Z') || ((char)i >= 'a' &&  (char)i <= 'z')){
                count++;
            }
        }
        reader.close();
        System.out.println(count);
    }
}
