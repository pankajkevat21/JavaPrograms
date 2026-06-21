package Array;

public class arrayDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,7,8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
