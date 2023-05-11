package com.dt.oop;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
// SINGLETON
        // 1. szüntessük meg a publikus létrehozás lehetőségét
        //Singleton s1 = new Singleton();
        //Singleton s2 = new Singleton();

        //Singleton.instance = null; // a final miatt innen nem lesz írható

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance(); //ugyanazt a példányt kapom vissza mint s1-ben
        s1.addContent("s1 példány ");
        s2.addContent("s2 példány ");
        System.out.println(s1.getContent());
        System.out.println(s2.getContent());

// IMMUTABLE
        String[] words = new String[2];
        words[0] = "alma";
        words[1] = "korte";

        Immutable i1 = new Immutable(words);
        words[0] = "almafa";
        //i1.words[0] = "Módosított szó"; -> ezt úgy lehet kivédeni ha használom a private-ot

        String[] taroltSzavak = i1.getWords();
        taroltSzavak[0] = "Új érték";
        System.out.println(Arrays.toString(i1.getWords()));

        String elsoSzo = i1.getWords(0);
        elsoSzo = "Módosítom";

        System.out.println(Arrays.toString(i1.getWords()));
    }
}
