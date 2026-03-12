package individual.indiv2;

public class Main {
    public static void main(String[] args) {
        BikeShop shop = new BikeShop();
        ConsoleMenu menu = new ConsoleMenu(shop);
        menu.run();
    }
}