package com.dt.mftanfolyam.oop.feladat6;

abstract public class UtazasiEszkoz {
    abstract public double mennyibeKerul(int tavolsagKm);

    public void tavolsagKmEllenorzes(int tavolsagKm){
        if(tavolsagKm <= 0){
            throw new IllegalArgumentException("A távolság nem lehet 0 vagy kisebb!");
        }
    }

}
