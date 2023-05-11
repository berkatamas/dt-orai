package com.dt.test.feladat3;

public class Rectangle {
    private int szelesseg;
    private int magassag;

//GETTER SETTER
    public int getSzelesseg() {
        return szelesseg;
    }
    public void setSzelesseg(int szelesseg) {
        assert szelesseg > 0;
        if(szelesseg <= 0) throw new IllegalArgumentException("A szélesség nem lehet 0 vagy negatív!");
        this.szelesseg = szelesseg;
    }
    public int getMagassag() {
        return magassag;
    }
    public void setMagassag(int magassag) {
        // tesztelési céllal ha a magasság kisebb mint 0, generáljuk Assertion kivételt
        assert magassag > 0; // akkor dob hibát ha be van kapcsolva (VM opciók -ea) és az assert utáni feltétel hamis

        if(magassag <= 0) throw new IllegalArgumentException("A magasság nem lehet 0 vagy kisebb!");
        this.magassag = magassag;
    }

//KONSTRUKTOROK
    public Rectangle(int szelesseg, int magassag) {
        setMagassag(magassag);
        setSzelesseg(szelesseg);
    }

//METÓDUSOK
    public int getK(){
        return (2 * szelesseg) + (2 * magassag);
    }
    public int getT(){
        return szelesseg * magassag;
    }
}
