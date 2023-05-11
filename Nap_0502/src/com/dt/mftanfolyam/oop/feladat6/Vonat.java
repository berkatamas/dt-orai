package com.dt.mftanfolyam.oop.feladat6;

public class Vonat extends UtazasiEszkoz{

    @Override
    public double mennyibeKerul(int tavolsagKm) {
        /*
        if(tavolsagKm <= 0){
            throw new IllegalArgumentException("A távolság nem lehet <=0!");
        }

         */
        tavolsagKmEllenorzes(tavolsagKm);
        int osszeg = 0;
        if(tavolsagKm <= 100) {
            osszeg = tavolsagKm * 70;
        } else {
            osszeg = (100 * 70) + (tavolsagKm-(100)*60);
        }
        return osszeg;
    }
}
