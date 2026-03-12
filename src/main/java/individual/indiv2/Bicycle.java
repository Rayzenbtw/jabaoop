package individual.indiv2;

import java.io.Serializable;

public abstract class Bicycle implements Serializable {
    private double preis;
    private String produktname;
    private Zustand zustand;

    public Bicycle(double preis, String produktname, Zustand zustand) {
        this.preis = preis;
        this.produktname = produktname;
        this.zustand = zustand;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getProduktname() {
        return produktname;
    }

    public void setProduktname(String produktname) {
        this.produktname = produktname;
    }

    public Zustand getZustand() {
        return zustand;
    }

    public void setZustand(Zustand zustand) {
        this.zustand = zustand;
    }

    public abstract void display();
}