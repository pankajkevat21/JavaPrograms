import java.util.Random;

public class numberGen {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random number between 1 and 6
        int diceValue = random.nextInt(6) + 1;  // nextInt(6) gives 0-5, +1 gives 1-6
                     if(diceValue==6){
                         System.out.println("code is wrong");
                     }
        // Print the result
        System.out.println("Random number between 1 and 6: " + diceValue);
    }
}