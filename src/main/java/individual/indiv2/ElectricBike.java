package individual.indiv2;

public class ElectricBike extends Bicycle {
    private double akku;
    private double drehmoment;

    public ElectricBike(double preis, String produktname, Zustand zustand, double akku, double drehmoment) {
        super(preis, produktname, zustand);
        this.akku = akku;
        this.drehmoment = drehmoment;
    }

    public double getAkku() {
        return akku;
    }

    public void setAkku(double akku) {
        this.akku = akku;
    }

    public double getDrehmoment() {
        return drehmoment;
    }

    public void setDrehmoment(double drehmoment) {
        this.drehmoment = drehmoment;
    }

    @Override
    public void display() {
        System.out.println("[ElectricBike] " + getProduktname() +
                " | Preis: " + getPreis() +
                " | Zustand: " + getZustand() +
                " | Akku: " + akku +
                " | Drehmoment: " + drehmoment);
    }
}
