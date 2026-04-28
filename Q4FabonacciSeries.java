public class Q4FabonacciSeries {
    static void faboUsingRecursion(int a, int b,int n){
        int c = a+b;
        if(n==0)
        {
            return;
        }
        System.out.print(c+" ");
        a = b;
        b = c;

        faboUsingRecursion(a,b,n-1);
    }
    public static void main(String[] args) {
        int a =0;
        int b =1;
        int n =7;
        System.out.print(a+" "+b+" ");
        faboUsingRecursion(a,b,n-2);
/*
        int c=0;
        for (int i = 0; i < n-2; i++) {
            c =  a+b;
            a =b;
            b=c;
            System.out.print(c+" ");
            }
*/
        }
    }

