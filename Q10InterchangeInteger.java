public class Q10InterchangeInteger {
    static void swap(int a, int b)
    {
        int swap = a;
        a=b;
        b= swap;
        System.out.println("after swapping a-> "+a+" and b-> "+b);

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before function call:");
        System.out.println("a = " + a + ", b = " + b);

        swap(a, b);   // Call by value

        System.out.println("After function call:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
