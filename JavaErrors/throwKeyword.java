package JavaErrors;

public class throwKeyword {
    static  void checkAge(int age)
    {
        if(age<18){
            throw  new ArithmeticException("Access denied-You must be at least 18 years old");
        }
        else {
            System.out.println("Access Granted - You are old enough");
        }

    }
public static void main(String[] args) {
        checkAge(17);
}
}
