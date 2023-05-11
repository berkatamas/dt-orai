package com.dt.io.feladat2;

import java.io.*;

public class Teszt {
    public static void main(String[] args) {
        try(
                Reader bejovoAdatfolyam = new FileReader("emailek.be");
                BufferedReader olvaso = new BufferedReader(bejovoAdatfolyam);
                Writer kimenoAdatfolyam = new FileWriter("emailek.ki");
                PrintWriter iro = new PrintWriter(kimenoAdatfolyam);
            ){

            String emailCim = "";
            while (true){
                emailCim = olvaso.readLine();
                if(emailCim == null) break;

                //System.out.println(emailCim);
                //email verifikáció
                // [] egy helyre több lehetséges opció
                // {n} a fenti feltételt n hoszúságra kiterjetsztjük
                // - tajszám: [0-9]{9}
                // []+ vagy ? vagy * jelentése: + legalább 1 előfordulás, ? 0 vagy 1 előfordulás, * bármennyi előfordulás
               // if(emailCim.matches("[a-zA-Z]+@[a-zA-Z]+")) System.out.println("Van benne kukac jel, " + emailCim);
                //if(emailCim.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                //        "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
                if(emailCim.matches("^[a-z][a-z0-9.]*@[a-z]+.[a-z]{2,3}$")){
                    System.out.println("Az email cím helyes: " + emailCim);
                    iro.println(emailCim);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
