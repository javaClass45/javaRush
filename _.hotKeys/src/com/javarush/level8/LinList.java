package com.javarush.level8;

import java.util.LinkedList;

public class LinList {

    public static void main(String[] args) {
        String st1 = "srfgvedg";
        String st2 = "srfgsvedg";
        String st3 = "srfgsdvedg";
        String st4 = "srfgTHTRvedg";
        String st5 = "srfSDgvedg";
        String st6 = "FDDD";


        LinkedList<String> eBio = new LinkedList<>();
        eBio.add(st1);
        eBio.add(st2);
        eBio.add(st3);
        eBio.add(st4);
        eBio.add(st5);
        eBio.add(st6);

        System.out.println(eBio);

    }

}
