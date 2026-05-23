package AcroQuestions;

public class Q13_pyramidNumber {
    public static void main(String[] args) {

        int rows = 4;

        for(int i = 1; i <= rows; i++) {

            // spaces
            for(int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // increasing numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // decreasing numbers
            for(int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
