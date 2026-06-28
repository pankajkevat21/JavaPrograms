package Array;

public class pairsum {
    public int[] pairMethod(int[] arr, int target, int n) {
        // Left pointer starts from the beginning
        int i = 0;

        // Right pointer starts from the last index
        while (i < n) {
            int sum = arr[i] + arr[n];

            // Pair found
            if (sum == target) {
                return new int[]{i, n};
            }

            // Sum is smaller than target, move left pointer forward
            if (sum < target) {
                i++;
            }
            // Sum is greater than target, move right pointer backward
            else {
                n--;
            }
        }

        // No valid pair found
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 11};
        int target = 13;
        int n = arr.length-1;

        pairsum obj = new pairsum();
        int[] result = obj.pairMethod(arr, target,n);

        System.out.println("Index 1: " + result[0]);
        System.out.println("Index 2: " + result[1]);
    }
}
