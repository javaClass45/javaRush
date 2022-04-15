package com.test.serializationObj;

import java.io.Serializable;

public class Diplomacy implements Serializable {
    private String info;

    public Diplomacy(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "DiplomacyInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
