package com.dt.exception.feladat1;

//saját exception osztály
// throwable kell h legyen

public class SajatException extends Exception{ // mivel az Exception checked, így a sajátException is checked lesz

//KONSTRUKTOROK
    public SajatException() {
    }
    public SajatException(String message) {
        super(message);
    }
    public SajatException(String message, Throwable cause) {
        super(message, cause);
    }
    public SajatException(Throwable cause) {
        super(cause);
    }
}
