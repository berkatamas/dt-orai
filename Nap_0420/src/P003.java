public class P003 {
    public static void main(String[] args) {
        String szo = args[0];

        //cseréljük fel a szöveg második felét az elsőre
        System.out.println("A kapott szó: " + szo);
        int szovegFele = szo.length()/2;
        String szoElso = szo.substring(0,szovegFele);
        String szoMasodik = szo.substring(szovegFele, szo.length());
        String ujSzo = szoMasodik + szoElso;

        System.out.println("Az új szó: "  + ujSzo);

        //cseréljük ki az a karaktereket i karakterekre
        ujSzo = ujSzo.replace('a','i');
        System.out.println("A szó a karaktercserék után: " + ujSzo);

        //StringBuilder vs StingBuffer ua csak a Buffer többszálú, a Builder egyszálú
        StringBuilder sb = new StringBuilder(szo); //új StringBuilder változó létrehozása explicit konstruktorhívással
        System.out.println("Hossz: " + sb.length() + ", kapacitás: " + sb.capacity());
        sb.append('a');
        System.out.println("Hossz: " + sb.length() + ", kapacitás: " + sb.capacity());
        System.out.println(sb);
        //sb.replace(0, sb.length(), ) a replace ebben az esetben adott pozición történő szöveg cseréje lesz


    }
}
