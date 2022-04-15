package com.test.serializationObj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Territories territories = new Territories("У Испании 6 провинций, " +
                "у России 10 провинций, у Франции 8 провинций");

        Resources resources = new Resources("У Испании 100 золота, у России 80 золота," +
                " у Франции 90 золота");

        Diplomacy diplomacy = new Diplomacy("Франция воюет с Россией," +
                " Испания заняла позицию нейтралитета");

        SavedGame savedGame = new SavedGame(territories, resources, diplomacy);

        FileOutputStream fileOS = new FileOutputStream("d:\\save2.dat");
        ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);
        objectOS.writeObject(savedGame);
        objectOS.close();

    }


}
