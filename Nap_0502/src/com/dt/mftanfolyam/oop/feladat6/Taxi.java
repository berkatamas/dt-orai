package com.dt.mftanfolyam.oop.feladat6;

public class Taxi extends UtazasiEszkoz{

    @Override
    public double mennyibeKerul(int tavolsagKm) {
        /*
        if(tavolsagKm <= 0){
            throw new IllegalArgumentException("A távolság nem lehet 0 vagy kisebb!");
        }
        */
        tavolsagKmEllenorzes(tavolsagKm);
        return tavolsagKm * 160;
    }
}
