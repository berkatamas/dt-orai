public class Rendeles {
    private int id;
    private int pizzaId;
    private String tipus;
    private int ar;
    private int darab;
    private String cim;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id < 0){
            throw new IllegalArgumentException("Az id nem lehet negatív!");
        }
        this.id = id;
    }
    public int getPizzaId() {
        return pizzaId;
    }
    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }
    public String getTipus() {
        return tipus;
    }
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    public int getAr() {
        return ar;
    }
    public void setAr(int ar) {
        this.ar = ar;
    }
    public int getDarab() {
        return darab;
    }
    public void setDarab(int darab) {
        this.darab = darab;
    }
    public String getCim() {
        return cim;
    }
    public void setCim(String cim) {
        this.cim = cim;
    }
}
