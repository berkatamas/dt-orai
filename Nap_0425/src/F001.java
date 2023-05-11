// OOP gyűjtemény 1. feladat

// getter: lekérdezzük a tulajdonság értékét
// setter: beállítsuk a tulajdonság értékét

public class F001 {

    public static void main(String[] args) {
        Alkalmazott a1 = new Alkalmazott();
        a1.setNev("Példa Tamás");
        System.out.println("Az alkalmazott neve: " + a1.getNev());
        a1.setKor((byte)40); //egész számok (literálok típusa) int, lehetőség: végére L (long típus) 40L, itt kisebbre kell menni -> type casting
        System.out.println("Az alkalmazott kora: " + a1.getKor());
        a1.setFizetes(1_500_000);
        System.out.println("Az alkalmazott fizetése: " + a1.getFizetes());

        a1.fizetestEmel(); //Emelés 5000-el
        a1.fizetestEmel(200_000); //Emelés megadott összeggel
        a1.fizetestEmel((float)20); //Emelés megadott százalékkal

        System.out.println("Az alkalmazott fizetése fizetésemelés után: " + a1.getFizetes());
    }
}

class Alkalmazott {
    private String nev;
    private byte kor;
    private int fizetes;

    public String getNev(){
        return nev;
        //visszaadom a hívás helyére a név értékét
    }
    public void setNev(String nev) {
        if(nev == null){
            throw new IllegalArgumentException("A név nem lehet üres!");
        }
        if(nev.length() < 5){
            throw new IllegalArgumentException("A név túl rövid!");
        }
        if(nev.length() > 500){
            throw new IllegalArgumentException("A név túl hosszú!");
        }
        //névütközés esetén ki kell írni a this. kulcsszót a tulajdonság/metódus neve elé
        this.nev = nev;
    }
    /**
     * Az alkalmazott életkora
     * @return Az alkalmazott életkora években
     */
    public byte getKor(){
        return kor;
    }
    /**
     * Az alkalmazott életkorának beállítása
     * @param kor Az új életkor amit be szeretnénk állítani
     */
    public void setKor(byte kor){
        if(kor < 18 || kor > 65){
            throw new IllegalArgumentException("A kor nem lehet 18 év alatt vagy 65 év felett!");
        }
        this.kor = kor;
    }
    public int getFizetes(){
        return fizetes;
    }
    public void setFizetes(int fizetes){
        if(fizetes < 200_000 ){
            throw new IllegalArgumentException("A fizetés nem lehet 200 000 Ft alatt!");
        }
        if(fizetes % 10 != 0){
            throw new IllegalArgumentException("A fizetésnek 10-el oszthatónak kell lennie!");
        }
        this.fizetes = fizetes;
    }
    //Overloading, túlterhelés szabály: Azonos névvel létre lehet hozni metódusokat amennyiben a paraméterük különbözik

    /**
     * Az aktuális összeget emeli 5000 Ft-al
     */
    public void fizetestEmel(){
        //fizetes += 5000; //Ez a módszer nem veszi figyelembe a setFizetes-ben meghatározott feltételeket
        setFizetes(fizetes + 5000);
    }

    /**
     * Béremelés adott összeggel
     * @param emelesOsszege A béremelés mértéke
     */
    public void fizetestEmel(int emelesOsszege){
        //fizetes = fizetes + emelesOsszege;
        if (emelesOsszege <= 0) {
            throw new IllegalArgumentException("Az emelés összege nem lehet <= 0!");
        }
        setFizetes(fizetes + emelesOsszege);
        }

    /**
     * Béremelés adott százalékkal
     * @param emelesSzazaleka A béremelés százaléka
     */
    public void fizetestEmel(float emelesSzazaleka){
        //fizetes = (int)(fizetes + (fizetes * (emelesSzazaleka/100)));
        //setFizetes((int)(fizetes + (fizetes * (emelesSzazaleka/100))));   SAJÁT megoldás, ez is OK

        if(emelesSzazaleka <= 0){
            throw new IllegalArgumentException("Az emelés százaléka nem lehet <=0!");
        }
        int ujFizetes = (int)(fizetes * (1 + emelesSzazaleka / 100));
        setFizetes(ujFizetes);
    }
}
