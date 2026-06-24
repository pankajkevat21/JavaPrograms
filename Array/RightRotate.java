package Array;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr ={5,10,15,20,25};
        int size = arr.length;;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        int temp =arr[size-1];
        for (int i = size-1; i>0;i--) {
           arr[i] =arr[i-1];
            }
        arr[0] = temp;


        System.out.println("Rotated array:");
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
