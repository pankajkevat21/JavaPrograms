package patterns;

public class hallow {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i <= 2; i++) {
            System.out.print("*");

            for (int j = 0; j <= 2; j++) {
                System.out.print("  ");

            }
            System.out.print(" ");
            System.out.println("*");

        }
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
    }
}
