package individual.indiv4;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final int capacity;
    private final List<Booking> guests = new ArrayList<>();

    public Hotel(int capacity) {
        this.capacity = capacity;
    }

    public synchronized boolean checkIn(Booking booking) {
        if (guests.size() < capacity) {
            guests.add(booking);
            log("Поселення УСПІШНЕ", booking);
            return true;
        } else {
            log("Поселення НЕВДАЛЕ (немає місць)", booking);
            return false;
        }
    }

    public synchronized void checkOut(Booking booking) {
        guests.remove(booking);
        log("Виселення", booking);
        notifyAll(); // звіль��илося місце — повідомляємо очікуючих
    }

    public synchronized Booking findBySurname(String surname) {
        for (Booking b : guests) {
            if (b.getSurname().equalsIgnoreCase(surname)) {
                return b;
            }
        }
        return null;
    }

    private void log(String action, Booking booking) {
        String time = java.time.LocalDateTime.now().format(
                java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        );
        int free = capacity - guests.size();
        System.out.println(time + " | " + action + " | " + booking + " | Вільно: " + free);

    }
}