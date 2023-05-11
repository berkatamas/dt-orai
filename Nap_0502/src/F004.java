public class F004 {
    public static void main(String[] args) {
        // 4. feladat tesztek
        Auto a = new Auto( "Skoda Fabia", (short)2000);
        a.setFogyasztas(7.3f);

        System.out.println("Kirándulás autóval: " + a.getUtikoltseg(480.7f, 12.5f));

        Taxi t = new Taxi("Skoda Fabia", (short)2000, "Berka Tamás ev", 300);
        t.setFogyasztas(7.3f);
        System.out.println("Kirándulás taxival: " + t.getUtikoltseg(480.7f, 12.5f));

        Auto a2 = new Taxi("Skoda Fabia", (short)2000, "Berka Tamás ev", 300);
        a2.setFogyasztas(7.3f);
        System.out.println("Kirándulás taxival (auton keresztül): " + a2.getUtikoltseg(480.7f, 12.5f));
    }


}
