package individual.indiv3;

public class Event {
    private final String title;
    private final String location;

    public Event(String title, String location) {
        this.title = title;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return title + " (" + location + ")";
    }
}