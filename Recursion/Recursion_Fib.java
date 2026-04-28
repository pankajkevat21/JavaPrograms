public class Recursion_Fib {
    public  static void fibo(int a, int b, int n)
    {
        if(n==0){
            return;
        }
        else {
            int c = a+b;
            System.out.println(c);
            fibo(b,c,n-1);
        }
    }

   public static void main(String[] args) {
        int a =0;
        int b =1;
       System.out.println(a);
       System.out.println(b);
       int n=17;
       fibo(a,b,n-2);
    }
}
