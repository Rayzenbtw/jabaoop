package individual.indiv2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BikeShop implements Serializable {
    private List<Bicycle> bikes = new ArrayList<>();

    public void add(Bicycle bike) {
        bikes.add(bike);
    }

    public void list() {
        if (bikes.isEmpty()) {
            System.out.println("Коллекция пуста.");
            return;
        }
        for (Bicycle b : bikes) {
            b.display();
        }
    }

    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
        }
    }

    public static BikeShop loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (BikeShop) in.readObject();
        }
    }
}