
// Minden osztály felelős azért, hogy helyes belső állapotából ne lehessen kizökkenteni
// Belső állapot = osztályváltozók + példányváltozók értéke
// védelmi szintek (írásra és olvasásra egyaránt vonatkoznak)
// - private: A tulajdonsághoz csak az őt bevezető osztályon belül férek hozzá
// - üres: private + azonos csomag elemei is elérik
// - protected: olyan mint az üres + a bevezető osztályai is hozzáférnek
// - public: a tulajdonsághoz bárhonnan hozzáférek (általában csak metódusok)

public class P002 {
    public static void main(String[] args) {
        Ember2 e1 = new Ember2();
        //e1.eletkor = -100; //az életkor private, ezért innen nem férek hozzá
        //System.out.println("E1 életkor: " + e1.eletkor);

    }
}

class Ember2{
    String nev;
    private byte eletkor;

}
