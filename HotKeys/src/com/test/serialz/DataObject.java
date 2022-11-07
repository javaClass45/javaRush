package com.test.serialz;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class DataObject extends NonSerializable implements Serializable {
    private final int i = 5;
    private final String string = "aaaa";
    private final transient String[] myData = {"adsafsfde", "sdfcsdafvsfs",
            "sdfvasdfgsdfgsd"};// не дампится
    CustomObject co = new CustomObject();

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // дампим все что есть в объекте
        out.writeObject(getMyData());
    }

    private void readObject(ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        in.defaultReadObject();
        setMyData((String) in.readObject());

    }

    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", string='" + string + '\'' +
                ", myData=" + Arrays.toString(myData) +
                ", co=" + co +
                '}';
    }


}
