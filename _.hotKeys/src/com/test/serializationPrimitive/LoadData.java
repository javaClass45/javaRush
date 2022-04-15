package com.test.serializationPrimitive;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadData {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileIS = new FileInputStream("d:\\save1.dat");
        ObjectInputStream objectIS = new ObjectInputStream(fileIS);

        SavedGame savedGame = (SavedGame) objectIS.readObject();

        System.out.println(savedGame);


    }
}
