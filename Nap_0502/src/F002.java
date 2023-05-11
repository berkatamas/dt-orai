/*
OOP feladatok 2.

Legyen 2 könyv hozzáadás függvénye:
o egy adott polchoz ad hozzá bizonyos számú könyvet
o mindegyik polchoz hozzáad ugyanannyi könyvet
 */

public class F002 {
    public static void main(String[] args) {
        Konyvespolc k1 = new Konyvespolc();
        Konyvespolc k2 = new Konyvespolc(12);

        short[] polcok = {3, 4, 12, 15, 21}; // felsorolással adom meg a tömböt
        Konyvespolc k3 = new Konyvespolc(polcok, (short) 30);
        k3.hozzaad(3, (short)5);
    }
}

class Konyvespolc{
    // reprezentálja a polcokat, elemszáma megegeyzik a polcok számlával
    //sorszámon lévő érték mutatja, melyik polcon hány könyv van
    private short[] polcok;
    private short maxKonyvDbEgyPolcon;

//GETTER SETTER
    public short getMaxKonyvDbEgyPolcon() {
        return maxKonyvDbEgyPolcon;
    }
    //private setter kívülről nem hívható meg, viszont arra jó, hogy a belső beállítás során ellenőrző kódot rendeljek a beállításhoz
    private void setMaxKonyvDbEgyPolcon(short maxKonyvDbEgyPolcon) {
        if(maxKonyvDbEgyPolcon <= 0){
            throw new IllegalArgumentException("Az érték 0-nál nagyobb kell, hogy legyen!");
        }
        this.maxKonyvDbEgyPolcon = maxKonyvDbEgyPolcon;
    }

//KONSTRUKTOROK
    public Konyvespolc(){
        setMaxKonyvDbEgyPolcon((short)10); // max 10 könyv a polcokon
        polcok = new short[5]; // létrehozunk egy 5 polcból álló könyvespolcot (5 elemű tömb)
    }
    public Konyvespolc(int polcokDb){
        if(polcokDb<=0){
            throw new IllegalArgumentException("A polcok száma 0-nál nagyobb kell, hogy legyen!");
        }
        polcok = new short[polcokDb]; // a paraméter alapján kapom a polcok számát
        setMaxKonyvDbEgyPolcon((short)10); // max 10 könyv a polcokon
    }
    public Konyvespolc(short[] polcok, short maxKonyvDbEgyPolcon){
        if(polcok == null){
            throw new IllegalArgumentException("A polcoknak definiáltnak kell lenniük!");
        }
        if(polcok.length == 0){
            throw new IllegalArgumentException("Legalább 1 polcnak lennie kell a könyvespolcon!");
        }
        setMaxKonyvDbEgyPolcon(maxKonyvDbEgyPolcon); // beállítom a felső maximum korlátot
        this.polcok = new short[polcok.length];
        for (int i = 0; i < polcok.length; i++) {
            if(polcok[i] > maxKonyvDbEgyPolcon){
                throw new IllegalArgumentException("A polcra nem tehető több könyv mint a max!");
            }
            this.polcok[i] = polcok[i];
        }

    }

// TOVÁBBI METÓDUSOK
    public void hozzaad(int polcSzs, short konyvDb ){
        if(polcSzs < 0 || polcSzs >= polcok.length){
            throw new IllegalArgumentException("Nem létezik a legadott számú polc");
            }
        if(konyvDb <= 0) {
            throw new IllegalArgumentException("A könyv db-nek legalább 1-nek kell lennie");
        }
        if( polcok[polcSzs] + konyvDb > maxKonyvDbEgyPolcon) polcok[polcSzs] = maxKonyvDbEgyPolcon;
        else polcok[polcSzs] += konyvDb;
        }

    public void hozzaad(short konyvDb){
        if(konyvDb <= 0){
            throw new IllegalArgumentException("A konyv db-nek legalább 1-nek kell lenni");
        }
        for (int i = 0; i < polcok.length; i++) {
            hozzaad(i, konyvDb);
        }
    }

    public int getKonyvekDb(){
        int konyvSum = 0;
        for (short polc : polcok) {
            konyvSum += polc;
        }
        return konyvSum;
    }


}
