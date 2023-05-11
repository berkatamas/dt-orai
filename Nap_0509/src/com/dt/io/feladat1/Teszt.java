package com.dt.io.feladat1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Teszt {
    public static void main(String[] args) {
        ArrayList<Kiraly> kiralyok = new ArrayList<>();

        try {
            Reader bejovoAdatfolyam = new FileReader("kiralyok.csv");
            BufferedReader olvaso = new BufferedReader(bejovoAdatfolyam);
            String sor = ""; //ebben tárolom el a kiolvasott sort
            while (true){ //nem tudom, hogy hányszor kell beolvasni
                //olvasok egy sort
                sor = olvaso.readLine();
                if(sor == null) break;

                System.out.println("sor: " + sor);
                String[] mezok = sor.split(","); // feldarabolom a sort a vessző karakter mentén
                System.out.println("mezők: "  + Arrays.toString(mezok));
                Kiraly ujKiraly = new Kiraly( // a beolvasott adatokból létrehozom az új királyt
                        mezok[0],
                        Integer.parseInt(mezok[1].trim()),
                        Integer.parseInt(mezok[2].trim())
                );
                kiralyok.add(ujKiraly); // a listához adom az új királyt
            }
            //nyitott adatfolyamok lelárása
            olvaso.close();
            bejovoAdatfolyam.close();


        } catch (FileNotFoundException e) { // nem létező fájl hibához
            System.out.println("A fájl nem található!");

        } catch (IOException e) { //egyéb, a beolvasás során keletkező hibához
            System.out.println("Sikeres beolvasás, feldolgozási hiba!");
        }

// RENDEZÉS
        Collections.sort(kiralyok, new Comparator<Kiraly>() {
            @Override
            public int compare(Kiraly o1, Kiraly o2) {
                // uralkodás kezdetének éve szerint növekvő sorrend
                return o1.getUralkodasKezdete() - o2.getUralkodasKezdete();
            }
        });
        System.out.println(" Rendezett lista: " + kiralyok.toString());

//KIÍRÁS
        try {
            Writer kimenoAdatfolyan = new FileWriter("rendezett-kiralyok.csv", false); //false: felülír, true: fájl végére hozzáfűz
            PrintWriter iro = new PrintWriter(kimenoAdatfolyan); // szűrő a kiíráshoz
            for (Kiraly k: kiralyok){
                StringBuilder sb = new StringBuilder();
                sb.append(k.getNev());
                sb.append(", ");
                sb.append(k.getUralkodasKezdete());
                sb.append(", ");
                sb.append(k.getUralkodasVege());
                iro.println(sb.toString()); //kiírom az sb szöveges tartalmát egy fájlba (pufferbe)
                //iro.flush(); // a buffer tartalmát azonnal kiírja a fájlba
            }
            iro.close();
            kimenoAdatfolyan.close();

        } catch (IOException e) {
            System.out.println("Hiba a fájl írása során!");
        }
    }
}
