// iteráció (ciklusok)

public class P0003 {
    public static void main(String[] args) {

        // írjuk ki a páros számokat 1-100 között
        for(int i = 1;i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //v2
        for(int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }
    }
}
