package com.test.serialz;

import java.io.*;

public class Operations {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject obj = new DataObject();
        obj.setMyData("hahaha");
        File file = new File("d:\\store.bin");
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(obj);
        so.flush();
        so.close();

        FileInputStream fi = new FileInputStream("d:\\store.bin");
        ObjectInputStream si = new ObjectInputStream(fi);
        DataObject objNew = (DataObject) si.readObject();
        si.close();
        System.out.println(objNew + "\n setMyData=" + objNew.getMyData());



    }
}
