/*
2.	Készítsünk programot, amely parancssori argumentumként két egész számot kap: testmagasság (cm-ben mérve) és testsúly (kg-ban mérve).
Ha a magasság kisebb, mint 140 vagy nagyobb mint 210, illetve a súly kevesebb mint 40, vagy több, mint 150,
akkor szövegesen tájékoztassa a felhasználót, hogy a program hibás adatokat kapott és lépjen ki.

Ha az adatok helyesek számoljuk ki a testtömeg indexet, amely számítás az alábbiak szerint történik:
TTI = súly (kg-ben) / magasság (m)2 (négyzet). Jelenítse meg a számított értéket két tizedes pontossággal.
 */

/*
float magassagM = magassag / 100.0f; -> floatként értelmezi a 100-at
float tti = suly / (magassagM * magassagM);
System.out.println("TTI: " + tti;

 */

public class GY002 {
    public static void main(String[] args) {
        int testmagassag = Integer.parseInt(args[0]);
        int testsuly = Integer.parseInt(args[1]);

        if(testmagassag < 140 || testmagassag > 210 || testsuly < 40 || testsuly > 150){
            System.out.println("Hibás adatok (testmagasság vagy testsúly)");
            return;
        }

        float testtomegIndex = testsuly / (((float)testmagassag/100)*((float)testmagassag/100));
        System.out.print("Testtömeg index (TTI): ");
        System.out.printf( "%.2f",testtomegIndex);
        System.out.println("%");

        //órai munka
        float magassagM = testmagassag / 100.0f;
        float tti = testsuly / (magassagM * magassagM);
        System.out.println("TTI: " + tti);

    }
}
