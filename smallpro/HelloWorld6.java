// HelloWorld6.java
package smallpro;

public class HelloWorld6 {
    public static void main(String[] args) {
        int n = 11;
        boolean prime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}