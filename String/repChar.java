package String;

public class repChar {
    public static void main(String[] args) {
        String str = "Hello Pankaj";

        char oldChar = 'a';
        char newChar = 'o';

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                result += newChar;
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);
    }
}
