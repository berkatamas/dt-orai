package com.dt.exception.feladat1;

public class Parameter {
    private String szo;

    public String getSzo() {
        return szo;
    }
    public void setSzo(String szo) {
        this.szo = szo;
    }
    // throws Exception: a metódus exception típusú hibát tud feldobni
    public void ellenoriz() throws SajatException /*throws Exception*/ {
        if(!szo.equalsIgnoreCase("teszt")){

            //throw new IllegalArgumentException("A szó tartalma nem teszt!");
            // a sima Exception cheked típusú, kezelni kell
            // a checked típusú hibát 2 féle módon lehet kezelni:
            // 1. létrehozzuk a hibakezelő blokkot
            // 2. a hívó félre hárítom a hibakezelést

            //throw new Exception("A szó tartalma nem teszt!");

            // saját kivétel:
            throw new SajatException("A szó tartalma nem teszt!");
        }
    }
}
