package TestingPrograms;
public class List {

    static float factorialRecursive(float n) {
        // FIX: Base case must return 1 to stop the recursion.
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call.
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        float number = 5;

        System.out.println("Factorial using Recursion = " + factorialRecursive(number));
    }
}