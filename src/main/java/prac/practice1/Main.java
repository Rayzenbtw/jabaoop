package prac.practice1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(1, 2),
                new Point(3, 4),
                new Point(1, 2),
                new Point(6, 2),
                new Point(-1, 0),
                new Point(2, 3),
                new Point(1, 2)
        };

        Circle circle = new Circle(new Point(1, 2), 5);

        System.out.println("Точки в колі:");
        for (Point p : points) {
            if (circle.contains(p)) {
                System.out.println(p);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nx: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();

        Point input = new Point(x, y);

        int count = 0;
        for (Point p : points) {
            if (p.equals(input)) {
                count++;
            }
        }

        System.out.println("Рівних точок: " + count);
    }
}