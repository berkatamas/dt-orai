package com.dt.oop;

public class Singleton {
    // a public nem jó, mert mindenki közvetlenül tudja hívni
    //public Singleton(){
    //}

    // az üres sem jó, mert kifelé ugyan private, de csomagon belül public
    //Singleton(){
    //}

    // ez sem jó mert a protected-et csak a gyermek osztály éri el (ez már eleve nem jó), ráadásul azonos csomagon belül public
    //protected Singleton(){
    //}

    // a jó megoldás mivel a private függetlenül a csomagtól csak az osztályon belül érhető el
    private Singleton(){

    }
    // 2. étrehozom azonos típussal az osztályon belül a mezőt amiben az objektumot el fogom tárolni
    //public static Singleton instance;

    // 3. módosítom a védelmi szintet + final, hogy ne lehessen kívülről hozzáférni és egyszer kaphasson csak értéket
   //public static final Singleton instance;

    // 4. get-et készítek a mező értékének kiolvasásásra
    //private static final Singleton instance; // ha final akkor muszáj beállítani az értéket
    //private static final Singleton instance = new Singleton(); // közvetlenül példányosítás

    // 5. statc block, inicializáljuk az osztály szintű tulajodnságokat
    /*
    private static final Singleton instance;
    static {
        instance = new Singleton();
    }
    */

    // 6. a példány létrehozása a getInstance-ban történik
    private static volatile Singleton instance; // a getInstace-ban való létrehozás során a final nem használható

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private String content;

    public String getContent() {
        return content;
    }
    public void addContent(String content){
        if(this.content == null){
            this.content = content;
        } else {
            this.content += content;
        }
    }
}
