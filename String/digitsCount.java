package String;
public class digitsCount {
    public static void main(String[] args) {
        String inputString = "abc123xyz4567";
        int digitCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentCharacter = inputString.charAt(i);

            if (currentCharacter >= '0' && currentCharacter <= '9') {
                digitCount++;
            }
        }
        System.out.println("Total digits: " + digitCount);
    }
}
