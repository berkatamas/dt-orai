package com.dt.mftanfolyam.oop.feladat6;

public class Riska extends UtazasiEszkoz{
    @Override
    public double mennyibeKerul(int tavolsagKm) {
        /*
        if(tavolsagKm <= 0){
            throw new IllegalArgumentException("A távolság nem lehet <=0!");
        }

         */
        tavolsagKmEllenorzes(tavolsagKm);
        return tavolsagKm * 130 + (tavolsagKm / 50 + 1) * 200;
    }
}
