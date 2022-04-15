package com.test.serializationObj;

import java.io.Serializable;

public class Resources implements Serializable {
    private String info;

    public Resources(String info) {
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
        return "ResourcesInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
