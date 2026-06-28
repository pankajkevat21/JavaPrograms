package Array;

public class thirdLargeElement {
    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 1, 20, 3, 9};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("Third largest element does not exist.");
        } else {
            System.out.println("Third largest element = " + third);
        }
    }
}
