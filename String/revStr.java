package String;

public class revStr {
    public static void main(String[] args) {
        String str = "Hello World";

        for (int i = str.length()-1; i >=0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
