package prac.practice8;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point point)) return false;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
