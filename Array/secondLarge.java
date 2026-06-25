package Array;

public class secondLarge {
    public static void main(String[] args) {

        int[] arr = {2, 10, 4357, 8, 547, 138};

        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;

                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];

            }

        }

        if (secondLargest == Integer.MIN_VALUE) {

            System.out.println("Second largest element does not exist.");

        } else {

            System.out.println("Second largest element = " + secondLargest);

        }
    }
}