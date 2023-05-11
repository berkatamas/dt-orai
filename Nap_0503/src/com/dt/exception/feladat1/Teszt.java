package com.dt.exception.feladat1;

public class Teszt {
    public static void main(String[] args) {
        // checked: futás előtt lép fel
        // unchecked: futási jellegű
        // implicit: a java dobja fel
        // explicit: én idézem elő (pl throw)

        String parameter = args[0];
        Parameter p = new Parameter();
        p.setSzo(parameter);

        // itt keletkezhet hiba, beleteszem a try-ba
        try {
            p.ellenoriz();
            System.out.println(p.getSzo());
        }
        catch (SajatException e){ // ha a try-ban hiba van és a hiba SajatException típusú, vagy annak leszármazottja
            System.out.println(e.getMessage()); // kiiratom a hibaüzentetet
            p.setSzo("Teszt"); // úgy kezelem a hibát, hogy átállítom a szó tartalmát tesztre
        }
    }
}
