package com.dt.util.feladat2;

import java.awt.event.InputEvent;
import java.util.*;


public class Teszt {
    public static void main(String[] args) {
        Tanulo t1 = new Tanulo("Teszt Elek", 3.2);
        Tanulo t2 = new Tanulo("Kovács Áron", 4.8);
        Tanulo t3 = new Tanulo("Nagy Enikő", 5.0);
        Tanulo t4 = new Tanulo("Borbás Anna", 2.2);
        Tanulo t5 = new Tanulo("Kiss Flóra", 1.0);

        HashSet<Tanulo> tanulok = new HashSet<>();
        tanulok.add(t1);
        tanulok.add(t2);
        tanulok.add(t3);
        tanulok.add(t4);
        tanulok.add(t5);
        Enumeration<Tanulo> felsorolas = Collections.enumeration(tanulok);
        while (felsorolas.hasMoreElements()){
            System.out.println(felsorolas.nextElement());
        }

        List<Tanulo> tanulokLista = new ArrayList<>(tanulok);

//ANONIM BELSŐ OSZTÁLYOK
        class NevRendezes implements Comparator<Tanulo>{
            @Override
            public int compare(Tanulo o1, Tanulo o2) {
                // két tanulót kap és háromféle értéket ad vissza
                // -: o1 o2 előtt van
                // 0: o1 és o2 azonos
                // +: o1 rendezettség szempontjából o2 után van
                return o1.getNev().compareTo(o2.getNev());
            }
        }
        Collections.sort(tanulokLista, new NevRendezes());
        System.out.println("Név szerinti lista: " + tanulokLista);

        // A sortba elhelyezem közvetlenül anonim osztályként a rendezési feltételeket
        Collections.sort(tanulokLista, new Comparator<Tanulo>() {
            @Override
            public int compare(Tanulo o1, Tanulo o2) {
                double ertek = o1.getTanulmanyiAtlag() - o2.getTanulmanyiAtlag();
                if(ertek == 0) return 0;
                else if(ertek < 0) return -1;
                else return 1;
            }
        });
        System.out.println("Átlag szerinti lista: " + tanulokLista);
    }
}
