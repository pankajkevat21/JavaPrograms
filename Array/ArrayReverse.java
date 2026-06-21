package Array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {2,4,56,7};
        int n = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        for (int i = 0; i <=n ; i++) {

                int temp = arr[i];
                arr[i] =arr[n];
                arr[n]= temp;
                n--;


        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
