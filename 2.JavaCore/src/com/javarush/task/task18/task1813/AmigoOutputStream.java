package com.javarush.task.task18.task1813;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "D:/result.txt";
    public FileOutputStream buffer;

    public AmigoOutputStream(FileOutputStream buffer) throws IOException {
        super(fileName);
        this.buffer = buffer;
    }

    @Override
    public void write(int b) throws IOException {
        buffer.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        buffer.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        buffer.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        buffer.close();
    }

    @Override
    public FileChannel getChannel() {
        return buffer.getChannel();
    }


    @Override
    public void flush() throws IOException {
        buffer.flush();
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
