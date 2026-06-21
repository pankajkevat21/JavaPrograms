package Array;

public class ArrayFirstNLastSwap {
    public static void main(String[] args) {
        int[] arr = {2, 4, 56, 7};
        int n = arr.length - 1;
   int temp = arr[0];
   arr[0] =arr[n];
   arr[n] = temp;
        for (int i = 0; i <=n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}