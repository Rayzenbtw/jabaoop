package individual.indiv4;

public class Booking implements Runnable {
    private final String surname;
    private final long stayMillis;
    private final Hotel hotel;
    private final Thread thread;

    public Booking(String surname, long stayMillis, Hotel hotel) {
        this.surname = surname;
        this.stayMillis = stayMillis;
        this.hotel = hotel;
        this.thread = new Thread(this);
    }

    public String getSurname() {
        return surname;
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        // Спроба заселення з очікуванням, якщо місць немає
        synchronized (hotel) {
            while (!hotel.checkIn(this)) {
                try {
                    hotel.wait();
                } catch (InterruptedException e) {
                    return;
                }
            }
        }

        // Проживання
        try {
            Thread.sleep(stayMillis);
        } catch (InterruptedException e) {
            return;
        }

        // Виселення
        hotel.checkOut(this);
    }

    @Override
    public String toString() {
        return "Заявка[" + surname + ", " + stayMillis + "мс]";
    }
}
