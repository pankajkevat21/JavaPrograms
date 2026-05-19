package Java_Advanced;
import java.util.ArrayList;
public class Lambdaex {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(8);
        arr.add(9);
        arr.add(1);
       arr.forEach((n)->{
           System.out.println(n);
       });


    }

}
