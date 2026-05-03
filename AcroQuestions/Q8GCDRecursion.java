public class Q8GCDRecursion {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
            int first = 12;
            int second = 18;

            int GCD = gcd(first, second);

            System.out.println("GCD(" + first + "," + second + ") = " + GCD);
        }
      /*  int  first = 12,second = 18;
        int arr1[] = new int[20];
        int arr2[] = new int[20];
        int factor =0,GCD=0;
        for (int i = 1; i <=first; i++) {
            if(first%i==0){
                arr1[factor]=i;
                factor++;
        }
        }
        factor =0;
        for (int i = 1; i <=second; i++) {
            if(second%i==0){
                arr2[factor]=i;
                factor++;
            }
        }
        System.out.print("factor of "+first+":");
        for(int x:arr1)
        {
            if(x!=0)
             System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("factor of "+second+":");
        for(int x:arr2)
        {
            if(x!=0)
                System.out.print(x+" ");
        }

        int size = arr2.length;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                break;
            }

            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == 0) {
                    break;
                }

                if (arr1[i] == arr2[j]) {
                    GCD = arr1[i];
                }
            }
        }
        System.out.println();
        System.out.println("GCD("+first+","+second+")="+GCD);

       */
    }

