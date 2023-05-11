package com.dt.oop.feladat7.csomagok;

public class Bronze {
    private final int elofiezetesiDij;
    private final int percDij;
    private final int smsDij;

    public Bronze(){
        elofiezetesiDij = 2000;
        percDij = 18;
        smsDij = 25;
    }

    protected Bronze(int elofiezetesiDij, int percDij, int smsDij){
        this.elofiezetesiDij = elofiezetesiDij;
        this.percDij = percDij;
        this.smsDij = smsDij;
    }

//GETTER
    public int getElofiezetesiDij() {
        return elofiezetesiDij;
    }
    public int getPercDij() {
        return percDij;
    }
    public int getSmsDij() {
        return smsDij;
    }
}
