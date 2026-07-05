package String;

public class removeSpace {
    public static void main(String[] args) {
        String str1 = "hello pankaj how are you?";
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                str2.append(str1.charAt(i));
            }
        }

        System.out.println(str2);
    }
}
