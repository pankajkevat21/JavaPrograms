package Array;

public class KRotate {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};
        int k = 2;

        k = k % arr.length;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, arr.length - 1);

        // Reverse whole array
        reverse(arr, 0, arr.length - 1);

        System.out.println("\n\nLeft Rotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}