package individual.indiv3;

import java.io.IOException;
import java.util.*;

public class Main {
    private static final String INPUT_FILE = "events_input.txt";
    private static final String OUTPUT_FILE = "events_output.txt";

    public static void main(String[] args) throws IOException {
        TreeMap<EventTime, List<Event>> schedule = EventFileRepository.loadFromFile(INPUT_FILE);

        // 1) Надрукувати вміст TreeMap
        System.out.println("=== TreeMap contents ===");
        printMap(schedule);

        // 2) Ввести ключ і перевірити чи є, якщо є — надрукувати значення
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter date-time (format yyyy-MM-dd HH:mm):");
        String input = scanner.nextLine();
        EventTime key = EventTime.parse(input);

        if (schedule.containsKey(key)) {
            System.out.println("Found events at " + key + ":");
            schedule.get(key).forEach(System.out::println);
        } else {
            System.out.println("No events at " + key);
        }

        // 3) Отримати множину ключів TreeMap та роздрукувати її
        System.out.println("\n=== Key set ===");
        Set<EventTime> keySet = schedule.keySet();
        System.out.println(keySet);

        // 4) Видалити значення за ключом
        System.out.println("\nEnter date-time to remove (format yyyy-MM-dd HH:mm):");
        String removeInput = scanner.nextLine();
        EventTime removeKey = EventTime.parse(removeInput);

        schedule.remove(removeKey);

        System.out.println("\n=== TreeMap after удаления ===");
        printMap(schedule);

        System.out.println("\n=== Key set AFTER deletion (same object) ===");
        System.out.println(keySet); // тот же keySet, видно что он изменился

        // вывод в файл
        EventFileRepository.saveToFile(OUTPUT_FILE, schedule);
        System.out.println("\nData saved to " + OUTPUT_FILE);
    }

    private static void printMap(TreeMap<EventTime, List<Event>> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}