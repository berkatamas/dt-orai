/*

/*
4.	Készítsünk programot, amely a parancssorból kapott argumentum faktoriálisának értékét írja a képernyőre!
Csak nem negatív értékek esetén számítható faktoriális, hibás érték esetén ezt jelezze a felhasználónak, majd
fejezze be a program végrehajtását! Továbbá a számításhoz tudni kell, hogy N! = 1*2*…*(N-1)*N, és 0! = 1.
 */

// osztály neve: GY004
// tulajdonság: incs
// metódusok: 1db (main, belépési pont)


public class GY004 {
    public static void main(String[] args) {
        int faktorialis = Integer.parseInt(args[0]);

        if (faktorialis < 0){
            System.out.println("A megadott érték nem lehet negatív!");
            return;
        }

        if (faktorialis == 0){
            System.out.println(faktorialis + "! = 0");

        } else {
            //órai munka
            long faktorialisEredmeny = 1;
            for (int i = faktorialis; 0 < i; i--) {
                faktorialisEredmeny *= i;
            }
            System.out.println("A(z) " + faktorialis +  " faktoriálisa: " + faktorialisEredmeny );
        }
    }
}
