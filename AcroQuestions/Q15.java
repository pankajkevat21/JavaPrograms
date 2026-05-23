package AcroQuestions;
import java.util.Scanner;

public class Q15 {
    static String insertSubstring(String mainStr, String subStr, int pos) {
        String firstPart = mainStr.substring(0, pos);
        String secondPart = mainStr.substring(pos);
        return firstPart + subStr + secondPart;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        String result = insertSubstring(mainStr, subStr, pos);
        System.out.println("Final String: " + result);
    }
}
