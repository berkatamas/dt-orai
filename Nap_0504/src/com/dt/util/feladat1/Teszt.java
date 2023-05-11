package com.dt.util.feladat1;

import java.util.*;

public class Teszt {
    public static void main(String[] args) {
//ArrayList
        // Az ArrayList-ben <> között adjuk meg az elemek típusát
        ArrayList<String > lista = new ArrayList<String>();

        //add(elem): elem hozzáadása a lista végéhez
        lista.add("alma");
        lista.add("körte");
        lista.add("szilva");
        lista.add("cseresznye");

        // a. kiírás for ciklussal
        for (int i = 0; i < lista.size(); i++) {
            String elem = lista.get(i);
            System.out.println(elem);
        }

        // b. enumerációval: sorban kiolvasom az elemeket
        Enumeration<String> enumeration = Collections.enumeration(lista);
        while (enumeration.hasMoreElements()){
            String elem = enumeration.nextElement();
            System.out.println(elem);
        }

        // c. rendezzük sorba
        // A Collections segédfüggvényen keresztül rendezem a listát
        Collections.sort(lista);
        System.out.println("Rendezett lista: " + lista);
        Collections.shuffle(lista);
        System.out.println("Rendezetlen lista: " + lista);
        System.out.println("A legkisebb: " + Collections.min(lista));
        System.out.println("A legnagyobb: " + Collections.max(lista));

// VEKTOR
        Vector<String> vektor = new Vector<String>();
        vektor.add("kutya");
        vektor.add("almafa");
        vektor.add("kecske");
        vektor.add("balta");


        for (int i = 0; i < vektor.size(); i++) {
            System.out.println(vektor.get(i));
        }
        Enumeration<String> felsorolas = Collections.enumeration(vektor);
        while(felsorolas.hasMoreElements()){
            System.out.println(felsorolas.nextElement());
        }
        Collections.sort(vektor);

// TÖMB
        String[] tomb = {"kutya", "macska", "egér"};
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }   
        Arrays.sort(tomb);
        List<String> konvertaltTomb = Arrays.asList(tomb);
        Collections.shuffle(konvertaltTomb);


    }
}
