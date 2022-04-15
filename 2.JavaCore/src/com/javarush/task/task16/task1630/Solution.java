package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //напишите тут ваш код
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fileName;
        private final ArrayList<String> content;

        public ReadFileThread() {
            this.fileName = null;
            this.content = new ArrayList<>();
        }

        @Override
        public void run() {
            try {
                BufferedReader fReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                while (fReader.ready()) {
                    content.add(fReader.readLine());
                }
                fReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File " + fileName + " not found");
            } catch (IOException e) {
                System.out.println("File " + fileName + " can't read");
            }
        }

            @Override
            public void setFileName (String fullFileName){
                this.fileName = fullFileName;
            }

            @Override
            public String getFileContent () {
                StringBuffer sb = new StringBuffer();
                for (String s : content) {
                    sb.append(s).append(" ");
                }
                return sb.toString();
            }
        }
    }


