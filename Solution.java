
import java.sql.SQLOutput;
import java.util.*;
class Animal {
    String color = "white";

    Animal() {
        System.out.println("Animal constructor");
    }

    void show() {
        System.out.println("Animal method");
    }
}

class Dog extends Animal {
    String color = "black";

    Dog() {
        this(10); // calls another constructor of same class
        System.out.println("Dog constructor");
    }

    Dog(int x) {
        super(); // calls parent constructor
        System.out.println("Dog parameterized constructor");
    }

    void display() {
        System.out.println(super.color);

        System.out.println(this.color);  // current class
        System.out.println(super.color); // parent class

        this.show();   // current class method (if overridden)
        super.show();  // parent class method
    }
}

class Solution {

    public static void main(String[] args) {
   Dog d1 = new Dog();


    }
}