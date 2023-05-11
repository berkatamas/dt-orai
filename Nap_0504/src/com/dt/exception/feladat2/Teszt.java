package com.dt.exception.feladat2;

import java.util.Optional;

public class Teszt {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new IllegalArgumentException("Csak 5 szó adható meg!");
            }
            szavakKiir(args);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void szavakKiir(String[] param){
        for (int i = 0; i < param.length; i++) {
            try{
                if( param[i].length() < 5 || param[i].length() > 10){
                    throw new IllegalArgumentException("HIBA: A szónak 5 és 10 karakter között kell lennie!");
                }
                System.out.println(param[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
}
