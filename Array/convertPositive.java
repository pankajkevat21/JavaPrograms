package Array;

public class convertPositive {
    public static void main(String[] args) {
        int[] arr ={15,-10,20,-3, -5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]<0){
               arr[i] = arr[i]* -1;
           }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
