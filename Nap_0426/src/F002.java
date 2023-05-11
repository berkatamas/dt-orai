/*
Hozzunk létre egy Könyvespolc osztályt. Tulajdonságai: polcok száma, mennyi könyv fér egy polcra. Legyen több konstruktora:
o üres konstruktor (ekkor legyen 5 polc és egyiken se legyen könyv)
o csak a polcok számát állítjuk (ekkor szintén ne legyen egyiken se könyv)
o beállítjuk a polcok számát és azt is, hogy melyiken hány könyv van

Legyen 2 könyv hozzáadás függvénye:
o egy adott polchoz ad hozzá bizonyos számú könyvet
o mindegyik polchoz hozzáad ugyanannyi könyvet

Ha egy polcra már nem fér annyi könyv, mint amennyit szeretnénk még rátenni,
akkor annyit tegyünk rá, amennyi még ráfér! Legyen egy függvényünk, ami kiszámolja a könyvespolcon lévő könyvek számát!
 */
// OOP: 2. feladat
public class F002 {
    public static void main(String[] args) {
        Konyvespolc k1 = new Konyvespolc(); // a példányosítás a konstruktorhívással történik
        System.out.println("polc db: " + k1.getPolcokDb()+", könyvek db: "+k1.getKonyvDbPolc());

        Konyvespolc k2 = new Konyvespolc((byte)12, (byte)5); // az két paraméteres konstruktor hívom meg
        System.out.println("polc db: " + k2.getPolcokDb()+", könyvek db: "+k2.getKonyvDbPolc());

        byte[] kezdoTomb = new byte[8];
        Konyvespolc k3 = new Konyvespolc(kezdoTomb, (byte)6); // az két paraméteres konstruktor hívom meg
        System.out.println("polc db: " + k3.getPolcokDb()+", könyvek db: "+k3.getKonyvDbPolc());

        //k1.konyvHozzaad(3, (byte)5); // csak 1 polchoz ad hozzá
        k1.konyvHozzaad((byte)5); // minden polchoz hozzáad

        System.out.println("Könyvek száma: " + k1.konyvekDb());


    }
}

class Konyvespolc{
    private byte polcokDb; // polcok száma
    private byte konyvDbPolc;// konyvek száma polconként
    private byte[] polcok; // az egyes polconkat reprezentálja, illetve az azon lévő könyveket

    public byte getPolcokDb() {
        return polcokDb;
    }

    public void setPolcokDb(byte polcokDb) {
        if(polcokDb <= 0){
            throw new IllegalArgumentException("Legalább 1 polc kell!");
        }
        this.polcokDb = polcokDb;
        this.polcok = new byte[polcokDb];
    }

    public byte getKonyvDbPolc() {
        return konyvDbPolc;
    }

    public void setKonyvDbPolc(byte konyvDbPolc) {
        if(konyvDbPolc <= 0){
            throw new IllegalArgumentException("Legalább 1 könyv kell a polcra!");
        }
        this.konyvDbPolc = konyvDbPolc;
    }

    public Konyvespolc(){ // paraméter nélküli konstruktor
        setPolcokDb((byte)5); // 5 polc, polconként 10 könyv rakható rá
        setKonyvDbPolc((byte)10);
    }
    public Konyvespolc(byte polcokDb, byte konyvDbPolc){
        setPolcokDb(polcokDb);
        setKonyvDbPolc(konyvDbPolc);
    }

    public Konyvespolc(byte[] polcok, byte konyvDbPolc){
        setPolcokDb((byte)polcok.length);
        setKonyvDbPolc(konyvDbPolc);
    }

    public void konyvHozzaad(int polcSorszam, byte konyvDb){
        if(konyvDb <= 0){
            throw new IllegalArgumentException("Csak pozitív mennyiségű könyv helyezhető fel!");
        }

        if(polcok[polcSorszam] + konyvDb > konyvDbPolc){
            polcok[polcSorszam] = konyvDbPolc;
        }
        else{
            polcok[polcSorszam] += konyvDb;
        }
    }
    public void konyvHozzaad(byte konyvDb){
        for(int i = 0; i < polcok.length; i++){
            konyvHozzaad(i, konyvDb);
        }
    }

    public short konyvekDb(){
        short osszeg = 0;
        for (byte kdb:polcok) {
            osszeg += kdb;
        }
        return osszeg;
    }



}
