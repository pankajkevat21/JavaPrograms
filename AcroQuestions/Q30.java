package AcroQuestions;
import  java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {

        System.out.println("Enter student marks:");
        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();
        if(marks>=60){
            System.out.println("First");
        }
        else if(marks>=50 && marks<60){
            System.out.println("Second");
        } else if (marks>=40 && marks<50) {
            System.out.println("Third");
        }
        else {
            System.out.println("Failed");
        }
    }
}
