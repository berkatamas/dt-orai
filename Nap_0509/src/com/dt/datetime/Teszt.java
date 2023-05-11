package com.dt.datetime;

import java.time.*;

public class Teszt {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println(ZonedDateTime.now());

        //Dátumidő lokális
        LocalDate holnap = LocalDate.of(2023,5,9);
        LocalTime felEgy = LocalTime.of(12, 30);
        LocalDateTime holnapFelEgy = LocalDateTime.of(holnap, felEgy);
        holnapFelEgy = holnapFelEgy.plusDays(1);
        System.out.println(holnapFelEgy);

        //Dátumidő zónázott
        ZoneId magyarIdoId = ZoneId.of("Europe/Budapest");
        ZonedDateTime holnapFelEgyMagyarIdoben = ZonedDateTime.of(holnapFelEgy, magyarIdoId);
        System.out.println(holnapFelEgyMagyarIdoben);

        // Segédfüggvények
        LocalDate holap2 = LocalDate.now().plusDays(1);
        System.out.println(holap2);

    }
}
