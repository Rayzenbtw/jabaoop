package prac.practice5;

public class Rectangle extends Figure {
    private double width;
    private double height;
    String info = "figure";


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    // диагональ
    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
