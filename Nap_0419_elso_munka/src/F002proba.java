/*
Hozz létre egy egész számokat tartalmazó tömböt egy 20 és 30 közé eső random értékkel.
Ezután töltsd fel a tömb összes elemét 1000 és 2000 közé eső random egész értékekkel,
majd határozd meg a tömb elemeinek az összegét és az átlagértékét!
 */

import java.util.Random;

public class F002proba {
    public static void main(String[] args) {
        Random rand = new Random();

        //tömb random méretének megadása
        int randomTombSzama = rand.nextInt(20,30);
        System.out.print("Tömb mérete: ");
        System.out.println(randomTombSzama);

        //tömb létrehozása
        int randomTomb[] = new int[randomTombSzama];

        //tömb feltöltése random számokkal
        for (int i=0;i<randomTombSzama;i++){
            int randomFeltoltes = rand.nextInt(1000, 2000);
            randomTomb[i] = randomFeltoltes;
        }
        int szamokOsszege = 0;

        //tömb kiirasa
        System.out.println("Tömb tartalma: ");
        for (int i=0;i<randomTombSzama;i++){
            System.out.print(randomTomb[i]);
            if (randomTombSzama-i != 1){ // a felsorolás végén már ne legyen vessző
                System.out.print(", ");
            }
            szamokOsszege += randomTomb[i]; //számok összeadása
        }

        //tömb értékeinek összege
        System.out.print("\n\n--------------------------------");
        System.out.print("\nTömb értékeinek összege: ");
        System.out.println(szamokOsszege);

        //tömb értékeinek átlaga
        float szamokAtlaga =  szamokOsszege / randomTombSzama;
        System.out.print("Tömb értékeinek átlaga: ");
        System.out.print(szamokAtlaga);
        System.out.print("\n--------------------------------");
    }
}