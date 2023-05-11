/*
OOP feladatsor 3. feladat
 */
public class F003 {
    public static void main(String[] args) {
        Auto a = new Auto("Ford Focus", (short)1997);
        a.setKilometer(100.3f);
        a.setRendszam("AAA-123");
        a.setFogyasztas(12.7f);

        StringBuilder b = new StringBuilder();
        b.append("Rendszán: ");
        b.append(a.getRendszam());
        b.append(", típus: ");
        b.append(a.getTipus());
        b.append(", évjárat: ");
        b.append(a.getEv());
        b.append(", fogyasztás: ");
        b.append(a.getFogyasztas());
        b.append(", futott km: ");
        b.append(a.getKilometer());
        System.out.println(b.toString());

        Taxi t1 = new Taxi("Opel Kadett", (short)1995, "Masterfield", 580);
        t1.setRendszam("BBB-111");
        t1.setFogyasztas(12.6f);
        t1.setKilometer(100_000);
        StringBuilder b1 = new StringBuilder();
        b1.append("Rendszán: ");
        b1.append(t1.getRendszam());
        b1.append(", típus: ");
        b1.append(t1.getTipus());
        b1.append(", évjárat: ");
        b1.append(t1.getEv());
        b1.append(", fogyasztás: ");
        b1.append(t1.getFogyasztas());
        b1.append(", futott km: ");
        b1.append(t1.getKilometer());
        b1.append(", cégnév: ");
        b1.append(t1.getCeg());
        b1.append(", km díj: ");
        b1.append(t1.getKmDij());
        System.out.println(b1.toString());
    }
}

class Taxi extends Auto{ //ősnek választom az Auto osztályt
    // mindent megöröklünk, kivéve konstruktor + osztályszintű elemek, a private szintet nem látjuk de megkapja
    // a gyermek osztály minden konstruktrának meg kell hívni az ős valamelyik konstruktorát
    public Taxi(String tipus, short ev, String ceg, int kmDij){
        //konstruktor ami meghívja a szülő konstruktorát és beállítja a sajátját is
        super(tipus, ev);
        setCeg(ceg);
        setKmDij(kmDij);
    }
    private String ceg;
    private int kmDij;

    public int getUtikoltseg(float uzemanyagAr, float tavolsag){
        return (int)(Math.ceil(getFogyasztas()) * tavolsag / 100 * uzemanyagAr *getKmDij());
    }

// GETTER SETTER
    public String getCeg() {
        return ceg;
    }
    public void setCeg(String ceg) {
        if(ceg == null){
            throw new IllegalArgumentException("A cég megadása kötelező");
        }
        if(!ceg.equalsIgnoreCase("EV") && ceg.length() < 10){
            throw new IllegalArgumentException("A cég vagy EV vagy legalább 10 karakter kell, hogy legyen!");
        }
        this.ceg = ceg;
    }
    public int getKmDij() {
        return kmDij;
    }
    public void setKmDij(int kmDij) {
        if(kmDij < 1){
            throw new IllegalArgumentException("A km díj nem lehet kisebb 1!");
        }
        this.kmDij = kmDij;
    }
}

class Auto{
    private String rendszam;
    private String tipus;
    private short ev;
    private float kilometer;
    private float fogyasztas;

    // getUtikoltseg();
    public int getUtikoltseg(float uzemanyagAr, float tavolsag){
        if(uzemanyagAr <= 0){
            throw new IllegalArgumentException("Az üzemanyag ára nem lehet 0 vagy kisebb!");
        }
        if(tavolsag <=0){
            throw new IllegalArgumentException("A megtett távolság nem lehet 0 vagy kisebb!");
        }
        return (int)(Math.ceil(fogyasztas) * tavolsag / 100 * uzemanyagAr); //ceil -> felfelé kerekít, double-t ad vissza
    }

//GETTER SETTER
    public String getRendszam() {
        return rendszam;
    }
    public void setRendszam(String rendszam) {
        if (rendszam == null || rendszam.length() < 6){
            throw new IllegalArgumentException("A rendszám nem lehet üres vagy több mint 6 karakter!");
        }
        this.rendszam = rendszam;
    }
    public String getTipus() {
        return tipus;
    }
    private void setTipus(String tipus) {
        if (tipus == null || tipus.length() < 5){
            throw new IllegalArgumentException("A típus nem lehet keveseb mint 5 karakter");
        }
        this.tipus = tipus;
    }
    public short getEv() {
        return ev;
    }
    public void setEv(short ev) {
        if (ev < 1950 || ev > 2050){
            throw new IllegalArgumentException("Az évnek 1950 és 2050 között kell lennie!");
        }
        this.ev = ev;
    }
    public float getKilometer() {
        return kilometer;
    }
    public void setKilometer(float kilometer) {
        if (kilometer < 0){
            throw new IllegalArgumentException("A km nem lehet negatív!");
        }
        this.kilometer = kilometer;
    }
    public float getFogyasztas() {
        return fogyasztas;
    }
    public void setFogyasztas(float fogyasztas) {
        if (fogyasztas < 5.0 || fogyasztas > 55.0){
            throw new IllegalArgumentException("fogyasztásnak 5.0 és 55.0 között kell lennie!");
        }
        this.fogyasztas = fogyasztas;
    }

// KONSTRUKTOROK
    public Auto(String tipus, short ev){
        setTipus(tipus);
        setEv(ev);
    }

}
