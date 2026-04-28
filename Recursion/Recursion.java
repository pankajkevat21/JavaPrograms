public class Recursion {
    public static int callsitself(int n) {
        System.out.println(n);
        if (n == 0) {
            return 0;
        } else {
        callsitself(n - 1);
            System.out.println(n);
            return callsitself(n-1);
        }
    }

    public static void main(String[] args) {
        Recursion sc = new Recursion();
        sc.callsitself(6);
    }
}
