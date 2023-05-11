package com.dt.oop.feladat7;

import java.util.Random;

import com.dt.oop.feladat7.csomagok.Bronze;
import com.dt.oop.feladat7.csomagok.Ember;
import com.dt.oop.feladat7.csomagok.Gold;
import com.dt.oop.feladat7.csomagok.Silver;

public class Teszt {
    public static void main(String[] args) {
        // főprogram a teszteléshez

        Bronze b = new Bronze();
        Silver s = new Silver();
        Gold g = new Gold();

        Random rand = new Random();
        int haviPercek = rand.nextInt(50,501);
        int haviSmsek = rand.nextInt(20,201);

        Ember e = new Ember("Kiss Géza", haviPercek, haviSmsek);
/*
        //SZAMITAS ORAI
        Bronze[] csomagok =  { new Bronze(), new Silver(), new Gold()};
        for (int i = 0; i < csomagok.length; i++) {
            int haviDij = 0;
            if (csomagok[i] instanceof Gold) {
                int smsDb = e.getHaviKuldottSms();
                ...
            } else if (csomagok[i] instanceof Silver) {

            } else {
               haviDij = csomagok[i].getPercDij() * e.getHaviBeszeltPerc() + csomagok[i].getSmsDij() * e.getHaviKuldottSms();
            }
            if(haviDij < csomagok[i].getElofiezetesiDij()) haviDij = csomagok[i].getElofiezetesiDij();
        }
*/
        // SZAMITAS SAJÁT
        // BRONZE
        int haviDijBronze = e.getHaviBeszeltPerc() * b.getPercDij() + e.getHaviKuldottSms() * b.getSmsDij() - b.getElofiezetesiDij();
        if (haviDijBronze <= b.getElofiezetesiDij()){
            haviDijBronze = b.getElofiezetesiDij();
        }
        // SILVER
        int valosSms = 0;
        if (e.getHaviKuldottSms() - s.getIngyenSmsDb() < 0) valosSms = 0;
        else valosSms = e.getHaviKuldottSms() - s.getIngyenSmsDb();
        int haviDijSilver = (e.getHaviBeszeltPerc() * s.getPercDij()) + (valosSms * s.getSmsDij()) - s.getElofiezetesiDij();
        if (haviDijSilver <= s.getElofiezetesiDij()){
            haviDijSilver = s.getElofiezetesiDij();
        }
        // GOLD
        if (e.getHaviKuldottSms() - g.getIngyenSmsDb() < 0) valosSms = 0;
        else valosSms = e.getHaviKuldottSms() - g.getIngyenSmsDb();
        int valosPerc = 0;
        if (e.getHaviBeszeltPerc() - g.getIngyenPercekSzama() < 0) valosPerc = 0;
        else valosPerc = e.getHaviBeszeltPerc() - g.getIngyenPercekSzama();
        int haviDijGold = (valosPerc * g.getPercDij()) + (valosSms * g.getSmsDij()) - g.getElofiezetesiDij();
        if (haviDijGold <= g.getElofiezetesiDij()){
            haviDijGold = g.getElofiezetesiDij();
        }
        if(haviDijGold < haviDijSilver){
            e.setCsomag(g);
        } else if( haviDijSilver < haviDijBronze){
            e.setCsomag(s);
        } else {
            e.setCsomag(b);
        }
        System.out.println("Csomagonkénti költségek: Bronze: " + haviDijBronze + ", Silver: " + haviDijSilver + ", Gold: " + haviDijGold);
        System.out.println("Név: " + e.getNev() + ", havi beszélt percek: " + e.getHaviBeszeltPerc() + " perc, havi elküldött SMS-ek: " + e.getHaviKuldottSms() + " db. Az optimális csomag: " + e.getCsomag().getClass().getSimpleName());
    }


}


