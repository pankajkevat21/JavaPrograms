package Array;

public class thirdSmallestElement {
    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 1, 20, 3, 9};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] < third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }

        if (third == Integer.MAX_VALUE) {
            System.out.println("Third smallest element does not exist.");
        } else {
            System.out.println("Third smallest element = " + third);
        }
    }
}
