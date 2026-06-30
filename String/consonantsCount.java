package String;

public class consonantsCount {
    public static void main(String[] args) {
        String inputString = "abcdefghijklmnopqrstuvwxyz";
        int consonantCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            switch (inputString.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    // Vowel - do nothing
                    break;

                default:
                    // Consonant
                    consonantCount++;
                    break;
            }
        }
        System.out.println("Total consonants: " + consonantCount);
    }
}
