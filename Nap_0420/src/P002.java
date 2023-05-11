// Elágazások

public class P002 {
    public static void main(String[] args) {
        //byte erdemjegy = Integer.parseInt(args[0]); Nem jó mert az 1 bájtos byte-ba nem rakhatok 4 byteos intet
        byte erdemjegy = Byte.parseByte(args[0]);

        // v1 egyágú elágazás
        // külön if-ek

        // v2 egyágú elágazás
        if(erdemjegy == 5){
            System.out.println("Jeles (5)");
        } else if (erdemjegy == 4){
            System.out.println("jó (4)");
        } else if (erdemjegy == 3){
            System.out.println("Közepes (3)");
        } else if (erdemjegy == 2){
            System.out.println("Elégséges (2)");
        } else if (erdemjegy == 1){
            System.out.println("Elégtelen (1)");
        }

        // v3
        switch(erdemjegy){
            case 5:
                System.out.println("Jeles (5)");
                break;
            case 4:
                System.out.println("jó (4)");
                break;
            case 3:
                System.out.println("Közepes (3)");
                break;
            case 2:
                System.out.println("Elégséges (2)");
                break;
            case 1:
                System.out.println("Elégtelen (1)"); //utolsó case-nél nem kötelező a break
                break;
        }
    }
}
