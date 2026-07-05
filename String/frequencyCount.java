package String;

public class frequencyCount {
    public static void main(String[] args) {

        String str = "programming";
        char ch = 'r';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Character '" + ch + "' appears " + count + " time(s).");
    }
}
