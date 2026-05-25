package Array;

public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {234,4,239,6,346,4,57,0};

        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.print("Array elements: ");

        for(int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("smallest element: " + smallest);
    }
}