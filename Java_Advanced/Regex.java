package Java_Advanced;
import  java.util.regex.Matcher;
import  java.util.regex.Pattern;
public class Regex {
    public static void main(String[] args) {
        Pattern pt = Pattern.compile("pankaj kevat",Pattern.CASE_INSENSITIVE);
        Matcher mt = pt.matcher("my name is pankaj");
        boolean mf = mt.find();
        if(mf){
            System.out.println("match found");
        }
        else {
            System.out.println("match not found");
        }
    }
}
