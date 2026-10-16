package Array;
public class SliDing {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        // First window ka sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Window ko slide karna
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
    }
}