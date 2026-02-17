package prac.practice2;

public class Main {

    public static void main(String[] args) {
        Vector v1 = new Vector(3);
        v1.set(0, 3);
        v1.set(1, 4);
        v1.set(2, 12);

        System.out.print("v1 = ");
        v1.print();
        System.out.println("\nlen: " + v1.length() + "\n");

        System.out.println("copy");
        Vector v2 = new Vector(v1);
        System.out.print("v2 = ");
        v2.print();
        System.out.println("\nlen: " + v2.length() + "\n");

        System.out.println("arr");
        double[] coords = {2.0, 2.0, 1.0};
        Vector v3 = new Vector(coords);
        System.out.print("v3 = ");
        v3.print();
        System.out.println(v3);
        System.out.println("\nlen: " + v3.length() + "\n");


        // vector arr
        Vector[] arr = { new Vector(2), new Vector(3) };

        arr[0].set(0, 1);
        arr[0].set(1, 2);

        arr[1].set(0, 2);
        arr[1].set(1, 2);
        arr[1].set(2, 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i].print();
            System.out.println(" | len = " + arr[i].length());
        }
    }
}
