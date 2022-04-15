package com.test.serializationPrimitive;

import com.test.serializationPrimitive.SavedGame;

import java.io.*;

public class LoadData {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileIS = new FileInputStream("d:\\save1.dat");
        ObjectInputStream objectIS = new ObjectInputStream(fileIS);

        SavedGame savedGame = (SavedGame) objectIS.readObject();

        System.out.println(savedGame);


    }
}
