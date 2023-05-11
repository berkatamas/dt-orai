package com.dt.datetime.feladat1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Set;

public class Teszt {
    public static void main(String[] args) {
        LocalTime magyarIdo = LocalTime.now();
        System.out.println("Helyi idő: " + magyarIdo);

        // GMT+1 London, GMT+2 Magyarország
        System.out.println("Londoni idő (számítva): " + magyarIdo.minusHours(1));
        //a fenti nem jó, óraállítás stb..

        ZonedDateTime magyarZonazottIdo = ZonedDateTime.now(ZoneId.of("Europe/Budapest"));
        System.out.println("Helyi idő: " + magyarZonazottIdo);
        System.out.println("Londoni idő: " + magyarZonazottIdo.minusHours(1));

        Set<String> hasznalhatoZonak = ZoneId.getAvailableZoneIds();

        //Enumeration: Egy lista amiben nem tudom az elemek indexeit, de nem is számít
        // Enumeration létrehozás, kiírás
        Enumeration<String> felsorolas = Collections.enumeration(hasznalhatoZonak);
        while(felsorolas.hasMoreElements()){
            System.out.println(felsorolas.nextElement());
        }

        ZonedDateTime moszkvaiIdo = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        System.out.println("Moszkvai idő (helyi idő szerint): " + moszkvaiIdo);
        System.out.println("Moszkvai idő (UTC szerint): " + moszkvaiIdo.toInstant());

        ZonedDateTime tokioaiIdo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokio idő (helyi idő szerint): " + tokioaiIdo);
        System.out.println("Tokio idő (UTC szerint): " + tokioaiIdo.toInstant());
    }
}
