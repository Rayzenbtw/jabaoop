package prac.practice6;

public class Main {
    public static void main(String[] args) {
        NVector v = new NVector(new double[]{1.0, 5.0, 7.0});

        System.out.println("member inner class:");

        NVector.VectorIterator it = v.new VectorIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("anonymous inner class:");

        Iterator<Double> it2 = v.anonymousIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("local inner class:");

        Iterator<Double> it3 = v.localIterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
    }
}
