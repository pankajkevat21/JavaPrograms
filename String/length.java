package String;

public class length {
    public static void main(String[] args) {
        String text = "Hello, World!";
        int length = 0;
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
            length = i+1;
        }
        System.out.println("String length"+length);
    }
}
