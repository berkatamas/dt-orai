package com.dt.oop.feladat7.csomagok;

public class Silver extends Bronze{
    private final int ingyenSmsDb;

    public Silver(){
        super(3000, 15, 20);
        ingyenSmsDb = 10;
    }

    protected Silver(int elofiezetesiDij, int percDij, int smsDij, int ingyenSmsDb){
        super(elofiezetesiDij, percDij, smsDij);
        this.ingyenSmsDb = ingyenSmsDb;
    }

//GETTER
    public int getIngyenSmsDb() {
        return ingyenSmsDb;
    }
}
