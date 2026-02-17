package prac.practice1;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public boolean contains(Point p) {
        double dx = p.getX() - center.getX();
        double dy = p.getY() - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}