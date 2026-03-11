package prac.practice6;

import java.util.Arrays;

public class NVector {
    private double[] coordinates;

    public NVector(double[] coordinates) {
        this.coordinates = coordinates;
    }

//    public NVector(NVector other) {
//        this.coordinates = other.coordinates.clone();
//    }
//
//    public double norm() {
//        double sum = 0;
//        for (double coordinate : coordinates) {
//            sum += coordinate * coordinate;
//        }
//        return Math.sqrt(sum);
//    }
//
//    public double get(int index) {
//        return coordinates[index];
//    }
//
//    public void set(int index, double value) {
//        coordinates[index] = value;
//    }
//
//    public String toString() {
//        return "NVector{" + "coordinates=" + Arrays.toString(coordinates).replace('[', '(').replace(']', ')') + '}';
//    }

    public class VectorIterator implements Iterator<Double> {
        private int index = 0;

        public boolean hasNext() {
            if (index < coordinates.length) {
                return true;
            } else {
                return false;
            }
        }

        public Double next() {
            return coordinates[index++];
        }
    }

    public Iterator<Double> anonymousIterator() {
        return new Iterator<Double>() {
            private int index = 0;
            public boolean hasNext() {
                if (index < coordinates.length) {
                    return true;
                } else {
                    return false;
                }
            }

            public Double next() {
                return coordinates[index++];
            }
        };
    }

    public Iterator<Double> localIterator() {
        class LocalVectorIterator implements Iterator<Double> {
            private int index = 0;
            public boolean hasNext() {
                if (index < coordinates.length) {
                    return true;
                }  else {
                    return false;
                }
            }
            public Double next() {
                return coordinates[index++];
            }
        }
        return new LocalVectorIterator();
    }
}