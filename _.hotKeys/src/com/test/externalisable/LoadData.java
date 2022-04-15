package com.test.externalisable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadData {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileIS = new FileInputStream("D:\\save3.dat");
        ObjectInputStream objectIS = new ObjectInputStream(fileIS);

        UserInfo ui = (UserInfo) objectIS.readObject();

        System.out.println(ui);

        objectIS.close();

    }
}
