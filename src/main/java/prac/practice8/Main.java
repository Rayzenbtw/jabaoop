package prac.practice8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        // Comparator для сортировки Point (по x, потом по y)
        Comparator<Point> pointComparator = Comparator.comparingDouble(Point::getX).thenComparingDouble(Point::getY);

        ArrayList<Point> list = new ArrayList<>();

        // a) Заполнение случайными точками (с повторами)
        for (int i = 0; i < 10; i++) {
            double x = rand.nextInt(5);
            double y = rand.nextInt(5);
            list.add(new Point(x, y));
        }

        list.add(new Point(1, 1));
        list.add(new Point(1, 1));
        try {
            list.remove(10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // b) вывод foreach
        System.out.println("ArrayList elements:");
        for (Point p : list) {
            System.out.println(p);
        }

        // c) удаление через iterator
        System.out.println("\nEnter point to remove (x y):");
        double rx = scanner.nextDouble();
        double ry = scanner.nextDouble();

        Iterator<Point> it = list.iterator();

        while (it.hasNext()) {
            Point p = it.next();
            if (p.equals(new Point(rx, ry))) {
                it.remove();
            }
        }

        System.out.println("\nAfter removal:");
        for (Point p : list) {
            System.out.println(p);
        }

        // d) тест методов ArrayList
        System.out.println("\nArrayList methods test:");
        System.out.println("Size: " + list.size());
        System.out.println("Contains (1,1): " + list.contains(new Point(1, 1)));

        if (!list.isEmpty()) {
            System.out.println("First element: " + list.get(0));
        }

        // e) сортировка и поиск
        Collections.sort(list, pointComparator);

        System.out.println("\nSorted ArrayList:");
        for (Point p : list) {
            System.out.println(p);
        }

        int index = Collections.binarySearch(list, new Point(1, 1), pointComparator);
        System.out.println("Binary search (1,1): " + index);


        // ===================== TREESET =====================
        System.out.println("\n=== TreeSet ===");

        TreeSet<Point> set = new TreeSet<>(pointComparator);

        // a) случайные данные
        for (int i = 0; i < 10; i++) {
            double x = rand.nextInt(5);
            double y = rand.nextInt(5);
            set.add(new Point(x, y));
        }

        set.add(new Point(2, 2));
        set.add(new Point(2, 2));

        // b) foreach
        System.out.println("TreeSet elements:");
        for (Point p : set) {
            System.out.println(p);
        }

        // c) удаление через iterator
        System.out.println("\nEnter point to remove from TreeSet (x y):");
        rx = scanner.nextDouble();
        ry = scanner.nextDouble();

        Iterator<Point> setIterator = set.iterator();

        while (setIterator.hasNext()) {
            Point p = setIterator.next();
            if (p.equals(new Point(rx, ry))) {
                setIterator.remove();
            }
        }

        System.out.println("\nAfter removal:");
        for (Point p : set) {
            System.out.println(p);
        }

        // d) методы TreeSet
        System.out.println("\nTreeSet methods test:");
        System.out.println("Size: " + set.size());
        System.out.println("Contains (2,2): " + set.contains(new Point(2, 2)));

        if (!set.isEmpty()) {
            System.out.println("First: " + set.first());
            System.out.println("Last: " + set.last());
        }

        scanner.close();
    }
}