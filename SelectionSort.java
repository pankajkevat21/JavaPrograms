public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 2, 1, 5};

        System.out.print("Original Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            if (smallest != i) {
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.print("\nSelection Sorted:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}