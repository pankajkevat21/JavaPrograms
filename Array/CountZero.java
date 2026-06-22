package Array;

public class CountZero {
    public static void main(String[] args) {
        int[] arr ={15,10,20,10, -5};
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println("\nTotal zeros:"+count);/*
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        } */
    }
}
