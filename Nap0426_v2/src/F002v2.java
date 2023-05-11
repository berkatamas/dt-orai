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
public class F002v2 {
    public static void main(String[] args) {
    Konyvespolc k1 = new Konyvespolc();
    System.out.println("1. Polcok maximális mérete: " + k1.getPolcMeret() + "  Polcok száma: " + k1.getPolcokSzama());
    Konyvespolc k2 = new Konyvespolc(12, 8);
    System.out.println("2. Polcok maximális mérete: " + k2.getPolcMeret() + "  Polcok száma: " + k2.getPolcokSzama());
    int[] feltoltes = new int[20];
    Konyvespolc k3 = new Konyvespolc(20, 12, feltoltes);
    System.out.println("3. Polcok maximális mérete: " + k3.getPolcMeret() + "  Polcok száma: " + k3.getPolcokSzama());
    /*
    // feltölti a polcokat egy adott számú könyvvel
    int[] polc = k1.getPolcok();
    for (int i = 0; i < k1.getPolcokSzama(); i++) {
        polc[i] = 5+i;
        k1.setPolcok(polc);
        }
     */

    for (int i = 0; i < k3.getPolcokSzama(); i++) {
            System.out.println(i+1 + ". polc: " + k3.getPolcok()[i] + " db könyv");
        }

    }
}

class Konyvespolc {
    private int polcMeret; // 1 polc mérete, mennyi könyv fér el egy polcon
    private int polcokSzama; // Mennyi polc van
    private int[] polcok; // Az egyes polcokon lévő könyvek száma tömb

    public int getPolcMeret() {
        return polcMeret;
    }
    public void setPolcMeret(int polcMeret) {
        if(polcMeret < 0){
            throw new IllegalArgumentException("A polcra tehető könyve száma nem lehet kisebb 0-nál!");
        }
        this.polcMeret = polcMeret;
    }
    public int getPolcokSzama() {
        return polcokSzama;
    }
    public void setPolcokSzama(int polcokSzama) {
        this.polcokSzama = polcokSzama;
        this.polcok = new int[polcokSzama];
    }
    public int[] getPolcok() {
        return polcok;
    }
    public void setPolcok(int[] polcok) {
        this.polcok = polcok;
    }

    //o üres konstruktor (ekkor legyen 5 polc és egyiken se legyen könyv)
    public Konyvespolc(){
        setPolcMeret(10);
        setPolcokSzama(5);
    }

    //o csak a polcok számát állítjuk (ekkor szintén ne legyen egyiken se könyv)
    public Konyvespolc(int polcokSzama, int polcMeret){
        setPolcokSzama(polcokSzama);
        setPolcMeret(polcMeret);
    }

    public Konyvespolc(int polcokSzama, int polcMeret, int[] polcok){
        setPolcokSzama(polcokSzama);
        setPolcMeret(polcMeret);
        setPolcok(polcok);
    }
}

