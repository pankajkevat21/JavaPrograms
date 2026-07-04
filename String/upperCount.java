package String;

public class upperCount {
    public static void main(String[] args) {
        String text = "Hello World! Welcome To Java Programming 123";

        int uppercaseCount = 0;
        for (int i = 0; i < text.length(); i++) {
             char ch = text.charAt(i);
             if (ch >= 'A' && ch <= 'Z') {
                 uppercaseCount++;
             }
        }
        System.out.println("Total uppercase letters: " + uppercaseCount);
    }
}
