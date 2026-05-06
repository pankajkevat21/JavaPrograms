package AcroQuestions;

public class Q31 {
    public static void main(String[] args) {
        int num= 2344;
        int sum = 0,digit;
        while (num>0){
            digit = num%10;
            sum = sum + digit;
            num= num/10;
        }
        System.out.println("sum of digit:"+sum);
    }
}
