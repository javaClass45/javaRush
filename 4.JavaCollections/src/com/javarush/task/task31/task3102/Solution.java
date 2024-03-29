package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Stack;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> result = new ArrayList<>();
        Stack<File> files = new Stack<>();

        files.push(new File(root));
        while (!files.empty()) {
            File current = files.pop();

            if (current.isDirectory()) {

                for (File f : current.listFiles())
                    files.push(f);
            }
            if (current.isFile())
                result.add(current.getAbsolutePath());
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        List<String> fileList = getFileTree("d:/j1/temp.txt");
        for (String filePath : fileList)
            System.out.println(filePath);
    }
}
