import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Test {
    public static void main(String[] args) {
        ArrayList<Rendeles> rendelesek = getRendelesek("rendelesek.csv");
        ArrayList<String> pizzaNevek = getPizzaNevek(rendelesek);
        pizzakKiir(pizzaNevek, "pizzak.csv");
        int pizzaNevekDb = getPizzaDb(rendelesek);
        System.out.println(pizzaNevekDb + " féle pizza van a listán.");

    }

    public static ArrayList<Rendeles> getRendelesek(String fajlnev){
        ArrayList<Rendeles> rendelesek = new ArrayList<Rendeles>();  //Lista, nem tudom mennyi eleme lesz
        try(
                Reader bejovoAdatfolyam = new FileReader(fajlnev);
                BufferedReader olvaso = new BufferedReader(bejovoAdatfolyam);
        ) {
            String rendeles = "";
            olvaso.readLine(); // egy sort beolvasok de nem töltöm be sehova, ezzel kihagyom a fejléc adatokat
            while (true){
                // Beolvasok egy sort
                rendeles = olvaso.readLine();

                // Ha elfogytak a sorok, kilépek
                if(rendeles == null) break;

                Rendeles r = new Rendeles();

                // Szétszedem a sort
                String[] mezok = rendeles.split(";");

                // Minden mezőnek beállítjuk az értékét
                r.setId(Integer.parseInt(mezok[0]));
                r.setPizzaId(Integer.parseInt(mezok[1]));
                r.setTipus(mezok[2]);
                r.setAr(Integer.parseInt(mezok[3]));
                r.setDarab(Integer.parseInt(mezok[4]));
                r.setCim(mezok[5]);

                // Hozzáadom a listához
                rendelesek.add(r);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rendelesek;
    }

    public static void pizzakKiir(ArrayList<String> pizzak, String fajlnev){
        try(
                //létrehozom írásra a fájlt
                Writer kimenoAdatfolyam = new FileWriter(fajlnev);
                PrintWriter kiiro = new PrintWriter(kimenoAdatfolyam);
        )
        {
            // egyesével kiírom a pizzákat
            for (int i = 0; i < pizzak.size(); i++) {
                kiiro.println(pizzak.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<String> getPizzaNevek(ArrayList<Rendeles> rendelesek){
        // kigyűjtöm a pizzaneveket
        ArrayList<String> pizzak = new ArrayList<String>(); // ebben fogom tárolni a pizzaneveket
        for (Rendeles r: rendelesek) {
            String pizza = r.getTipus(); // lekérdezem az aktuális rendelésben a pizza nevét
            if (!pizzak.contains(pizza)) {
                pizzak.add(pizza);
            }
            Collections.sort(pizzak); // abc sorrendbe rendezem a pizzákat
        }
        return pizzak;
    }

    public static int getPizzaDb(ArrayList<Rendeles> pizzaNevek){
        ArrayList<String> egyediPizzanevek = getPizzaNevek(pizzaNevek);
        /*
        int pizzaNevekDb = getPizzaNevek(pizzaNevek).size();
        return pizzaNevekDb;
        */
        return egyediPizzanevek.size();
    }

    public static String getLegdragabbPizzaNeve(ArrayList<Rendeles> rendelesek){
        Collections.sort(rendelesek, new Comparator<Rendeles>() {
            @Override
            public int compare(Rendeles o1, Rendeles o2) {
                // - o2 előbb mint o1, 0 o1 = o2, + o1 előbb van mint o2
            }
        });


    }

}
