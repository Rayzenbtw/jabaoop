package prac.practice4;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Pixel(3, 4, "Red");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Pixel pixel = (Pixel) p2;
        pixel.setColor("Green");
        System.out.println(p2.toString());

//        if (p2 instanceof Pixel pixel) {
//            pixel.setColor("Green");
//        }
//        System.out.println(p2.toString());
    }
}