package prac.practice2;
import java.util.Arrays;

public class Vector {
    private double[] coordinates;

    public Vector(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("< 0");
        coordinates = new double[n];
    }

    public Vector(double[] coords) {
        if (coords == null || coords.length == 0)
            throw new IllegalArgumentException("null");
        coordinates = Arrays.copyOf(coords, coords.length);
    }

    public Vector(Vector other) {
        coordinates = Arrays.copyOf(other.coordinates, other.coordinates.length);
    }

    public double get(int index) {
        if (index < 0 || index >= coordinates.length)
            throw new IndexOutOfBoundsException("outofbounds");
        return coordinates[index];
    }

    public void set(int index, double value) {
        if (index < 0 || index >= coordinates.length)
            throw new IndexOutOfBoundsException("outofbounds");
        coordinates[index] = value;
    }

    public int size() {
        return coordinates.length;
    }

    public double length() {
        double sum = 0;
        for (double x : coordinates)
            sum += x * x;
        return Math.sqrt(sum);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }

    public void print() {
        System.out.print("(");
        for (int i = 0; i < coordinates.length; i++) {
            System.out.print(coordinates[i]);
            if (i < coordinates.length - 1)
                System.out.print(", ");
        }
        System.out.print(")");
    }

}
