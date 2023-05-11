package com.dt.oop.feladat7.csomagok;

public class Ember {
    private String nev;
    private Bronze csomag; //belehelyezhető a bronz vagy bármelyik gyermeke
    private int haviBeszeltPerc;
    private int haviKuldottSms;

//GETTER SETTER
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        if(nev == null){
            throw new IllegalArgumentException("A név nem lehet üres!");
        }
        this.nev = nev;
    }
    public Bronze getCsomag() {
        return csomag;
    }
    public void setCsomag(Bronze csomag) {
        if(csomag == null){
            throw new IllegalArgumentException("A csomag nem lehet üres!");
        }
        this.csomag = csomag;
    }
    public int getHaviBeszeltPerc() {
        return haviBeszeltPerc;
    }
    public void setHaviBeszeltPerc(int haviBeszeltPerc) {
        if(haviBeszeltPerc < 0){
            throw new IllegalArgumentException("A mennyit beszél érték nem lehet negatív!");
        }
        this.haviBeszeltPerc = haviBeszeltPerc;
    }
    public int getHaviKuldottSms() {
        return haviKuldottSms;
    }
    public void setHaviKuldottSms(int haviKuldottSms) {
        if(haviKuldottSms < 0){
            throw new IllegalArgumentException("A mennyit smsezik érték nem lehet negatív!");
        }
        this.haviKuldottSms = haviKuldottSms;
    }

// KONSTRUKTOROK
    public Ember(String nev){
        setNev(nev);
        setHaviBeszeltPerc(0);
        setHaviKuldottSms(0);
    }

    public Ember(String nev, int haviBeszeltPerc, int haviKuldottSms) {
        setNev(nev);
        setHaviBeszeltPerc(haviBeszeltPerc);
        setHaviKuldottSms(haviKuldottSms);
    }

}
