//4. feladat

public class F004 {
    public static void main(String[] args) { // void: a metúdusnak nincs visszatérési értéke
        //void esetén a return; -al abba tudjuk hagyni a metúdus futtatását


        // ha nem kapok parancssori argumentumot, hagyjuk abba a futattást
        if(args.length == 0){
            System.out.println("A program nem kapott paramétert!");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.println("A megadott érték: " + n);

        int szorzatokSzama = 0;
        while (n < 100){
            n *= n;
            szorzatokSzama++;
        }
        System.out.println("A szorzatok száma: " + szorzatokSzama);

    }
}
