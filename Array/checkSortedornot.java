package Array;

public class checkSortedornot {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30,50, 40, 50};
        boolean check = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                check = false;
                break;
            }
        }
        if(check)
            System.out.println("array is sorted ");
        else
            System.out.println("array is not sorted");
    }
}
