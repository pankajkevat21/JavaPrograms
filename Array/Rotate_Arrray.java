package Array;

public class Rotate_Arrray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30 , 40, 50};
        int k =3;
        int len = arr.length-1;
        System.out.println("original array:");
        for(int x: arr){
            System.out.print(x+" ");
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < len; j++) {
                int temp = arr[len];
                arr[len-j] = arr[len-1-j];
                if(j==0){
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Rotated  array:");
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
