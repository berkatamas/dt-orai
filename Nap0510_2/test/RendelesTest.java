import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RendelesTest {

    @Test
    public void setId(){ // helyes értékre nem dob hibát
        Rendeles r = new Rendeles();
        assertDoesNotThrow(
                () -> {r.setId(5);}
        ); // void metódus, amit tesztelni tudok: hiba nélkül lefut
    }

    @Test
    public void setId2(){ // setId dob-e hibát negatív számra
        Rendeles r = new Rendeles();
        assertThrows(IllegalArgumentException.class,
                () -> {r.setId(-5);}
        );
    }

    // a getAr akkor lehet 0 ha a pizza string üres = input: a típus üres, elvárt kimenet akár 0
    @Test
     public void getAr(){
        // üres a pizza, berakok 0, ha lekérdezem 0
        Rendeles r = new Rendeles();
        //megadom a paramétereket amiket tesztelni szeretnéks
        r.setTipus("");
        r.setAr(0);

        // lefutattom és megnézem, visszaadja-e amit várok
        assertEquals(r.getAr(), 0);
        }

    @Test
     public void getAr2(){
        Rendeles r = new Rendeles();
        r.setTipus("Magyaros");
        r.setAr(0);

        assertEquals();
        }


}