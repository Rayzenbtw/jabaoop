package prac.practice4;

public class Pixel extends Point {
    private String color;

    public Pixel(double x, double y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", color='" + color + '\'' +
                '}';
    }
}
