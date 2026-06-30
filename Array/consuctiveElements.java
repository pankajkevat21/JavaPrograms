package Array;

public class consuctiveElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 14, 20};

        for (int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i + 1] - arr[i];
            System.out.println(arr[i + 1] + " - " + arr[i] + " = " + difference);
        }
    }
}
