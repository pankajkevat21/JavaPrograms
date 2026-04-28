public class Q10InterChangeValue {
    static void SwapValue(int a, int b)
    {
        int c =a;
        a =b;
        b =c;

    }
    public static void main(String[] args) {
   int a =10;
   int b = 20;
        System.out.println(a+" "+b);
        SwapValue(a,b);
        System.out.println(a+" "+b);

    }
}
