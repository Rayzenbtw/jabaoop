package individual.indiv4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(2);

        Booking b1 = new Booking("Ivanov", 3000, hotel);
        Booking b2 = new Booking("Petrenko", 4000, hotel);
        Booking b3 = new Booking("Shevchenko", 2000, hotel);

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Прихід заявок у різний час
        scheduler.schedule(b1::start, 0, TimeUnit.MILLISECONDS);
        scheduler.schedule(b2::start, 500, TimeUnit.MILLISECONDS);
        scheduler.schedule(b3::start, 1000, TimeUnit.MILLISECONDS);

        // Пошук постояльця через 1500 мс
        scheduler.schedule(() -> {
            Booking found = hotel.findBySurname("Ivanov");
            System.out.println("Пошук Ivanov -> " + (found != null ? "знайдений" : "не знайдений"));
        }, 1500, TimeUnit.MILLISECONDS);

        // Завершення планувальника після демонстрації
        scheduler.schedule(scheduler::shutdown, 6000, TimeUnit.MILLISECONDS);
    }
}