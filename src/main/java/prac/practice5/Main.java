package prac.practice5;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[] {
                new Rectangle(4, 3),
                new Circle(2.5),
                new Triangle(3, 4, 5),
                new Rectangle(5, 5)
        };

        for (Figure f : figures) {

            System.out.println("Фигура: " + f.getClass().getSimpleName());
            System.out.printf("Площадь = %.2f\n", f.area());
            System.out.printf("Периметр = %.2f\n", f.perimeter());

            if (f instanceof Rectangle rect) {
                System.out.printf("Диагональ = %.2f\n", rect.diagonal());
            }


        }
    }
}
