package com.zoo.animals;

public class Main {

    public static void main(String[] args) {

        Cow cowMurka = new Cow("Korova imeet Golova",
                "Nogi",
                4,
                " Roga",
                2,
                " i kopyta");



        cowMurka.whoIs(cowMurka);
        cowMurka.golos("Myyy!!, Myyyy!");

        System.out.print("может сделать - ");
        cowMurka.walk(60);


        Cat catMurzik = new Cat("Golova",
                "Nogi",
                4,
                "Murzik",
                20,
                "kogtej");



        catMurzik.whoIs(catMurzik);
        catMurzik.golos("Muayyy!!, Muayyyy!");
        System.out.print("может сделать - ");
        catMurzik.walk(6);



    }
}
