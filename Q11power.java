public class Q11power {
    static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else {
            return x *power(x,n-1);
        }
    }
    public static void main(String[] args) {
        int x = 8, n = 2;
        int result = power(x,n);
        System.out.println(result);
    }
}
