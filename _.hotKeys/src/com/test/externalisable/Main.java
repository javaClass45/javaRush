package com.test.externalisable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOS = new FileOutputStream("D:\\save3.dat");
        ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);

        UserInfo ui = new UserInfo("Ivan", "Ivanov",
                "Ivan Ivanov's passport data");

        objectOS.writeObject(ui);

        objectOS.close();


    }

}
