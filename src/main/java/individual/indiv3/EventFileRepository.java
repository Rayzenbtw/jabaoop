package individual.indiv3;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class EventFileRepository {

    public static TreeMap<EventTime, List<Event>> loadFromFile(String filePath) throws IOException {
        TreeMap<EventTime, List<Event>> map = new TreeMap<>();
        Path path = Path.of(filePath);

        // Если файла нет — создать пустой
        if (!Files.exists(path)) {
            Files.createFile(path);
            return map; // вернём пустую карту
        }

        for (String line : Files.readAllLines(path)) {
            if (line.isBlank()) continue;

            // формат: yyyy-MM-dd HH:mm|title|location
            String[] parts = line.split("\\|");
            if (parts.length < 3) continue;

            EventTime time = EventTime.parse(parts[0].trim());
            Event event = new Event(parts[1].trim(), parts[2].trim());

            map.computeIfAbsent(time, k -> new ArrayList<>()).add(event);
        }

        return map;
    }

    public static void saveToFile(String filePath, TreeMap<EventTime, List<Event>> map) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(filePath))) {
            for (var entry : map.entrySet()) {
                EventTime time = entry.getKey();
                for (Event event : entry.getValue()) {
                    writer.write(time + "|" + event.getTitle() + "|" + event.getLocation());
                    writer.newLine();
                }
            }
        }
    }
}