package com.dt.mftanfolyam.oop.feladat6;

public class Feladat6 {
    public static void main(String[] args) {
        //létre lehet hozni egy közös tömböt a különböző típusoknak
        UtazasiEszkoz[] eszkozok = { new Taxi(), new Vonat(), new Riska() };
        for (int i = 0; i < eszkozok.length; i++) {
            System.out.println(i+1 +". költség: " + eszkozok[i].mennyibeKerul(125));
        }

    }
}
