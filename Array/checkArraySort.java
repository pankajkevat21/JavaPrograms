package Array;

public class checkArraySort {
    public static void main(String[] args) {
        int[] arr ={2,4,6,7,8};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>=arr[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
