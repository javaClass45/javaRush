package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private final AmigoOutputStream decorator;

    public QuestionFileOutputStream(AmigoOutputStream decorator) {
        this.decorator = decorator;
    }

    @Override
    public void flush() throws IOException {
        decorator.flush();
    }

    @Override
    public void write(int b) throws IOException {
        decorator.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        decorator.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        decorator.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().equals("Д")) decorator.close();
        reader.close();

    }

    public static void main(String[] args) throws IOException {
        QuestionFileOutputStream qfos = new QuestionFileOutputStream(new AmigoOutputStream() {
            @Override
            public void flush() throws IOException {

            }

            @Override
            public void write(int b) throws IOException {

            }

            @Override
            public void write(byte[] b) throws IOException {

            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {

            }

            @Override
            public void close() throws IOException {
                System.out.println("decorator - closed");
            }
        });

        qfos.close();
    }
}

