package com.dt.oop;

public class Immutable { // final osztály nem választható ősnek (final class)
    private final String[] words; // final: csak helyben vagy konstruktorból állítható be

    public Immutable(String[] words){
        if (words == null || words.length == 0){
            throw new IllegalArgumentException("Legalább egy szót át kell adni!");
        }
        //this.words = words; // final így a konstruktorból beállítható (csak 1x)
        // nem jó mert nem tömbelemeket hanem referenciát másolunk
        // tömbben másoláshoz használjuk a System.arrayCopy függvényt

        this.words = new String[words.length];
        // melyik tömbből, honnan, melyik többe, honnan, mennyit
        System.arraycopy(words,0, this.words, 0, words.length);
    }

    public final String[] getWords() {
        //return words; // hiba mivel a words referenciáját adjuk vissza
        String[] seged = new String[words.length];
        System.arraycopy(words,0, seged, 0, words.length);
        return seged;
    }

    // ha a fenti nem elég hatékony (memóriaigényes)
    // akkor az alábbi megoldás kell, csak az i.-ik elemet adja vissza
    public final String getWords(int index) {
        if(index < 0 || index >= words.length) {
            throw new IllegalArgumentException("Az index értéke helytelen!");
        }
        return words[index];
    }


}
