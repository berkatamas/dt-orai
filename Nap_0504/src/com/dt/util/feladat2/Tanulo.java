package com.dt.util.feladat2;

public class Tanulo {
    private String nev;
    private double tanulmanyiAtlag;

//GETTER SETTER
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
            if (nev == null) {
                throw new NullPointerException("A név nem lehet üres");
            }
        this.nev = nev;
    }
    public double getTanulmanyiAtlag() {
        return tanulmanyiAtlag;
    }
    public void setTanulmanyiAtlag(double tanulmanyiAtlag) {
            if (tanulmanyiAtlag < 0 || tanulmanyiAtlag > 5) {
                throw new IllegalArgumentException("A tanulmányi átlagnak 1 és 5 között kell lennie!");
            }
        this.tanulmanyiAtlag = tanulmanyiAtlag;
    }

//KONSTRUKTOR
    public Tanulo(String nev, double tanulmanyiAtlag) {
        setNev(nev);
        setTanulmanyiAtlag(tanulmanyiAtlag);
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(nev);
        sb.append(" (");
        sb.append(tanulmanyiAtlag);
        sb.append(")");
        return sb.toString();
    }
}
