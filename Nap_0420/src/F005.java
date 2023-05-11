//5. feladat

public class F005 {
    public static void main(String[] args) {
        // ha nem kapok parancssori argumentumot, hagyjuk abba a futattást
        if(args.length == 0) {
            System.out.println("A program nem kapott paramétert!");
            return;
        }

        //saját megoldás
        System.out.println("\nSaját megoldás, kamatos kamat konkrét érték nélkül:");
        double kamat = Integer.parseInt(args[0]);
        double kamatUj = 0;
        int evekSzama = 0;
        do {
            kamatUj = (kamat/100 * kamatUj) + (kamatUj + kamat);
            evekSzama++;
        } while (kamatUj < 100);
        System.out.println("Szükséges évek száma a duplázáshoz: " + evekSzama);
        System.out.println("Aktuális kamat a dublázás évében: " + kamatUj);

        // órai megoldás
        System.out.println("\nÓrai megoldás, kamatos kamat beégetett példaértékkel:");
        float kamatSzazalek = Float.parseFloat(args[0]);
        if(kamatSzazalek <= 0){
            System.out.println("A kamat értéke helytelen");
            return;
        }

        //százalékos formában kapom meg, ezért vissza kell szoroznom
        kamatSzazalek  = 1 + (kamatSzazalek / 100);

        int osszeg = 500;
        int duplaOsszeg = osszeg * 2;
        double aktualisOsszeg = osszeg;
        int evekSzama2 = 0;

        do{
            evekSzama2++;
            aktualisOsszeg *= kamatSzazalek;
        } while (aktualisOsszeg < duplaOsszeg);

        System.out.println("A szükséges évek száma: "+ evekSzama2);

        // példaösszeg nélkül csak kamat értékkel való számítás kamatos kamattal





    }
}
