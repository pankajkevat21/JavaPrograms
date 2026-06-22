package Array;

public class ArraySquare {
    public static void main(String[] args) {
        int[] arr ={2,5,7,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
