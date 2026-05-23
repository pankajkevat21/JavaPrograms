package AcroQuestions;

public class Q20BinarySearch {

        static int binarySearch(int arr[], int low, int high, int target) {

            // Base Case
            if (low > high) {
                return -1;
            }

            int mid = (low + high) / 2;

            // Element found
            if (arr[mid] == target) {
                return mid;
            }

            // Search left half
            if (target < arr[mid]) {
                return binarySearch(arr, low, mid - 1, target);
            }

            // Search right half
            return binarySearch(arr, mid + 1, high, target);
        }

        public static void main(String[] args) {

            int arr[] = {10, 20, 30, 40, 50, 60, 70};
            int target = 50;

            int result = binarySearch(arr, 0, arr.length - 1, target);

            if (result != -1)
                System.out.println("Element found at index: " + result);
            else
                System.out.println("Element not found");
        }
    }
