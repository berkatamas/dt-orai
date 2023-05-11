package com.dt.datetime.feladat2;

import com.dt.io.feladat1.Kiraly;

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Teszt {
    public static void main(String[] args) {
        // A billentyűzetről ImputStreamReader-en keresztül olvasok
        // Erre a Streamre is a BufferReadert ültetjük rá

        try(
                InputStreamReader bejovoAdatfolyam = new InputStreamReader(System.in);
                BufferedReader olvaso = new BufferedReader(bejovoAdatfolyam);
                )
        {
            System.out.println("Kérem az apa születési idejét (ÉÉÉÉ-HH-NN) forma szerint: ");
            String apaSzulidoString = olvaso.readLine();
            String[] apaDatumMezok = apaSzulidoString.split("-");
            LocalDate apaSzulidoDate = LocalDate.of(Integer.parseInt(apaDatumMezok[0]),Integer.parseInt(apaDatumMezok[1]),Integer.parseInt(apaDatumMezok[2]));

            System.out.println("Kérem a gyerek születési idejét (HHH-MM-DD) forma szerint: ");
            String gyerekSzulidoString = olvaso.readLine();
            String[] gyerekDatumMezok = gyerekSzulidoString.split("-");
            LocalDate gyerekSzulidoDate = LocalDate.of(Integer.parseInt(gyerekDatumMezok[0]),Integer.parseInt(gyerekDatumMezok[1]),Integer.parseInt(gyerekDatumMezok[2]));

            System.out.println("Korkülönbség években: " + ChronoUnit.YEARS.between(apaSzulidoDate,gyerekSzulidoDate));
            System.out.println("Korkülönbség hónapokban: " + ChronoUnit.MONTHS.between(apaSzulidoDate,gyerekSzulidoDate));
            System.out.println("Korkülönbség napokban: " + ChronoUnit.DAYS.between(apaSzulidoDate,gyerekSzulidoDate));

        } catch (IOException e) {
            System.out.println("Hiba a megadott adatban!");
        }
    }
}
