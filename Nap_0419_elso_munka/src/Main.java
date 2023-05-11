

//Mindent osztályba kell helyezni
//Minden fájlban max egy publikus osztály lehet aminek a nevének Main-nek kell lenni
//Fordítás
//javac Main.java -> lett belöle Main.class
//java Main.class -> Program futtatása (Alapból nem fog menni, paraméterezni kell)
//java Main.java -> Hiba nélkül lefut a program csak kiadnánk a forráskódot



/**
 * @author Berka Tamás
 * @see "https://masterfield.hu"
 */
public class Main {
    // Az osztályon belül a program futása mindig a main végrehajtásával kezdődik
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}