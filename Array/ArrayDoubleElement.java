package Array;

public class ArrayDoubleElement {
    public static void main(String[] args) {
        int[] arr ={2,5,7,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
        System.out.println("\nafter double element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
