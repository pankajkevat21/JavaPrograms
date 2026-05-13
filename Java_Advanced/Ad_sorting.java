//package Java_Advanced;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//// Define a Car class which is comparable
//class C1ar implements Comparable {
//    public String brand;
//    public String model;
//    public int year;
//
//    public C1ar(String b, String m, int y) {
//        brand = b;
//        model = m;
//        year = y;
//    }
//
//    // Decide how this object compares to other objects
//    public int compareTo(Object obj) {
//        Car other = (Car)obj;
//        if (year < other.year) return -1; // This object is smaller than the other one
//        if (year > other.year) return 1;  // This object is larger than the other one
//        return 0; // Both objects are the same
//    }
//}
//
//public class Ad_sorting {
//    public static void main(String[] args) {
//        // Create a list of cars
//        ArrayList<Car> my1Cars = new ArrayList<Car>();
//        my1Cars.add(new Car("BMW", "X5", 1999));
//        my1Cars.add(new Car("Honda", "Accord", 2006));
//        my1Cars.add(new Car("Ford", "Mustang", 1970));
//
//        // Sort the cars
//        Collections.sort(my1Cars);
//
//        // Display the cars
//        for (Car c : my1Cars) {
//            System.out.println(c.brand + " " + c.model + " " + c.year);
//        }
//    }
//}
//
