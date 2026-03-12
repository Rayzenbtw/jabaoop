package individual.indiv2;

import java.util.Scanner;

public class ConsoleMenu {
    private BikeShop shop;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleMenu(BikeShop shop) {
        this.shop = shop;
    }

    public void run() {
        while (true) {
            System.out.println("\n==== BikeShop Menu ====");
            System.out.println("1. Добавить MountainBike");
            System.out.println("2. Добавить ElectricBike");
            System.out.println("3. Показать все");
            System.out.println("4. Сохранить в файл");
            System.out.println("5. Загрузить из файла");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1 -> addMountainBike();
                    case 2 -> addElectricBike();
                    case 3 -> shop.list();
                    case 4 -> save();
                    case 5 -> load();
                    case 0 -> {
                        System.out.println("Выход...");
                        return;
                    }
                    default -> System.out.println("Неверный выбор.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private void addMountainBike() {
        System.out.print("Название: ");
        String name = scanner.nextLine();
        System.out.print("Цена: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Состояние (NEU/GEBRAUCHT/DEFEKT): ");
        Zustand z = Zustand.valueOf(scanner.nextLine().trim().toUpperCase());
        System.out.print("Gears: ");
        int gears = Integer.parseInt(scanner.nextLine());

        shop.add(new MountainBike(price, name, z, gears));
        System.out.println("MountainBike добавлен.");
    }

    private void addElectricBike() {
        System.out.print("Название: ");
        String name = scanner.nextLine();
        System.out.print("Цена: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Состояние (NEU/GEBRAUCHT/DEFEKT): ");
        Zustand z = Zustand.valueOf(scanner.nextLine().trim().toUpperCase());
        System.out.print("Akku: ");
        double akku = Double.parseDouble(scanner.nextLine());
        System.out.print("Drehmoment: ");
        double drehmoment = Double.parseDouble(scanner.nextLine());

        shop.add(new ElectricBike(price, name, z, akku, drehmoment));
        System.out.println("ElectricBike добавлен.");
    }

    private void save() throws Exception {
        System.out.print("Имя файла: ");
        String file = scanner.nextLine();
        shop.saveToFile(file);
        System.out.println("Сохранено.");
    }

    private void load() throws Exception {
        System.out.print("Имя файла: ");
        String file = scanner.nextLine();
        shop = BikeShop.loadFromFile(file);
        System.out.println("Загружено.");
    }
}