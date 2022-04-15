package com.test.serializationObj;

import java.io.Serializable;

public class Territories implements Serializable {
    private String info;

    public Territories(String info) {
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
        return "TerritoriesInfo{" +
                "info='" + info + '\'' +
                '}';
    }

}
