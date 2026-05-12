package Java_Advanced;
class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof!");
        }
    }

public class Annotations {
        public static void main(String[] args) {
            Animal myDog = new Dog();
            myDog.makeSound();
        }
    }