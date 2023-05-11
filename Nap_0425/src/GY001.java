// 1. gyakorlófeladat
/*
Készítsünk programot, amely parancssori argumentumként két egész számot kap: elérhető pont és elért pont.
Ha az elért pont nagyobb, mint az elérhető pont, akkor írjuk ki a „Hibás adatok!” hibaüzenetet a képernyőre,
majd fejezzük be a program végrehajtását. Ha az adatok helyesek számoljuk ki egy új változóba az értéket (százalékos),
majd két tizedesjegyre kerekítve jelentsük meg a százalékos mutató!
 */

public class GY001 {
    public static void main(String[] args) {
        int elerhetoPont = Integer.parseInt(args[0]);
        int elertPont = Integer.parseInt(args[1]);

        if(elertPont > elerhetoPont){
            System.out.println("Hibás adatok, az elért pont nagyobb mint az elérhető pont!");
            return;
        } else {
            float elertEredmeny = (float)elertPont / elerhetoPont * 100;
            System.out.print("Az elért eredmény: ");
            System.out.printf( "%.2f",elertEredmeny);
            System.out.print("%");
        }

    }
}
