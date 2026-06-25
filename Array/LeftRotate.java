package Array;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr ={5,10,15,20,25};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int temp =arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
            }
        arr[arr.length - 1] = temp;
        System.out.println("Rotated array:");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
