package individual.indiv3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class EventTime implements Comparable<EventTime> {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private final LocalDateTime dateTime;

    public EventTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public static EventTime parse(String text) {
        return new EventTime(LocalDateTime.parse(text, FORMATTER));
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public int compareTo(EventTime other) {
        return this.dateTime.compareTo(other.dateTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventTime)) return false;
        EventTime eventTime = (EventTime) o;
        return Objects.equals(dateTime, eventTime.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime);
    }

    @Override
    public String toString() {
        return dateTime.format(FORMATTER);
    }
}