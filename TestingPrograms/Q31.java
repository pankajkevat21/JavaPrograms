package  TestingPrograms;
import java.io.OutputStream;

public class Q31 {
    public static void main(String[] args) {
        String name = "PanKaJ";
        System.out.println("Original String:"+name);
        String opposite ="";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(ch>='a' && ch<='z'){
                opposite+= (char) (ch-32);

            } else if (ch>='A'&& ch<='Z') {
                opposite+= (char) (ch+32);
             }
        }
        System.out.println("\nOpposite String:"+opposite);

    }
}
