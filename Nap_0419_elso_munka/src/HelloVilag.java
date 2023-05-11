public class HelloVilag { //osztály
    // az osztályon belül metódusokat vehetünk fel, a main mindenképp kell
    // elég beírni a psvm betűket az alábbi metódus létrehozásából
    // szekveniális végrehajtás, az utasításokat a sorrendben futattja le
    // az utasításokat külön sorba definiáljuk

    public static void main(String[] args) {
        // ha a szöveg tartalmaz "-t, akkor a szövegközi jel elé \ jelet kell tenni
        // pl. "Hello \" Világ!"
        // A kimentet (képernyőt) a System.out elemen keresztül kezeljük.
        // System.out.print (kiírja a szöveget)
        // Systems.out.println (kiírás után sort emel)
        // . operator -> szűkítő operátor -> System.out: A System könyvtárból kiválasztom az out elemet

        System.out.println("Helló Világ!");

    }

}
