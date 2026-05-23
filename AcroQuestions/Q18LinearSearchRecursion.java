package AcroQuestions;

public class Q18LinearSearchRecursion {

        static int linearSearch(int arr[], int index, int target) {

            // Base case
            if (index == arr.length) {
                return -1;
            }

            // Element found
            if (arr[index] == target) {
                return index;
            }

            // Recursive call
            return linearSearch(arr, index + 1, target);
        }

        public static void main(String[] args) {

            int arr[] = {10, 20, 30, 40, 50};
            int target = 40;

            int result = linearSearch(arr, 0, target);

            if (result != -1)
                System.out.println("Element found at index: " + result);
            else
                System.out.println("Element not found");
        }
    }
