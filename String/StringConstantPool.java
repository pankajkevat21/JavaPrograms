package String;

public class StringConstantPool {
    public static void main(String[] args) {
        String s1 = "Pankaj";
        String s2 = "Pankaj";
        System.out.println(s2==s1);
        String s3 = new String("Pankaj");
        System.out.println(s3.equals(s2));

    }
}
