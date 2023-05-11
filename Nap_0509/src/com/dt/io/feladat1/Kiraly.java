package com.dt.io.feladat1;

public class Kiraly {

    private String nev;
    private int uralkodasKezdete;
    private int uralkodasVege;

//GETTER SETTER
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        if(nev == null) throw new NullPointerException("A név nem lehet üres!");
        this.nev = nev;
    }
    public int getUralkodasKezdete() {
        return uralkodasKezdete;
    }
    public void setUralkodasKezdete(int uralkodasKezdete) {
        if(uralkodasKezdete < 0 || uralkodasKezdete > 2023) throw new IllegalArgumentException("Az uralkodás kezdete 0 és 2023 között kell, hogy legyen!");
        this.uralkodasKezdete = uralkodasKezdete;
    }
    public int getUralkodasVege() {
        return uralkodasVege;
    }
    public void setUralkodasVege(int uralkodasVege) {
        if(uralkodasVege < 0 || uralkodasVege > 2023 || uralkodasVege < uralkodasKezdete) throw new IllegalArgumentException("Az uralkodás vége helytelen!");
        this.uralkodasVege = uralkodasVege;
    }

//KONSTRUKTOR
    public Kiraly(String nev, int uralkodasKezdete, int uralkodasVege) {
        setNev(nev);
        setUralkodasKezdete(uralkodasKezdete);
        setUralkodasVege(uralkodasVege);
    }

//OVERRIDE
    @Override
    public String toString() {
        return nev + " (" + uralkodasKezdete + " - " + uralkodasVege + ")";
    }
}
