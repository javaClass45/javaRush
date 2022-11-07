package com.test.solid;

public class Toyota extends Transport implements Auto {


    @Override
    public void tupometod() {
        System.out.println("tupoFunkcionalMetod");
        super.kuzov = "asdcfsdfsdfsdf";

    }

    @Override
    void engine() {
        System.out.println("vguhhhh");
        super.color = "asdd";

    }

    public static void main(String[] args) {

        Toyota toyota = new Toyota();

        System.out.println(toyota);

        toyota.tupometod();
        toyota.driver();
        toyota.engine();
        toyota.kpp();
        Auto auto = new Toyota();
        auto.driver();

        Transport seat = new Toyota();
        seat.color = "red";
        Transport.main(new String[]{"a"});

        System.out.println(seat);

        Transport gonka = new Transport() {
            @Override
            void engine() {
                super.engine();
            }
        };

        gonka.kpp();
        System.out.println(gonka);

        Belarus trktr = new Belarus();
        trktr.print();

        K700 k700 = new K700();
        k700.print();


        Toyota.Carolla toyotaCorova = new Toyota.Carolla("blue");
        toyotaCorova.bibi();

    }


    static class Carolla {
        String color = new String("sdfsd");



        void bibi() {
            System.out.println("Corolla - bi-bi");
        }

        public Carolla(String color) {
            this.color = color;
        }
    }

}
