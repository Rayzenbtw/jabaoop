package individual.indiv2;

public class MountainBike extends Bicycle {
    private int gears;

    public MountainBike(double preis, String produktname, Zustand zustand, int gears) {
        super(preis, produktname, zustand);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public void display() {
        System.out.println("[MountainBike] " + getProduktname() +
                " | Preis: " + getPreis() +
                " | Zustand: " + getZustand() +
                " | Gears: " + gears);
    }
}
