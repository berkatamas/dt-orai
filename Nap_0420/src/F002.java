// bevezetés/2. feladat
/*
Hozz létre egy egész számokat tartalmazó tömböt egy 20 és 30 közé eső random értékkel.
Ezután töltsd fel a tömb összes elemét 1000 és 2000 közé eső random egész értékekkel,
majd határozd meg a tömb elemeinek az összegét és az átlagértékét!
 */

import java.util.Random;

public class F002 {
    // random
    static Random rnd = new Random(); // konstruktor hívással hozom létre mivel referencia típusú, mindig egy statikus random változó legyen

    public static void main(String[] args) {

        short[] szamok = new short[rnd.nextInt(20,31)]; //nextInt véletlenszám generálás alsó és felső határ között

        for (int i = 0; i < szamok.length; i++) {
            szamok[i] = (short)rnd.nextInt(1000,2001); // (short) Az eredeti rnd short típusú, a nextInt pedig int. Ezért kasztolással short-á alakítom.
        }

        // összeg + átlagképzés
        int szamokOsszege = 0;
        for (int i= 0; i < szamok.length; i++){
            szamokOsszege += szamok[i];
        }
        System.out.println("A számok összege: " + szamokOsszege);
        System.out.println("A számok átlaga: " + (float)szamokOsszege/szamok.length);


        // for in ciklus: ciklusváltozó nélkül végig tudunk menni egy tömb elemein, anélkül, hogy indexelni kellene a tömböt
        int szamokOsszege2 = 0;
        for (int ertek : szamok) { //a teljes számok tömbön végigmegy mindenképp
            szamokOsszege2 += ertek;
        }
        System.out.println("A számok összege: " + szamokOsszege2);

    }
}
