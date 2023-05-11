package com.dt.oop.feladat7.csomagok;

public class Gold extends Silver{
    private final int ingyenPercekSzama;

    public Gold(){
        super(4000,12,15,20);
        ingyenPercekSzama = 30;
    }

    public int getIngyenPercekSzama() {
        return ingyenPercekSzama;
    }
}
