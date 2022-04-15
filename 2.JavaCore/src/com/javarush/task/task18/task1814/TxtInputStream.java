package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    FileInputStream file;

    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);
        if (fileName.endsWith(".txt")) {
            this.file = new FileInputStream(fileName);
        } else {
            super.close();
            throw new UnsupportedFileNameException();

        }
    }

    @Override
    public int read() throws IOException {
        return file.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return file.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return file.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return file.skip(n);
    }

    @Override
    public int available() throws IOException {
        return file.available();
    }

    @Override
    public void close() throws IOException {
        file.close();
    }

    @Override
    public FileChannel getChannel() {
        return file.getChannel();
    }

    public static void main(String[] args) {

    }
}

