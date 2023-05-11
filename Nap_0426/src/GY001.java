/*

Téglalap osztály, a, b lebegőpontos tulajdonsággal, private
Biztosítsunk a és b változókhoz get és set metódusokat (beállításnál csak pozitív értékeket fogadunk el)
Készítsünk egy terület és kerület metódust ami visszaadja az a és b oldaló téglalap kerületét és területét
 */

public class GY001 {
    public static void main(String[] args) {
    Teglalap t1 = new Teglalap();
    t1.setA(15);
    t1.setB(37.5f); //minden tört double típus, ezért a végére f-et kell írni, hogy float legyen
    System.out.println("A téglalap a oldala: " + t1.getA() + ", a téglalap b oldala: " + t1.getB());
    System.out.println("A téglalap területe: " + t1.terulet());
    System.out.println("A téglalap területe: " + t1.kerulet());
    }
}
class Teglalap{
    private float a;
    private float b;
    public float getA() {
        return a;
    }
    public float getB() {
        return b;
    }
    public void setA(float a) {
        if(a <=0){
            throw new IllegalArgumentException("Az a nem lehet <= 0!");
        }
        this.a = a;
    }
    public void setB(float b) {
        if(b <= 0){
            throw new IllegalArgumentException("A b nem lehet <= 0!");
        }
        this.b = b;
    }
    public float terulet(){
        return a * b;
    }
    public float kerulet(){
        return 2 * (a+b);
    }
}
