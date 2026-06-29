package Array;

public class pairsum {
    public int[] pairMethod(int[] arr, int target, int n) {
        int i = 0;
        while (i < n) {
            int sum = arr[i] + arr[n];
            if (sum == target) {
                return new int[]{i, n};
            }
            if (sum < target) {
                i++;
            }
            else {
                n--;
            }
        }
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
