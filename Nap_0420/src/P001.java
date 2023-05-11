// Operátorok alkalmazása

public class P001 {
    public static void main(String[] args) {
        // SZÖVEGES OPERÁTOROK
        String szo1 = "alma";
        String szo2 = "fa";
        String szo3 = "birs";

        String osszefuzott = szo3 + szo1 + szo2;
        System.out.println("Eredmény: " + osszefuzott);

        // írjuk ki egyetlen utasítással 3 + 2 = szöveget és a kifejezés eredményét
        // a java szöveghez való fűzésnél bármilyen egyéb adattípust szövegéé alakít (automata konverzió stirngre)
        System.out.println("3 + 2 = " + 3 + 2);
        System.out.println(3 + 2 + " = 3 + 2");

        // helyes eredmény, zárójelekkel módosítom a precedenciát
        // Így először kiszámolja a zárójelben a számokat, majd hozzáfűzi a stringhez
        System.out.println("3 + 2 = " + (3 + 2));






        // LOGIKAI OPERÁTOROK (true/false), tárolása boolean értékben történik
        // összehasonlító operátor == != ...
        boolean felt1 = (3 + 2) == 5;
        System.out.println("felt1 értéke: " + felt1);
        // szöveget nem lehet kisebb/nagyobb összehasonlítani, kivéve 1-1 karaktert
        boolean felt2 = 'A' < '0';
        System.out.println("felt2 értéke: " + felt2);

        // igaz-e, hogy 5*3 szorzata nagyobb vagy egyenlő mint 10 és kisebb vagy egyenlő 20
        //boolean felt3 = 10 <= 5*3 <= 20; // HIBA: két logikai operátor nem lehet
        // több logikai kif. eredményét logikai operátorok segítsgével tudjuk egyesíteni.
        //felt1 && felt2 igaz ha mindkét feltétel igaz (és operátor)
        // felt1 || felt2 igaz ha legalább az egyik feltétel igaz (vagy operátor)
        boolean felt5 = 10 <= 5*3 && 5*3 <= 12;
        System.out.println("felt5 értéke: " + felt5);
        boolean felt6 = 10 <= 5*3 || 5*3 <= 12;
        System.out.println("felt6 értéke: " + felt6);






        // NUMERIKUS OPERÁTOROK
        int a = 12;
        int b = 5;

        //alapműveletek
        int osszeg = a + b;
        int kulonbseg = a - b;
        long szorzas = a * b;
        //float hanyados = a / b;
        // javaban ha két egészet osztok, az eredménye is egész lesz
        // láttassuk úgy a javaval hogy az egyik tényező tört és akkor ez eredmény is lehet tört, kasztolunk
        float hanyados = (float)a / b; //kasztolom az egyik értéket törtre

        int maradek = a % b; // maradékképzés vagy modulo

        System.out.println(a + " + " + b + " = " + osszeg);
        System.out.println(a + " - " + b + " = " + kulonbseg);
        System.out.println(a + " * " + b + " = " + szorzas);
        System.out.println(a + " / " + b + " = " + hanyados);
        System.out.println(a + " % " + b + " = " + maradek);


        //Növeljük meg az a vátozó értékét 10-el
        //a = a + 10;
        a += 10;

        System.out.println(" a értéke: " + a);
        a++;
        System.out.println(" a értéke: " + a);
        ++a;
        System.out.println(" a értéke: " + a);
        // a prefix és postfix operátoroknak a kifejezések építésében van speciális szerepük
        System.out.println(" a értéke: " + a++); // előbb kiírjuk az a értékét majd hozzáadunk egyet
        System.out.println(" a értéke: " + ++a); // előbb hozzáadunk egyet majd kiírjuk az értékét
        //
    }
}
