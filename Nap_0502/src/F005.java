/*
OOP 5. feladat
 */

public class F005 {
    public static void main(String[] args) {
        Henger h1 = new Henger(12.2f, 25.3f);
        System.out.println("h1 felszín: " + h1.getFelszin() + "cm2, h1 térfogat: " + h1.getTerfogat() + "cm3");

        // pl a vas sűrűsége: 7,874 g/cm3
        // getSuly() --> adjuk vissza kb-ban a henger súlyát
        TomorHenger h2 = new TomorHenger(12.2f, 25.3f, 7.874f);
        System.out.println("h2 felszín: " + h2.getFelszin() + "cm2, h2 térfogat: " + h2.getTerfogat() + "cm3 súly: " + h2.getSuly() + "Kg");

        Cso h3 = new Cso(12.2f, 25.3f, 7.874f, 0.5f);
        System.out.println("h3 felszín: " + h3.getFelszin() + "cm2, h3 térfogat: " + h3.getTerfogat() + "cm3 súly: " + h3.getSuly() + "Kg");
    }
}

class Cso extends TomorHenger{
    // + tulajdonság a falvastagság
    // felszín: belső palást + külső palást
    // súly: térfogat * sűrűség
    // térfogat: külső térfogat ( alapterület * magasság) - belső téfogat (alapterület falvastagsággal csökkentve * magasság)
    private float falvastagsag;

//GETTER SETTER
    public float getFalvastagsag() {
        return falvastagsag;
    }
    public void setFalvastagsag(float falvastagsag) {
        if(falvastagsag <= 0){
            throw new IllegalArgumentException("A falvastagság nem lehet 0 vagy kisebb!");
        }
        if(getR() <= falvastagsag){
            throw new IllegalArgumentException("A falvastagság túl nagy!");
        }
        this.falvastagsag = falvastagsag;
    }

//KONSTRUKTOROK
    public Cso(float r, float m, float suruseg, float falvastagsag) {
        super(r, m, suruseg);
        setFalvastagsag(falvastagsag);
    }

//METÓDUSOK

    @Override
    public float getTerfogat() {
        //return super.getTerfogat(); //az ősbeli eredmény változatával térjen vissza
        float kulsoTerfogat = super.getTerfogat();
        float belsoTerfogat = (float)((getR() - falvastagsag) * (getR() - falvastagsag) * Math.PI * getM());
        return kulsoTerfogat - belsoTerfogat;
    }

    @Override
    public float getFelszin() {
        float kulsoPalast = (float)(getR() * 2 * Math.PI * getM());
        float belsoPalast = (float)((getR() - falvastagsag) * 2 * Math.PI * getM());
        return kulsoPalast + belsoPalast;
    }
}

class TomorHenger extends Henger{
//VÁLTOZÓK
    private float suruseg;

//GETTER SETTER
    public float getSuruseg() {
        return suruseg;
    }
    public void setSuruseg(float suruseg) {
        if(suruseg <= 0){
            throw new IllegalArgumentException("Csak 0-nál nagyobb sűrűség adható!");
        }
        this.suruseg = suruseg;
    }

//KONSTRUKTOROK
    public TomorHenger(float r, float m, float suruseg){
        super(r, m);
        setSuruseg(suruseg);

    }

//METÓDUSOK
    public float getSuly(){
        return getTerfogat() * suruseg / 1000; // 1 kg = 1000g
    }

}

class Henger{
    private float r; // henger sugara (cm)
    private float m; // henger magassága (cm)

//GETTER SETTER


    public float getR() {
        return r;
    }

    public void setR(float r) {
        if(r <= 0){
            throw new IllegalArgumentException("A kör sugara nem lehet 0 vagy annál kisebb!");
        }
        this.r = r;
    }

    public float getM() {
        return m;
    }

    public void setM(float m) {
        if(m <= 0){
            throw new IllegalArgumentException("A magasság nem lehet 0 vagy annál kisebb!");
        }
        this.m = m;
    }


//KONSTRUKTOROK
    public Henger(float r, float m) {
        setR(r);
        setM(m);
    }

//METÓDUSOK
    public float getTerfogat(){
        float korT = (float)(r * r * Math.PI); // területszámítás
        return korT * m;
    }
    public float getFelszin(){
        float korT = (float)(r * r * Math.PI);
        float palastT = (float)(m * 2 * r * Math.PI);
        return palastT + 2 * korT;
    }
}
