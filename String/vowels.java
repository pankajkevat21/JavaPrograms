package String;

public class vowels {
    public static void main(String[] args) {
        // Input string in which vowels will be counted
        String inputString = "ProgrammingIsFun20";
        // Stores the total number of vowels found
        int vowelCount = 0;
        // Array containing all lowercase and uppercase vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        // Traverse each character of the input string
        for (int i = 0; i < inputString.length(); i++) {
            // Compare the current character with every vowel in the array
            for (int j = 0; j < vowels.length; j++) {
                // If the current character is a vowel, increase the count and stop checking further vowels
                if (inputString.charAt(i) == vowels[j]) {
                    vowelCount++;
                    break;
                }
            }
        }
        // Display the total number of vowels found in the string
        System.out.println("Total vowels in this string: " + vowelCount);

        // ---------------- Optimal Approach ----------------
        // Instead of comparing each character with every vowel using a nested loop,
        // we can use a switch statement to check vowels directly.
        // This removes the inner loop and keeps the code cleaner.
        //
        // Example:
        // for (int i = 0; i < inputString.length(); i++) {
        //     switch (inputString.charAt(i)) {
        //         case 'a': case 'e': case 'i': case 'o': case 'u':
        //         case 'A': case 'E': case 'I': case 'O': case 'U':
        //             vowelCount++;
        //             break;
        //     }
        // }

    }
}
