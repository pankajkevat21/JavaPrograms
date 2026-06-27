package Array;

public class secondSmall {
    public static void main(String[] args) {

        int[] arr = {2, 10, 4357, 8, 547, 138};

        if (arr.length < 2) {
            System.out.println("Array must contain at least 2 elements.");
            return;
        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }
            else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        if (secondSmall == Integer.MAX_VALUE) {
            System.out.println("Second smallest element does not exist.");
        } else {
            System.out.println("Second smallest element = " + secondSmall);
        }
    }
}