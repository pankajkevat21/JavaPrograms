public class power {
    public static int power(int x, int n)
    {
        if(n==0)
        {
            return  1;
        }
        if(x==0)
        {
            return  0;
        }
        else {
            return  x * power(x,n-1);
        }
    }
    public static void main(String[] args) {
        int x = 3;
        int n=5;
        int result = power(x,n);
        System.out.println(result);
    }
}