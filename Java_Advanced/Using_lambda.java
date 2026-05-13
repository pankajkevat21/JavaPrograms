package Java_Advanced;
import java.util.ArrayList;
import java.util.Collections;

// Define a Car class
class Car1 {
    public String brand;
    public String model;
    public int year;

    public Car1(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

public class Using_lambda {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Use a lambda expression to sort the cars
        Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1;
            Car b = (Car) obj2;
            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0;
        });

        // Display the cars
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}

