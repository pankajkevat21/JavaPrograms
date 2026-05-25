package Array;

public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {234,4,239,6,236,2,346,4,57,607};

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.print("Array elements: ");

        for(int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Largest element: " + largest);
    }
}