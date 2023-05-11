// Osztályváltozó vs példányváltozó

public class P001 {
    public static void main(String[] args) {
        // objektum: az osztályból létrehozott konkrét példány, adattartalommal
        // pédányosítás: Új objektumot hozok létre az osztályból
        Ember e1 = new Ember();
        Ember.korhatar = 18; // mindenkinél ugyanaz az érték lesz. Osztályváltozó mert az osztályban static szóval van létrehozva

        e1.nev = "Kiss Tamás";
        e1.eletkor = 45;
        System.out.println("Név: " + e1.nev + ", kor: " + e1.eletkor + ", korhatár: " + Ember.korhatar);

        Ember e2 = new Ember();
        e2.nev = "Nagy Anna";
        e2.eletkor = 19;
        System.out.println("Név: " + e2.nev + ", kor: " + e2.eletkor + ", korhatár: " + Ember.korhatar);


    }
}

// osztálydefiníció
class Ember{
    // Osztály,  1 db létezik belőle
    // az osztály típusként is funkcionál
    // tulajdonságok felvétele, közvetlenül az osztályon belül, függetlenül a helyétő

    //final String tajSzám = "123456"; A finalt időben kell inicializálni, csak olvasható

    // példányszintű tulajdonság, minden objektum egymástól függetlenül tárol értéket
    String nev;
    // osztályszintű tulajdonság (staic), egyszer fogjuk tárolni, -> hivatkozás: Osztálynév.tulajdonság
    static byte korhatar; //nagykorúság korhatára
    byte eletkor;


}