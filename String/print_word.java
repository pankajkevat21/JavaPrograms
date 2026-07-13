package String;

public class print_word {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language.";
        for (int i = 0; i < sentence.length(); i++) {
           if(sentence.charAt(i)!=' '){
               System.out.print(sentence.charAt(i));
           }
           else {
               System.out.println();
           }
        }
    }
}
