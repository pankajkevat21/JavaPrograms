public class Second {
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
     int x = 5;
     int n=8;
     int result = power(x,n);
        System.out.println(result);
    }
}