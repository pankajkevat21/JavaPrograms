package Array;

public class RotateArray {
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;

        k = k % arr.length;
        System.out.println(k);

        // Step 1: Reverse full array
        reverse(arr,0,arr.length-1);

        // Step 2: Reverse first k elements
        reverse(arr,0,k-1);

        // Step 3: Reverse remaining elements
        reverse(arr,k,arr.length-1);

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}