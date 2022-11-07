package com.test.solid;

import com.test.stroki.Str;

public abstract class Transport {
    String kuzov;
    String color;

    public Transport() {
        this.kuzov = " kuzov sedan";
        this.color = " color baklazhan";
    }



    void engine() {
        System.out.println("engine dyr-dyr-dyr");
    }

    void kpp() {
        System.out.println("kpp khr-r-dyr-khr");
    }

    public static void main(String[] args) {
        Transport maz = new Transport() {
            @Override
            void engine() {
                super.engine();
            }
        };
        maz.kpp();
        maz.engine();

        Belarus trktr = new Belarus();
        trktr.print();

        K700 k700=new K700();
        k700.print();

        String pole = "pole";

        class Main{
            String a;
            void a(){
                System.out.println(" method:  a from Main");
            }
        }
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()
                + "{" +
                "kuzov='" + kuzov + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class Belarus{

    void print() {
        System.out.println("class Belarus");
    }

}class K700{

    void print() {
        System.out.println("class K700");
    }

}
