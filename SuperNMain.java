class Animal1 {
    String color = "White";

    Animal1() {
        System.out.println("Animal Constructor");
    }

    void sound1() {
        System.out.println("Animal makes sound and ");
        System.out.println("Animal makes sound and ");
        System.out.println("this is another line on the code");
    }
}

class Dog1 extends Animal1 {
    String color = "Black";

    Dog1() {
        // calls parent constructor
        super();

        System.out.println("Dog Constructor");
    }

    void display1() {

        // current class variable
        System.out.println("Dog color using this: " + this.color);

        // parent class variable
        System.out.println("Animal color using super: " + super.color);
    }

    void sound1() {

        // calling parent class method
        super.sound1();

        System.out.println("Dog barks");
    }
}

public class SuperNMain {
    public static void main(String[] args) {

        Dog1 d = new Dog1();

        d.display1();

        d.sound1();
    }
}